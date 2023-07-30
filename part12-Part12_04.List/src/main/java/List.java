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
    private int firstFreeIndex;

    public List() {
        this.values = (T[]) new Object[10];
        this.firstFreeIndex = 0;
    }

    public void add(T value) {
        if (this.firstFreeIndex == this.values.length) {
            grow();
        }
        this.values[firstFreeIndex] = value;
        this.firstFreeIndex++;
    }

    private void grow() {
        int newSize = this.values.length + this.values.length / 2;
        T[] newValues = (T[]) new Object[newSize];
        for (int i = 0; i < newValues.length; i++) {
            newValues[i] = this.values[i];
        }
        this.values = newValues;
    }

    public boolean contains(T value) {
        for (int i = 0; i < this.firstFreeIndex; i++) {
            if (this.values[i].equals(value)) {
                return true;
            }
        }
        return false;
    }

    public void remove(T value) {
        int indexOfvalue = indexOfValue(value);
        if (indexOfvalue < 0) {
            return;
        }
        moveToTheLeft(indexOfvalue);
        this.firstFreeIndex--;
    }

    private int indexOfValue(T value) {
        for (int i = 0; i < this.firstFreeIndex; i++) {
            if (this.values[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

    private void moveToTheLeft(int fromIndex) {
        for (int i = 0; i < this.firstFreeIndex - 1; i++) {
            this.values[i] = this.values[i + 1];
        }
    }
}
