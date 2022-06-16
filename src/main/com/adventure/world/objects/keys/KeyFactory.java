package main.com.adventure.world.objects.keys;

import java.util.logging.Level;

public class KeyFactory {

    /**
     * Creates a key based on the given params.
     * @param level - the key's level
     * @param name - the key's name
     * @return a key
     */
    public static Key buildKey(int level, String name) {
        //TODO Pass level and name into the key constructor when the proper constructor is built
        Key key = new Key();
        key.setName(name);
        key.setLevel(level);



        return key;
    }
}
