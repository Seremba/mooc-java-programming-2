/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author seremba
 */
public class Dog extends Animal {

    public Dog(String animalName) {
        super(animalName);
    }
    public Dog(){
        this("Dog");
    }
    public void bark(){
        System.out.println(this.getAnimalName() + " barks");
    }

}
