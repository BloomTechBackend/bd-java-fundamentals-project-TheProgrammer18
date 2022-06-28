package main.com.adventure.world.objects.keys;

import main.com.adventure.world.objects.Tangible;
import main.com.adventure.world.objects.doors.OmniDoor;

import java.util.Arrays;

public class OmniKey implements Tangible {

    private static final int pinLength = 5;
    public boolean[] pins = new boolean[pinLength];

    /**
     * A key that can be used with the OmniDoor.
     */
    public OmniKey() {
        Arrays.fill(pins , false);
    }

    /**
     * The only item the OmniKey can be used with is an OmniDoor. When the OmniKey receives an OmniDoor, this method
     * needs to configure the key to the OmniDoor, making the OmniKey become a valid key for the door.
     * Note that this does NOT unlock the door; it merely configures the key so it can unlock the door in the future.
     *
     * @param door - If it's an OmniDoor, this key will configure itself to it. Otherwise, inform the user
     *             that this key can only be used with OmniDoors and do nothing more.
     */
    @Override
    public void useItem(Tangible door) {
        //wants me to change an ordinary key to an OmniKey if there is an OmniDoor
        //1a) check if the door is an OmniDoor
        //  1b) if door is an OmniDoor configure the ordinary key to an OmniKey
        //  1c) if not an OmniDoor inform the user that this key can only be used with OmniDoors and end the method
        //questions:
        //1) it says the key will configure itself if not then return a message to the user but if the key will
        // automatically change to an Omnikey then what is supposed to be put in this if statement.
        //1a) or in the if statment are we supposed to call the methods getName, getDescription, canTake, and canUse
        if (door instanceof OmniDoor) {
            for (int i = 0; i < pinLength; i++) {
                pins[i] = ((OmniDoor) door).getPins()[i];
            }
        } else {
            System.out.println("this key can only be used with OmniDoors.");
        }


    }

    @Override
    public String getName() {
        return "OmniKey";
    }

    @Override
    public String getDescription() {
        return "A key with adjustable pins for teeth";
    }

    @Override
    public Boolean canTake() {
        return true;
    }

    @Override
    public Boolean canUse(Tangible item) {
        return item instanceof OmniDoor;
    }

    @Override
    public void use() {

    }
}
