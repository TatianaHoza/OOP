package dz_3.tasks.figures;

import dz_3.tasks.Figures;

class Triangle extends Figures {

    private float a;
    private float b;
    private float c;
    public Triangle(float a,float b,float c){

        this.a = a;
        this.b=b;
        this.c = c;


        if ((a <= 0.0 || b<= 0.0 || c<=0.0) || !(a+b >c && a+c >b && b+c>a))
            System.out.println("Wrong sides");



    }

    @Override
    public float getPerimeter() {
        return a+b+c;
    }

    @Override
    public float getArea() {
        Float p = getPerimeter()/2;
        return (float) Math.sqrt(p*(p-a)*(p - b)*(p-c));
    }
}
