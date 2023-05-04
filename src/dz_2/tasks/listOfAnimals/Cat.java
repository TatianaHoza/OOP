package dz_2.tasks.listOfAnimals;

import dz_2.tasks.Pets;

public class Cat implements Pets {

    public String presenceOfWool;

    public Cat(String presenceOfWool) {
        this.presenceOfWool = presenceOfWool;
    }

    @Override
    public int height() {
        return 40;
    }

    @Override
    public int weight() {
        return 10;
    }

    @Override
    public String colorEyes() {
        return "green";
    }

    @Override
    public void makeSound() {
        System.out.println("Mur-mur");

    }

    @Override
    public void displayInfo() {

    }


    @Override
    public String name() {
        return "Barsik";
    }

    @Override
    public String breed() {
        return "Persidskiy";
    }

    @Override
    public String vaccinations() {
        return "vaccination yes";
    }

    @Override
    public String coatColor() {
        return "grey";
    }

    @Override
    public String dateOfBD() {
        return "12.12.12";
    }

    @Override
    public Object showAffection() {
        return "like affection";
    }

    public String getPresenceOfWool() {
        return "wool yes";
    }

    @Override
    public String toString() {
        String s = new StringBuilder().append("Animal - CAT have got a height ").append(height()).append(", a weight ").append(weight()).append(", color of eyes ").append(colorEyes()).append(", name ").append(name()).append(", breed ").append(breed()).append(vaccinations()).append(" , coat color ").append(coatColor()).append("date of BD ").append(dateOfBD()).append(showAffection()).append(getPresenceOfWool()).toString();
        return s;

    }
}
