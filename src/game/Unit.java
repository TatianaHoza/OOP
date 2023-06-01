package game;

public class Unit {
    private String name;
    private int health;
    private int healthMax;
    private int attack;

    private int defence;
    private boolean defStance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Unit(String name, int healthMax, int attack, int defence) {
        this.name = name;
        this.healthMax = healthMax;
        this.health = healthMax;
        this.attack = attack;
        this.defence = 1;
    }

    public  void attack(Unit target){

        target.takeDamage(attack);

        System.out.println(name+" attack " + target.name + " " );
        target.printInfo();

    }
    public  void defence(){
        defStance= true;
        System.out.println(name+" defence");

    }

    public  void giveFlowers(){
        System.out.println(name + " give flowers");
    }

    public  void beginTurn(){
        System.out.println();
        System.out.println("Character's turn: " + name);
        printInfo();
        defStance=false;

    }
    public  void takeDamage(int amount){
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

    public  void cure(int amount){
        health += amount;
        if (health > healthMax){
            health = healthMax;
        }
    }

    public  void printInfo(){
        System.out.println(name + " health: " + health + "/" + healthMax + " attack: " + attack);
    }
}
