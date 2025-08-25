package vendingmachine.entity;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Map<String, Integer> itemStock = new HashMap<>();

    public void addItem(String itemName, Integer quantity) {
        itemStock.put(itemName, quantity);
    }

    public void removeItem(String itemName) {
        itemStock.remove(itemName);
    }

    public Integer getItem(String itemName) {
        return itemStock.getOrDefault(itemName,  0);
    }

}
