/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author seremba
 */
public class AverageSensor implements Sensor {

    private ArrayList<Sensor> sensors;
    private ArrayList<Integer> readings;

    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
    }

    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);
    }

    @Override
    public boolean isOn() {
        boolean isOn = false;
        for (Sensor s : this.sensors) {
            if (s.isOn() == true) {
                isOn = true;
            } else {
                isOn = false;
                break;
            }
        }
        return isOn;
    }

    @Override
    public void setOn() {
        for (Sensor s : this.sensors) {
            s.setOn();
        }
    }

    @Override
    public void setOff() {
        for (Sensor s : this.sensors) {
            s.setOff();
        }
    }

    @Override
    public int read() {
        if (isOn() && !this.sensors.isEmpty()) {
            int sum = 0;
            for (Sensor s : this.sensors) {
                sum += s.read();
            }
            int average = sum / this.sensors.size();
            this.readings.add(average);
            return average;
        } else {
            throw new IllegalArgumentException();
        }

    }

    public List<Integer> readings() {
        return this.readings;
    }

}
