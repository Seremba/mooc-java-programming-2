
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
public class Hideout<T> {

    private ArrayList<T> hideout;

    public Hideout() {
        this.hideout = new ArrayList<>();
    }

    public void putIntoHideout(T toHide) {
        this.hideout.add(toHide);
    }

    public T takeFromHideout() {
        if (this.hideout.isEmpty()) {
            return null;
        }

        Iterator<T> iterator = hideout.iterator();
        T toRemove = null;
        while (iterator.hasNext()) {
            toRemove = iterator.next();
            iterator.remove();
        }
        return toRemove;
    }

    public boolean isInHideout() {
        for (T inHideOut : this.hideout) {
            if (this.hideout.contains(inHideOut)) {
                return true;
            }
        }
        return false;
    }
}
