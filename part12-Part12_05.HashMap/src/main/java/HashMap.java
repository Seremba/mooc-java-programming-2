/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author seremba
 */
public class HashMap<K, V> {

    private List<Pair<K, V>>[] values;
    private int firstFreeIndex;

    public HashMap() {
        this.firstFreeIndex = 0;
        this.values = new List[32];
    }

}
