package game;

import dz_7.game.Unit;

public class Main {
    public static void main(String[] args) {


        dz_7.game.Unit hero = new dz_7.game.Unit("Tanya", 10, 2, 5);

        dz_7.game.Unit monster = new Unit("Goblin",15,5,3);

        hero.beginTurn();
        hero.attack(monster);


        monster.beginTurn();
        monster.attack(hero);


        System.out.println("The hero walks through the dungeon and stepped into a trap");
        hero.takeDamage(1);




    }
}

