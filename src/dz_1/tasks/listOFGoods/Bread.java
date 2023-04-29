package dz_1.tasks.listOFGoods;

public class Bread extends Food {

    public String typeOfFlour;
    public Bread(String name, String price, int count, String unit, String expirationDate,String typeOfFlour) {
        super(name, price, count, unit, expirationDate);
        this.typeOfFlour = typeOfFlour;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
