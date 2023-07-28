
import java.util.ArrayList;
import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author seremba
 */
public class Pipe<T> {

    private ArrayList<T> values;

    public Pipe() {
        this.values = new ArrayList<>();
    }

    public void putIntoPipe(T value) {
        this.values.add(value);
    }

    public T takeFromPipe() {
        T item = null;
        if (!this.values.isEmpty()) {
            item = this.values.get(0);
            this.values.remove(0);           
        }
        
        return item;

    }

    public boolean isInPipe() {
        return !this.values.isEmpty();
    }
}
