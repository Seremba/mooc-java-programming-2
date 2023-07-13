/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author seremba
 */
public class Person {
    private String name;
    private String adddress;

    public Person(String name, String adddress) {
        this.name = name;
        this.adddress = adddress;
    }
    public String toString(){
        return this.name + "\n  " + this.adddress;
    }
}
