public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
       
        Fruit fruit = new Fruit("Apple", 100, "Fuji");
        inventory.addItem(fruit);

        Weapon weapon = new Weapon("Sword", 1, 10, 100);
        inventory.addItem(weapon);

        inventory.printInventory();
    }
}
