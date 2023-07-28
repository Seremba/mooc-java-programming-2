
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
        if (this.values.isEmpty()) {
            return null;
        }
        Iterator<T> iterator = values.iterator();

        T value = null;
        while (iterator.hasNext()) {
            value = iterator.next();
            iterator.remove();
        }
        return value;
    }

    public boolean isInPipe() {

        for (T value : this.values) {
            if (this.values.contains(value)) {
                return true;
            }
        }

        return false;
    }
}
