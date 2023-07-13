
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author seremba
 */
public class ChangeHistory {

    private ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }

    public void add(double status) {
        this.history.add(status);
    }

    public void clear() {
        this.history.clear();
    }

    public String toString() {
        return this.history.toString();
    }

    public double maxValue() {
        double max = 0.0;

        if (this.history.isEmpty()) {
            return 0.0;
        }
        for (Double m : this.history) {
            if (max < m) {
                max = m;
            }
        }
        return max;
    }

    public double minValue() {
        double min = 0.0;
        if (this.history.isEmpty()) {
            return 0.0;
        }

        for (Double m : this.history) {
            if (min > m) {
                min = m;
            }
        }
        return min;
    }

    public double average() {
        double sum = 0;
        for (Double m : this.history) {
            sum += m;
        }
        return sum / this.history.size();
    }
}
