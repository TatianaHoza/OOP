package dz_1.tasks.listOFGoods;

import dz_1.tasks.Goods;

public class HygieneItems extends Goods {
    public int amount;

    public HygieneItems(String name, String price, int count, String unit, int amount) {
        super();
        this.amount = amount;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
