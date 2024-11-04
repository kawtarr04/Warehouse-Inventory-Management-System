package challenge4;
import java.util.*;

public class WarehouseInventory {
    private Map<Integer, Product> productMap = new HashMap<>();
    private List<Product> productList = new ArrayList<>();
    private List<List<Integer>> dailyShipments = new ArrayList<>();

    public void addProduct(int id, String name, int quantity) {
        if (productMap.containsKey(id)) {
            System.out.println("Product ID must be unique.");
            return;
        }
        Product product = new Product(id, name, quantity);
        productMap.put(id, product);
        productList.add(product);
        System.out.println("Product added: " + product);
    }

    public void lookupProduct(int id) {
        Product product = productMap.get(id);
        if (product != null) {
            System.out.println("Product found: " + product);
        } else {
            System.out.println("Product with ID " + id + " not found.");
        }
    }

    public void sortProductsByName() {
        productList.sort(Comparator.comparing(p -> p.name));
        System.out.println("Products sorted by name:");
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    public void recordShipment(List<Integer> shipmentProductIds) {
        dailyShipments.add(new ArrayList<>(shipmentProductIds));
        System.out.println("Shipment recorded: " + shipmentProductIds);
    }

    public void printShipment(int shipmentIndex) {
        if (shipmentIndex < 0 || shipmentIndex >= dailyShipments.size()) {
            System.out.println("Invalid shipment index.");
            return;
        }
        List<Integer> shipment = dailyShipments.get(shipmentIndex);
        System.out.println("Shipment " + shipmentIndex + ": " + shipment);
    }
}
