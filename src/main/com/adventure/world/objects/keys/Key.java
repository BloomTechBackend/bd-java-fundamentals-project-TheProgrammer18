package main.com.adventure.world.objects.keys;

import main.com.adventure.world.objects.Tangible;

/**
 * A key opens a locked door. More specifically, keys work only on doors that share their level.
 * For example, if a key is level 1, it can only open doors that are also level 1.
 * <p>
 * A key's level cannot change once the object is instantiated. You should create the following constructors that take
 * the following parameters:
 * 1. without any inputs (i.e. default parameters)
 * 2. a level (int)
 * 3. a level (int) and a name (string)
 * <p>
 * The default values for a door are level = 1 and name = "key"
 */


public class Key implements Tangible {

    //TODO variable for level and name needed here
    private int level;
    private String name;

    //TODO Add default (i.e. no params) constructor here

    public Key() {
        this.level = 1;
        this.name = "key";
    }

    //TODO add constructor that takes a level, and saves it

    /**
     * @param level
     */
    public Key(int level) {
        this.level = level;
        this.name = "key";

    }

    //TODO add constructor that takes a level and name, and saves it

    /**
     * stores a level and a name
     *
     * @param level
     * @param name
     */
    public Key(int level , String name) {
        this.level = level;
        this.name = name;
    }

    public int getLevel() {
        //TODO Fix this so it references the level property instead of 0
        return this.level;
    }


    public void setLevel(int level) {
        this.level = level;
    }

    public void setName(String name) {
        this.name = name;
    }

    //TODO Fix this so it references the name property instead of "key"
    @Override
    public String getName() {
        return this.name;
    }


    //******IGNORE THE CODE BELOW******//


    @Override
    public Boolean canTake() {
        return true;
    }

    @Override
    public Boolean canUse(Tangible item) {
        return false;
    }

    @Override
    public void useItem(Tangible initiator) { /* intentionally left blank */ }

    @Override
    public void use() {
        System.out.println(getName() + " doesn't much be itself. Try using it on a door");
    }

    @Override
    public String getDescription() {
        return "A key that opens a door";
    }


}
