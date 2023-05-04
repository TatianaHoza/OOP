package dz_2.tasks;

import javax.swing.text.DefaultEditorKit;
import java.util.ArrayList;
import java.util.List;

import static sun.security.jca.ProviderList.remove;

public abstract class Zoo implements Animal {
    private List<Animal> animals;

    private void Zoo() {
        this.animals = (List<Animal>) new ArrayList<Animal>();
    }

    public void addAnimal(Animal a){
        animals.add(a);
    }

    public void deleteAnimal(){



    }

    private List<Animal> remove(List<Animal> animals, int index) {
        animals = remove(animals,index);
        return animals;
    }

    private int readline(String enterIndex) {
        int index = readline(" Enter index ");
        return index;
    }

 public String toString() {
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
