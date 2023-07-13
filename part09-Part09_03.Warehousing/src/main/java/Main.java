
public class Main {

    public static void main(String[] args) {
        // here you can write code to test your classes
        ProductWarehouse juice = new ProductWarehouse("Juice", 1000.0);
        juice.addToWarehouse(1000.0);
        juice.takeFromWarehouse(11.3);
        System.out.println(juice.getName()); // Juice
        System.out.println(juice);
    }

}
