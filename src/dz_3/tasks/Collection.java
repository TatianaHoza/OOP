package dz_3.tasks;

import java.util.ArrayList;
import java.util.Comparator;

public abstract class Collection implements Iterable<Figures>, Comparator<Figures> {

    private final ArrayList<Object> figure;

    public Collection() {
        this.figure = new ArrayList<>();
    }

    //add new figure

    public int addFigure(Figures x) {
        figure.add(x);
        return 0;
    }
    // delete figure
    public int deleteFigure(int index){
        this.figure.remove(index);
        return 0;
    }
    //change figure
    public int changeFigure(Figures x,int index) {
        this.figure.remove(index);
        this.figure.add(index, x);
        return 0;
    }

   //sorted
//    public static void sort(){
//        Collection.sort(Figures);
//    }


        // display info
public void displayInfo(){
        for(Object Figures:figure){
            System.out.println(figure);
        }
}



}
