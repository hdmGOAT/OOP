public class Fruit extends Item{
    private String type;

    public Fruit(String name, int quantity, String type) {
        super(name, quantity);
        this.type = type;
    }

    public void displayItem() {
        System.out.println("Fruit: " + getName() + " Quantity: " + getQuantity() + " Type: " + type); 
    }
    
}
