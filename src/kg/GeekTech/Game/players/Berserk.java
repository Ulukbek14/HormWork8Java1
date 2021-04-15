package kg.GeekTech.Game.players;

import kg.GeekTech.Game.general.RPG_Game;

import java.util.Random;

public class Berserk extends Hero {

    public Berserk(int health, int damage , String name) {
        super(health, damage, SuperAbility.SAVE_DAMAGE_AND_REVERT, name);

    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        int player1 = RPG_Game.random.nextInt(50);
        boss.setHealth(boss.getHealth() - player1);
        System.out.println(this.getName() + " returns some of the damage to the boss: " + player1);
    }
}
