package dz_3.tasks.figures;

import dz_3.tasks.Figures;

class Circle extends Figures{

    private float radius;

    Circle(float radius) {
        if (radius > 0.0) {
            this.radius = radius;
        if (radius <= 0.0)
            System.out.println("zero radius");
        }
    }

    @Override
    public float getPerimeter() {
        System.out.println("for a circle, the perimeter is not defined");
        return 0;
    }

    private float getLen(){
        return (float) (2.0*Math.PI*radius);
    }
    @Override
    public float getArea(){
        return (float) ((float) Math.PI * Math.pow(radius,2.0));
    }
}
