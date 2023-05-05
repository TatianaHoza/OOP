package dz_2.tasks;

import java.util.ArrayList;
import java.util.List;

public abstract class Zoo implements Animal {
    private static List<Animal> animals;

    private void Zoo() {
        this.animals = (List<Animal>) new ArrayList<Animal>();
    }

    public static void addAnimal(){
        Animal a = null;
        animals.add(a);
    }

    public static void deleteAnimal(){



    }

    private List<Animal> remove(List<Animal> animals, int index) {
        animals = remove(animals,index);
        return animals;
    }

    private int readline(String enterIndex) {
        int index = readline(" Enter index ");
        return index;
    }

 public static String toString() {
     for (var Animal : animals) {
         System.out.println(animals);

     }

     return null;
 }

    @Override
    public void makeSound() {
        for (var Animal:animals){
            Animal.makeSound();
        }
    }
}
