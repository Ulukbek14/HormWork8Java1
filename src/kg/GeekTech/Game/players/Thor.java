package kg.GeekTech.Game.players;

import kg.GeekTech.Game.general.RPG_Game;

public class Thor extends Hero {

    public Thor(int health, int damage, String name) {
        super(health, damage, SuperAbility.STUNS, name);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        int bossDamage = boss.getDamage();
        boolean player5 = RPG_Game.random.nextBoolean();
        if(player5){
            for (int i = 0; i < heroes.length; i++) {
                heroes[i].setHealth(heroes[i].getHealth() + boss.getDamage());
                heroes[i].setHealth(heroes[i].getHealth() - boss.getDamage() / 5);

            }
            System.out.println("Thor stuns the boss");
        }



    }
}
