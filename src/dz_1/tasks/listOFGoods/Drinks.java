package dz_1.tasks.listOFGoods;

import dz_1.tasks.Goods;

public class Drinks extends Goods {

    public String volume;
    public Drinks(String name, String price, int count, String unit, String volume) {
        super();
        this.volume = volume;
    }
}
