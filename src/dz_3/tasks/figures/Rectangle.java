package dz_3.tasks.figures;

import dz_3.tasks.Figures;


class Rectangle extends Figures {
    private float width;
    private float height;

    Rectangle(float width, float height) {

        this.width = width;
        this.height = height;

        if (width <= 0.0 || height <= 0.0 || width == height)
            System.out.println("Wrong sides"); ;
    }

    public float getPerimeter() {

        return width * 2 + height * 2;
    }

    public float getArea() {

        return width * height;
    }

}
