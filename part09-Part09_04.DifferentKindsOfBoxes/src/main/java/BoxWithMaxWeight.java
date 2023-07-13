
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
public class BoxWithMaxWeight extends Box {

    private int capacity;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if (item.getWeight() + totalWeight() <= this.capacity) {
            this.items.add(item);
        }
    }

    private int totalWeight() {
        int sum = 0;
        for (Item item : this.items) {
            sum += item.getWeight();
        }
        return sum;
    }

    @Override
    public boolean isInBox(Item item) {
        for(Item i: this.items){
            if(i.getName().equals(item.getName())){
                return true;
            }
        }
        return false;
    }
}
