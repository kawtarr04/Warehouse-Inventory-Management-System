package challenge4;
import java.util.*;
class Main {
public static void main(String[] args) {
    WarehouseInventory inventory = new WarehouseInventory();

    inventory.addProduct(201, "Smartphone", 20);
    inventory.addProduct(202, "Tablet", 35);
    inventory.addProduct(203, "Headphones", 60);

    inventory.lookupProduct(202);

    inventory.sortProductsByName();

    List<Integer> shipment1 = Arrays.asList(201, 203);
    inventory.recordShipment(shipment1);

    List<Integer> shipment2 = Arrays.asList(202, 201);
    inventory.recordShipment(shipment2);

    inventory.printShipment(0);
    inventory.printShipment(1);
}
}