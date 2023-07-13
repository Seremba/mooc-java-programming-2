/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author seremba
 */
public class Student extends Person {

    private int count;

    public Student(String name, String adddress) {
        super(name, adddress);
        this.count = 0;
    }

    public void study() {
        this.count += 1;
    }

    public int credits() {
        return count;
    }

    public String toString() {
        return super.toString() + "\n  Study credits " + this.count;
    }
    
}
