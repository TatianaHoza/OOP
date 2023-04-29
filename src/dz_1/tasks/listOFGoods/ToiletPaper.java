package dz_1.tasks.listOFGoods;

public class ToiletPaper extends HygieneItems{
    public int numberOfLayers;
    public ToiletPaper(String name, String price, int count, String unit, int amount,int numberOfLayers) {
        super(name, price, count, unit, amount);
        this.numberOfLayers = numberOfLayers;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
