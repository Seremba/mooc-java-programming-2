/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author seremba
 */
public abstract class Animal {

    private String animalName;

    public Animal(String animalName) {
        this.animalName = animalName;
    }

    public void eat() {
        System.out.println(this.animalName + " eats");
    }

    public void sleep() {
        System.out.println(this.animalName + " sleeps");
    }

    public String getAnimalName() {
        return animalName;
    }

}
