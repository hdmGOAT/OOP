public class Weapon extends Item{
    private int damage;
    private int durability;
    
    public Weapon(String name, int quantity, int damage, int durability) {
        super(name, quantity);
        this.damage = damage;
        this.durability = durability;
    }
    
    public int getDamage() {
        return damage;
    }
    
    public int getDurability() {
        return durability;
    }

    public void displayItem() {
        System.out.println("Weapon: " + getName() + " Quantity: " + getQuantity() + " Damage: " + damage + " Durability: " + durability); 
    }
}
