
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author seremba
 */
public class Employees {
    
    private List<Person> employess;
    
    public Employees() {
        this.employess = new ArrayList<>();
    }
    
    public void add(Person personToAdd) {
        this.employess.add(personToAdd);
    }
    
    public void add(List<Person> peopleToAdd) {
        this.employess.addAll(peopleToAdd);
    }
    
    public void print() {
        Iterator<Person> iterator = employess.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    
    public void print(Education education) {
        Iterator<Person> iterator = employess.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getEducation().equals(education)) {
                System.out.println(iterator.next());
            }
        }
    }

    public void fire(Education education) {
        Iterator<Person> iterator = employess.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getEducation().equals(education)) {
                iterator.remove();
            }
        }
    }
}
