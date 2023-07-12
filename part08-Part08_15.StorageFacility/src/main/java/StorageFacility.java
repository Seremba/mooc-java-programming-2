
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author seremba
 */
public class StorageFacility {

    private HashMap<String, ArrayList<String>> storage;

    public StorageFacility() {
        this.storage = new HashMap<>();
    }

    public void add(String unit, String item) {
        this.storage.putIfAbsent(unit, new ArrayList<>());
        this.storage.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        return this.storage.getOrDefault(storageUnit, new ArrayList<>());
    }

    public void remove(String storageUnit, String item) {
        if (this.storage.containsKey(storageUnit)) { 
           this.storage.get(storageUnit).remove(item);
        }
        
        if (this.storage.get(storageUnit).isEmpty()) {
            this.storage.remove(storageUnit);
        }


    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> units = new ArrayList<>();
        for (String unit : this.storage.keySet()) {
            units.add(unit);
        }
        return units;
    }
}
