
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author seremba
 */
public class Warehouse {

    private Map<String, Integer> productsPrice;
    private Map<String, Integer> productsStock;

    public Warehouse() {
        this.productsPrice = new HashMap<>();
        this.productsStock = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        this.productsPrice.put(product, price);
        this.productsStock.put(product, stock);
    }

    public int price(String product) {
        if (!productsPrice.containsKey(product)) {
            return -99;
        }
        return this.productsPrice.get(product);
    }
    public int stock(String product){
        if (!productsStock.containsKey(product)) {
            return 0;
        }
        return this.productsStock.get(product);
    }
    public boolean take(String product) {
        if(!this.productsStock.containsKey(product)){
            return false;
        }
        int stock = this.productsStock.get(product);
        if(this.productsStock.get(product) >= 1) {
            int item = this.productsStock.get(product);
            this.productsStock.put(product, item-1);
            return true;
        }
        return false;
    }
    
    public Set<String> products() {
        return this.productsPrice.keySet();
    }
   
}
