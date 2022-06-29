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
    private int level;
    private String name;

    /**
     * sets the default values of level and name to 1 and key.
     */
    public Key() {
        this.level = 1;
        this.name = "key";
    }


    /**
     * takes in the parameter level and changes the default value of level(1) to the parameter level.
     * @param level the level the key should be.
     */
    public Key(int level) {
        this.level = level;
        this.name = "key";

    }

    /**
     * stores a level and a name using the parameters level and name.
     * @param level the level the key should be.
     * @param name the new name of the key.
     */
    public Key(int level , String name) {
        this.level = level;
        this.name = name;
    }

    public int getLevel() {
        return this.level;
    }


    public void setLevel(int level) {
        this.level = level;
    }

    public void setName(String name) {
        this.name = name;
    }

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
