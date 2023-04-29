package dz_1.tasks.listOFGoods;

public class Milk extends  Drinks {
    public String fatPercentage;
    public String term;


    public Milk(String name, String price, int count, String unit, String volume, String fatPercentage, String term) {
        super(name, price, count, unit, volume);
        this.fatPercentage = fatPercentage;
        this.term = term;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
