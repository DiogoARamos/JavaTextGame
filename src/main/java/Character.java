import java.util.*;

public class Character {
    private ArrayList<Items> inventory;
    private int healthPoints;
    private int attackPoints;
    private int defencePoints;

    Character() {
        inventory = new ArrayList<>(10);
        healthPoints = 100;
        attackPoints = 15;
        defencePoints = 10;
    }

    Character(ArrayList<Items> items, int hp, int ap, int dp) {
        inventory = items;
        healthPoints = hp;
        attackPoints = ap;
        defencePoints = dp;
    }

    public void attackMonster() {

    }
}
