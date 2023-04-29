package dz_1.tasks;

public abstract class Goods {
    private String name;
    private String price;
    private int count;
    private  String unit;

   public Goods(){
       this.name = name;
       this.price = price;
       this.count = count;
       this.unit = unit;
   }

    @Override
    public String toString() {
        return super.toString();
    }
}
