package dz_1.tasks.listOFGoods;

public class Eggs extends Food{
    public int countEggs;
    public Eggs(String name, String price, int count, String unit, String expirationDate,int countEggs) {
        super(name, price, count, unit, expirationDate);
        this.countEggs =countEggs;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
