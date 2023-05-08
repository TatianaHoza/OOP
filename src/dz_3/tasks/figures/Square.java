package dz_3.tasks.figures;

import dz_3.tasks.Figures;

class Square extends Figures {
    private float x;


    Square(float x) {

        this.x = x;

        if (x <= 0.0)
            System.out.println("Wrong sides"); ;
    }
    @Override
    public float getPerimeter() {
        return 4*x;
    }

    @Override
    public float getArea() {
        return x*x;
    }
}
