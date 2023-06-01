package game;

import dz_7.game.Unit;

public interface characterActions  {
    public default void attack(Unit target){

        target.takeDamage(attack);

        System.out.println(name+" attack " + target.name + " " );
        target.printInfo();

    }
    public default void defence(){
        defStance= true;
        System.out.println(name+" defence");

    }

    public default void giveFlowers(){
        System.out.println(name + " give flowers");
    }

    public default void beginTurn(){
        System.out.println();
        System.out.println("Character's turn: " + name);
        printInfo();
        defStance=false;

    }
    public default void takeDamage(int amount){
        int actualDefence = defence;
        if (defStance){
            actualDefence *= 1.5f;
        }
        amount -= actualDefence;
        if (amount <0){
            amount = 0;
        }
        health -= amount;
        System.out.println(name + " received " + amount + " units damage");

    }

    public default void cure(int amount){
        health += amount;
        if (health > healthMax){
            health = healthMax;
        }
    }

    public default void printInfo(){
        System.out.println(name + " health: " + health + "/" + healthMax + " attack: " + attack);
    }
}

