package dz_2.tasks;

public abstract class Birds implements Animal{
    private int flightAltitude;

    public void birdFly(){
        System.out.printf("Я лечу на %d метрах", getFlightAltitude());
    }

    private int getFlightAltitude(){
        return 100;
    }

}
