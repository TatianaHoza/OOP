package dz_1.tasks.listOFGoods;

import dz_1.tasks.Goods;

public class Food extends Goods {

    public String expirationDate;

    public Food(String name, String price, int count, String unit, String expirationDate){
        super();
        this.expirationDate = expirationDate;
    }

}
