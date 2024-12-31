import java.util.ArrayList;


public class Inventory {

    private ArrayList<Item> items;

    public Inventory() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void printInventory() {
        for (Item item : items) {
            System.out.println(item.getName() + ": " + item.getQuantity());
        }
    }

    public void removeItem(String name) {
        for (Item item : items) {
            if (item.getName().equals(name)) {
                items.remove(item);
                break;
            }
        }
    }
}
