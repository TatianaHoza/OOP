package dz_2.tasks.listOfAnimals;

import dz_2.tasks.Pets;

public class Dog implements Pets {
    public String presenceOfTraining;
    public Dog(String presenceOfTraining){
        this.presenceOfTraining = presenceOfTraining;
    }
    @Override
    public int height() {
        return 60;
    }

    @Override
    public int weight() {
        return 50;
    }

    @Override
    public String colorEyes() {
        return "grey";
    }

    @Override
    public void makeSound() {
        System.out.println("Gay");

    }

    @Override
    public void displayInfo() {

    }

    @Override
    public String name() {
        return "Durk";
    }

    @Override
    public String breed() {
        return "Ovcharca";
    }

    @Override
    public String vaccinations() {
        return "vaxxination no";
    }

    @Override
    public String coatColor() {
        return "Broun";
    }

    @Override
    public String dateOfBD() {
        return "10.10.20";
    }

    @Override
    public Object showAffection() {
        System.out.println("dislike affection");

        return null;
    }
    public String getPresenceOfTraining(){
         return "need training";
    }

    public void doTraining(){
        System.out.println("do training this dog");
    }

    @Override
    public String toString() {
        String s = new StringBuilder().append("Animal - DOG have got a height ").append(height()).append(", a weight ").append(weight()).append(", color of eyes ").append(colorEyes()).append(", name ").append(name()).append(", breed ").append(breed()).append(vaccinations()).append(" , coat color ").append(coatColor()).append("date of BD ").append(dateOfBD()).append(showAffection()).append(getPresenceOfTraining()).toString();
        return s;

    }
}


