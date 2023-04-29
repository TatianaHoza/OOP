package dz_1.tasks.listOFGoods;

import dz_1.tasks.Goods;

public class ChildrenGoods extends Goods {
    public int age;
    public String hypoallergenic;

    public ChildrenGoods(String name, String price, int count, String unit, int age, String hypoallergenic) {
        super();
        this.age =age;
        this.hypoallergenic = hypoallergenic;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
