package kg.GeekTech.Game.general;

import kg.GeekTech.Game.players.*;

import java.util.Random;

public class RPG_Game {

    public static Random random = new Random();

    public static void start(){
        Boss boss = new Boss(700,50);

        Warrior warrior = new Warrior(250,15, "Aslan");
        Medic doc = new Medic(230,10,15,"Adil");
        Magic magic = new Magic(260,25,"Ulukbek");
        Berserk berserk = new Berserk(257,15, "Erjan");
        Medic assistant = new Medic(250,15,5,"Alymbek");


        Hero[] heroes = {warrior, doc, magic, berserk, assistant};
        printStatistics(boss, heroes);

        while (!isGameFinish(boss, heroes)){
            round(boss, heroes);
        }
    }

    private static void round(Boss boss, Hero[] heroes){
        if(boss.getHealth()>0){
            bossHits(boss, heroes);

        }
        heroesHit(boss, heroes);
        heroesApplySuperPower(boss, heroes);
        printStatistics(boss, heroes);
    }

    private static void bossHits(Boss boss, Hero[] heroes){
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() >= 0){
                heroes[i].setHealth(heroes[i].getHealth() - boss.getDamage());

            }

        }
    }

    private static void heroesHit(Boss boss, Hero[] heroes){
        for (int i = 0; i < heroes.length; i++) {
            if (boss.getHealth() > 0 && heroes[i].getHealth() > 0){
                boss.setHealth(boss.getHealth() - heroes[i].getDamage());

            }

        }
    }

    private static void heroesApplySuperPower(Boss boss, Hero[] heroes){
        for (int i = 0; i < heroes.length; i++) {
            if (boss.getHealth() > 0 && heroes[i].getHealth() > 0){
                heroes[i].applySuperAbility(boss, heroes);

            }

        }
    }



    private static boolean isGameFinish(Boss boss, Hero[] heroes){
        if(boss.getHealth() <= 0){
            System.out.println("Heroes won!!!");
            return true;
        }
        boolean allHeroesDead = true;
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0){
                allHeroesDead = false;
                break;

            }

        }

        if(allHeroesDead){
            System.out.println("Boss won!!!");
        }
        return allHeroesDead;
    }

    private static void printStatistics(Boss boss, Hero[] heroes){
        System.out.println("____________________");
        System.out.println("Boss health: " + boss.getHealth() + " [" + boss.getDamage() + "]");
        for (int i = 0; i < heroes.length; i++) {
            System.out.println(heroes[i].getName() + "  health: " + heroes[i].getHealth() + " [" + heroes[i].getDamage() + "]");



        }
    }
}
