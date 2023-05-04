package dz_2.tasks.listOfBirds;

import dz_2.tasks.Birds;

public class Chicken extends Birds {
    @Override
    public int height() {
        return 20;
    }

    @Override
    public int weight() {
        return 3;
    }

    @Override
    public String colorEyes() {
        return "black";
    }

    @Override
    public void makeSound() {
        System.out.println("ko-ko");

    }

    @Override
    public void displayInfo() {

    }

    @Override
    public void birdFly() {
        super.birdFly();
    }
    public int getFlightAltitude(){
        return 0;
    }
    @Override
    public String toString() {
        String s = new StringBuilder().append("Bird - CHICKEN have got a height ").append(height()).append(", a weight ").append(weight()).append(", color of eyes ").append(colorEyes()).toString();
        return s;

    }
}
