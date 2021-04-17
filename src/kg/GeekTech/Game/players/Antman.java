package kg.GeekTech.Game.players;

import kg.GeekTech.Game.general.RPG_Game;

import java.util.Random;

public class Antman extends Hero {

    public Antman(int health, int damage, String name) {
        super(health, damage, SuperAbility.INCREASE_DECREASE, name);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        int f = this.getHealth();
        int g = this.getDamage();
        int c = RPG_Game.random.nextInt(5);
        boolean player3 = RPG_Game.random.nextBoolean();
        if (player3){
            this.setHealth(getHealth() * c);
            this.setDamage(getDamage() * c);
            System.out.println("Increased:");
        }
        else {
            this.setHealth(f);
            this.setDamage(g);
            System.out.println("Returned to original size:");
        }
    }
}
