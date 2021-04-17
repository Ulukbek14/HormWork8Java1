package kg.GeekTech.Game.players;

import kg.GeekTech.Game.general.RPG_Game;

import java.util.Random;

public class Warrior extends Hero {

    public Warrior(int health, int damage, String name) {
        super(health, damage, SuperAbility.CRITICAL_DAMAGE, name);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        int coeff = RPG_Game.random.nextInt(5) + 2; // 2,3,4,5,6
        boss.setHealth(boss.getHealth() - coeff * this.getDamage());
        System.out.println(this.getName() + " hits critically: " + coeff * this.getDamage());
    }
}
