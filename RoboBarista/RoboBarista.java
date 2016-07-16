import java.util.*;

public class RoboBarista{
    
    HashMap<String, Double> inventoryUnits = inventoryUnitsMapGen();
    HashMap<String, Double> inventoryCosts = inventoryCostsMapGen();
    HashMap<String, HashMap<String, Double>> menuInventory = menuInventoryGen();

    // returns array list of ingredients
    private static ArrayList<String> inventoryItems() {
        ArrayList<String> inventory = new ArrayList<String>();
        inventory.add("coffee");
        inventory.add("decafCoffee");
        inventory.add("sugar");
        inventory.add("cream");
        inventory.add("steamedMilk");
        inventory.add("foamedMilk");
        inventory.add("espresso");
        inventory.add("cocoa");
        inventory.add("whippedCream");
        return inventory;
    }
    
    // 
    private static ArrayList<String> menuItems() {
        ArrayList<String> menu = new ArrayList<String>();
        menu.add("coffee");
        menu.add("caffeAmericano");
        menu.add("decafCoffee");
        menu.add("caffeLatte");
        menu.add("cappuccino");
        menu.add("caffeMocha");
        return menu;
    }
    
    private static HashMap<String, Double> inventoryUnitsMapGen() {
        HashMap<String, Double> inventoryUnitsMap = new HashMap<String, Double>();
        ArrayList<String> inventoryArray = inventoryItems();
        for ( String item : inventoryArray ) {
            inventoryUnitsMap.put(item, 10.0);
        }
        return inventoryUnitsMap;
    }
    
    private static HashMap<String, Double> inventoryCostsMapGen() {
        HashMap<String, Double> inventoryCostsMap = new HashMap<String, Double>();
        inventoryCostsMap.put("coffee", 0.75);
        inventoryCostsMap.put("decafCoffee", 0.75);
        inventoryCostsMap.put("sugar", 0.25);
        inventoryCostsMap.put("cream", 0.25);
        inventoryCostsMap.put("steamedMilk", 0.35);
        inventoryCostsMap.put("foamedMilk", 0.35);
        inventoryCostsMap.put("espresso", 0.75);
        inventoryCostsMap.put("cocoa", 0.90);
        inventoryCostsMap.put("whippedCream", 1.00);
        return inventoryCostsMap;
    }
    
    private static HashMap<String, HashMap<String, Double>> menuInventoryGen() {
        HashMap<String, HashMap<String, Double>> menuInventory = new HashMap<String, HashMap<String, Double>>();
        ArrayList<String> menu = menuItems();
        for (String item : menu) {
            HashMap<String, Double> itemIngredients = new HashMap<String, Double>();
            menuInventory.put(item, itemIngredients);
        }
        // { coffee: { coffee: 3, sugar: 1, cream: 1 } }
        menuInventory.get("coffee").put("coffee", 3.0);
        menuInventory.get("coffee").put("sugar", 1.0);
        menuInventory.get("coffee").put("cream", 1.0);
        
        // { decafCoffee: { decafCoffee: 3, sugar: 1, cream: 1 } }
        menuInventory.get("decafCoffee").put("decafCoffee", 3.0);
        menuInventory.get("decafCoffee").put("sugar", 1.0);
        menuInventory.get("decafCoffee").put("cream", 1.0);
        
        // { caffeLatte: { espresso: 2, steamedMilk: 1 } }
        menuInventory.get("caffeLatte").put("espresso", 2.0);
        menuInventory.get("caffeLatte").put("steamedMilk", 1.0);
        
        // { caffeAmericano: { espresso: 3 } }
        menuInventory.get("caffeAmericano").put("espresso", 3.0);
        
        // { caffeMocha: { espresso: 1, cocoa: 1, steamedMilk: 1, whippedCream: 1 } }
        menuInventory.get("caffeMocha").put("espresso", 1.0);
        menuInventory.get("caffeMocha").put("cocoa", 1.0);
        menuInventory.get("caffeMocha").put("steamedMilk", 1.0);
        menuInventory.get("caffeMocha").put("whippedCream", 1.0);
        
        // { cappuccino: { espresso: 2, steamedMilk: 1, foamedMilk: 1 } }
        menuInventory.get("cappuccino").put("espresso", 2.0);
        menuInventory.get("cappuccino").put("steamedMilk", 1.0);
        menuInventory.get("cappuccino").put("foamedMilk", 1.0);
        
        return menuInventory;
    }
    
     public static void main(String []args)
     throws java.io.IOException
     {
        // System.out.println(menuInventoryGen());
        Scanner scanner = new Scanner(System.in);
        String userIn = scanner.nextLine();
        System.out.println("Hello, " + userIn + "!");
     }
}
