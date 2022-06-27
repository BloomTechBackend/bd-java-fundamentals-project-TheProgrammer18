package main.com.adventure.player;

import main.com.adventure.world.objects.Tangible;

/**
 * Stores any Tangible item up to the MAX_CAPACITY.
 */
public class Backpack {

    private static final int MAX_CAPACITY = 5;


    private final Tangible[] items = new Tangible[MAX_CAPACITY];

    /**
     * Adds an item to the backpack array only if there's an empty space in the array.
     * @param item - item to add to the backpack array.
     * @return - true if the item is added. Otherwise, false.
     */
    public boolean addItem(Tangible item) {

        int i = 0;
        for (; i < items.length; i++) {
            if(items[i] == null) {
                items[i] = item;
            }
        }

        return items[i] != null && items[i] == item;
    }

    /**
     * Checks each backpack item's name to see if it matches the given name.
     * @param name - the name of the item to search for.
     * @return - the item if it exists. Otherwise, null.
     */
    public Tangible getItem(String name) {
        for (int i = 0; i < items.length; i++) {
            if (items[i].equals(name)) {
               return items[i];
            } else {
                return null;
            }
        }
        return null;
    }

    /**
     * Checks if the given item exists in the backpack based on the item's name, and removes the item if it's found.
     * @param item - item to remove
     * @return - true if the item was removed. Otherwise, false.
     */
    public boolean removeItem(Tangible item) {
        for (int i = 0; i < items.length; i++) {
            return items[i].equals((item.getName()));
        }
        return false;
    }

    /**
     * Prints the contents of the backpack. Before printing the contents, the following line should
     * be printed:
     *
     *          "Here are the items in your backpack:"
     *
     * Then each item should be printed with " - " before it.
     */
    public void printItems() {
        StringBuilder itemNames = new StringBuilder("Here are the items in your backpack:");
        for (int i = 0; i < items.length; i++) {
            System.out.println(itemNames.append(" - ").append(items));
        }
    }

    public Tangible[] getItems() {
        return items;
    }
}
