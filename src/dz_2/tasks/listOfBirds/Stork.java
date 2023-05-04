package dz_2.tasks.listOfBirds;

import dz_2.tasks.Birds;

public class Stork extends Birds {
    @Override
    public int height() {
        return 100;
    }

    @Override
    public int weight() {
        return 6;
    }

    @Override
    public String colorEyes() {
        return "Black";
    }

    @Override
    public void makeSound() {
        System.out.println("Ta-ta-ta");

    }

    @Override
    public void displayInfo() {

    }

    @Override
    public void birdFly() {
        super.birdFly();
    }

    public int getFlightAltitude(){
        return 100;
    }
    @Override
    public String toString() {
        String s = new StringBuilder().append("Bird - STORK have got a height ").append(height()).append(", a weight ").append(weight()).append(", color of eyes ").append(colorEyes()).toString();
        return s;

    }
}
