package dz_2.tasks.listOfAnimals;

import dz_2.tasks.WildAnimal;

public class Wolf implements WildAnimal {
    public String leaderOfThePack;
    public Wolf(String leaderOfThePack){
        this.leaderOfThePack = leaderOfThePack;
    }
    @Override
    public int height() {
        return 100;
    }

    @Override
    public int weight() {
        return 80;
    }

    @Override
    public String colorEyes() {
        return "black";
    }

    @Override
    public void makeSound() {
        System.out.println("Ayyyyyyyy");

    }

    @Override
    public void displayInfo() {

    }

    @Override
    public String habitat() {
        return "forests of Europe";
    }

    @Override
    public String dateOfFinding() {
        return "2015";
    }
    public String getLeaderOfThePack(){
        return "This wolf is leader";
    }
    @Override
    public String toString() {
        String s = new StringBuilder().append("Animal - VOLF have got a height ").append(height()).append(", a weight ").append(weight()).append(", color of eyes ").append(colorEyes()).append(", habitat ").append(habitat()).append(", date od finding ").append(dateOfFinding()).append(getLeaderOfThePack()).toString();
        return s;

    }
}
