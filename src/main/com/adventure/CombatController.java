package main.com.adventure;

import main.com.adventure.player.Player;
import main.com.adventure.settings.CommandVerb;
import main.com.adventure.world.Monster;

public class CombatController {

    private Player player;
    private Monster monster;

    /**
     * Processes a combat situation between the player and a monster.
     * @param player - the game's player.
     * @param monster - the monster who the player is trying to defeat.
     */
    public CombatController(Player player, Monster monster) {
        this.player = player;
        this.monster = monster;
    }

    /**
     * Runs through the combat of the player and monster until either the monster's
     * or the player's health is 0. The player always goes first.
     */
    public void autosimulateCombat() {
        /*
        while player.gethealth > 0 || monster.gethealth > 0
        double monsterPower = Monster.getpower();
        double playerPower = Player.getPower();
        double monsterHealth = Monster.gethealth;
        double playerHealth = player.gethealth;
        playerHealth -= monsterPower;
        monsterHealth -= playerPower;
         */



    }

    public boolean isPlayerDefeated() {
       /*
        if (autosimulateCombat() ?? )
        if player.gethealth == 0
         return true;
        else return false
        OR
        if (player.gethealth == 0) {
        return true;
        } else {
        return false;
        }
        */

        return true;


    }

    /**
     * Resets the health of the monster and player back to 10.
     */
    public void reset() {

    }
}
