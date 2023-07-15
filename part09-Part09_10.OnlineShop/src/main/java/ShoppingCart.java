
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author seremba
 */
public class ShoppingCart {
    Map<String, Item> items;

    public ShoppingCart() {
        this.items = new HashMap<>();
    }
    public void add(String product, int price) {
        Item item = new Item(product, 0, price);
        this.items.putIfAbsent(product, item);
        this.items.get(product).increaseQuantity();
    }
    public int price(){
        int price = 0;
        for(Item item: this.items.values()){
            price += item.price();
        }
        return price;
    }
}
