/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author seremba
 */
public class List<T> {

    private T[] values;
    private int emptyIndex;

    public List() {
        this.values = (T[]) new Object[10];
        this.emptyIndex = 0;
    }

    public void add(T value) {
        if (this.emptyIndex == this.values.length) {
            grow();
        }
        this.values[emptyIndex] = value;
        this.emptyIndex++;
    }

    private void grow() {
        int newSize = this.values.length + this.values.length / 2;
        T[] newValues = (T[]) new Object[newSize];
        for (int i = 0; i < newValues.length; i++) {
            newValues[i] = this.values[i];
        }
        this.values = newValues;
    }
}
