/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

/**
 *
 * @author seremba
 */
public class TemperatureSensor implements Sensor {

    private boolean sensor;

    public TemperatureSensor() {
        this.sensor = false;
    }

    @Override
    public boolean isOn() {
        return this.sensor;
    }

    @Override
    public void setOn() {
        if (!sensor) {
            this.sensor = true;
        }

    }

    @Override
    public void setOff() {
        if (sensor) {
            this.sensor = false;
        }

    }

    @Override
    public int read() {
        if (sensor) {
            Random rand = new Random();
            int temp = 30 - (-30) + 1;

            return rand.nextInt(temp) + (-30);
        } else {
            throw new IllegalArgumentException("error reaging temp sens");
        }
    }

}
