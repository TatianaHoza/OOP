package dz_2.tasks.listOfAnimals;

import dz_2.tasks.WildAnimal;

public class Tiger implements WildAnimal {
    @Override
    public int height() {
        return 100;
    }

    @Override
    public int weight() {
        return 110;
    }

    @Override
    public String colorEyes() {
        return "blue";
    }

    @Override
    public void makeSound() {
        System.out.println("Rrrrrrrr");

    }

    @Override
    public void displayInfo() {

    }

    @Override
    public String habitat() {
        return "South Africa";
    }

    @Override
    public String dateOfFinding() {
        return "2018";
    }

    @Override
    public String toString() {
        String s = new StringBuilder().append("Animal - TIGER have got a height ").append(height()).append(", a weight ").append(weight()).append(", color of eyes ").append(colorEyes()).append(", habitat ").append(habitat()).append(", date od finding ").append(dateOfFinding()).toString();
        return s;

    }
}

