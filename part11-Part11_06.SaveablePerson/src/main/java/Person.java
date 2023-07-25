/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author seremba
 */
public class Person implements Saveable{
   private String name; 
   private String address;

    @Override
    public void save() {
         System.out.println("Save");
    }

    @Override
    public void delete() {
         System.out.println("Delete");
    }

    @Override
    public void load(String address) {
        System.out.println("Address " + address);
    }
}
