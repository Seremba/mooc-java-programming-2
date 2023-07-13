/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author seremba
 */
public class ProductWarehouseWithHistory extends ProductWarehouse {

    private ChangeHistory history;
    

    public ProductWarehouseWithHistory(String name, double capacity, double initialBalance) {
        super(name, capacity);
        this.history = new ChangeHistory();
        this.history.add(initialBalance);
        super.setBalance(initialBalance);
    }

    public String history() {
        return this.history.toString();
    }
    public void addToWarehouse(double amount){
        super.addToWarehouse(amount);
        this.history.add(getBalance());
    }
    public double takeFromWarehouse(double amount){
        double taken = super.takeFromWarehouse(amount);
        this.history.add(getBalance());
        return taken;
    }

}
