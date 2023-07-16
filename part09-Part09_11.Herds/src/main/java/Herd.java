
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author seremba
 */
public class Herd implements Movable {

    private ArrayList<Movable> objs;

    public Herd() {
        this.objs = new ArrayList<>();
    }

    @Override
    public void move(int dx, int dy) {
        for(Movable mv: this.objs){
            mv.move(dx, dy);         
        }
    }

    public String toString() {
        String result = "";
        for(Movable mv: this.objs){
            result += mv + "\n";
        }
        return result;
    }

    public void addToHerd(Movable movable) {
        this.objs.add(movable);
    }

}
