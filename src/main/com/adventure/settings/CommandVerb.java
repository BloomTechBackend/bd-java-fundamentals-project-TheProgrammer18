package main.com.adventure.settings;

import com.amazonaws.services.dynamodbv2.xspec.M;

import java.util.Objects;

/**
 * Sprint 3 Module 1
 * This CommandVerb will be used instead of strings once we've learned about Enums.
 */

public enum CommandVerb {
    TAKE,
    MOVE,
    USE,
    DIG,
    EXAMINE,
    LOOK,
    INVALID,
    HELP,
    //Used in Sprint 3 Module 2
    FIGHT,
    //Used in Sprint 3 Module 3
    INVENTORY;


    /**
     * Takes verbString to determine and return the associated CommandVerb.
     * @param verbString - the verb from the user input
     * @return - the CommandVerb associated with the given input.
     */
    public static CommandVerb getVerb(String verbString) {
        CommandVerb verb;
        switch (verbString.toUpperCase()) {
            case "TAKE":
                verb = TAKE;
                break;
            case "MOVE":
                verb = MOVE;
                break;
            case "USE":
                verb = USE;
                break;
            case "DIG":
                verb = DIG;
                break;
            case "EXAMINE":
                verb = EXAMINE;
                break;
            case "LOOK":
                verb = LOOK;
                break;
            case "HELP":
                verb = HELP;
                break;
            default:
                verb = INVALID;
                break;
        }
        return verb;
    }




}
