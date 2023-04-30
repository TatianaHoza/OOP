package dz_1.tasks.listOFGoods;

public class Diapers extends ChildrenGoods {

    public int size;
    public String minWeight;
    public String maxWeight;
    public String type;

    public Diapers(String name, String price, int count, String unit, int age, String hypoallergenic, String minWeight, String maxWeight, String type) {
        super(name, price, count, unit, age, hypoallergenic);
        this.size = size;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
