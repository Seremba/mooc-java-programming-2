
public class Main {

    public static void main(String[] args) {
        // Test your app here

        Warehouse warehouse = new Warehouse();
        warehouse.addProduct("milk", 3, 10);
        warehouse.addProduct("coffee", 5, 6);
        warehouse.addProduct("buttermilk", 2, 20);
        warehouse.addProduct("yogurt", 2, 20);

        System.out.println("products:");

        for (String product : warehouse.products()) {
            System.out.println(product);
        }
    }
}
