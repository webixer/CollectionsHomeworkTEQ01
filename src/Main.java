import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Item> inventory = new ArrayList<>();

        // Adding custom items to the inventory
        Item healthPotion = new Item("Health Potion", "Potion", 20);
        Item sword = new Item("Sword", "Weapon", 50);
        Item shield = new Item("Shield", "Armor", 30);
        Item manaElixir = new Item("manaElixir", "consumable", 10);
        Item magicStaff = new Item("Magic Staff", "weapon", 150);
        Item helmet = new Item("Helmet", "Armor", 35);


        inventory.add(healthPotion);
        inventory.add(sword);
        inventory.add(shield);
        inventory.add(manaElixir);
        inventory.add(magicStaff);
        inventory.add(helmet);



        // Displaying inventory items
        for (Item item : inventory) {
            System.out.println(item);
        }


        System.out.println("All Inventory before");

        for (Item item : inventory) {
            System.out.println(item);
        }


        // type of the second item in the inventory "Weapon".
        inventory.get(1);
        System.out.println("Exercise task 2:");
        System.out.println(inventory.get(1).getType());

        //remove an item.
        inventory.remove(index: 3);

        // increase the value of shield.
        System.out.println("Exercise task 3:");
       // shield.setValue(40)
        inventory.set(2, new Item(shield.getName(), shield.getType(), value:));

        for (Item item : inventory) {


    }

}