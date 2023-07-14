
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
public class Box implements Packable{

    private double capacity;
    private ArrayList<Packable> items;

    public Box(double capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }

    public void add(Packable item) {
        double sum = weight();
        if (item.weight() + sum <= this.capacity) {
            this.items.add(item);
        }
    }

    public double weight() {
        double sum = 0;
        for (Packable i : this.items) {
            sum += i.weight();
        }
        return sum;
    }

    public String toString() {
        return "Box: " + this.items.size() + " items, total weight " + this.weight()+ " kg";
        //Box: 6 items, total weight 4.0 kg
    }
}
