package kg.GeekTech.Game.players;

import kg.GeekTech.Game.general.RPG_Game;

import java.util.Random;

public class Magic extends Hero {

    public Magic(int health, int damage, String name) {
        super(health, damage, SuperAbility.BOOST, name);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        int player2 = RPG_Game.random.nextInt(25);
        for (int i = 0; i < heroes.length; i++) {
            heroes[i].setDamage(heroes[i].getDamage() + player2);

        }
        System.out.println(this.getName() + " increases attacks: " + player2);


    }
}
