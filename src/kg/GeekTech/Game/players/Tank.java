package kg.GeekTech.Game.players;

import kg.GeekTech.Game.general.RPG_Game;

public class Tank extends Hero {

    public Tank(int health, int damage, String name) {
        super(health, damage, SuperAbility.POWER_MAN, name);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            this.setHealth(this.getHealth() - boss.getDamage() / 5);
            heroes[i].setHealth(heroes[i].getHealth() + boss.getDamage() / 5);

        }
        System.out.println(this.getName() + " takes some of the damage: ");
    }
}






