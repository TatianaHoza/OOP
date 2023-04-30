package dz_1.tasks;

import dz_1.tasks.listOFGoods.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       List<Goods> goods = new ArrayList<>();
       new Milk("Бабушкина крынка","2.10",60,"шт","1.0","3.2 %","3 дня");
       new Lemonade("Буратино","1.98",52,"шт","2.0 л");
       new Bread("Бородинский","0.98",40, "шт", "2 дня", "высший сорт");
       new Eggs("Молодецкие","3.90",48, "шт","10 дней",10);
       new Masks("Бородинский","0.98",100, "шт",5);
       new ToiletPaper("Мягкая","0.70",90, "шт", 2, 3);
       new Diapers("YocoSun","38.90",25, "шт",1, "hypoallergenic","5","10","15");
       new Nipple("Huppy","3.45",10, "шт",0,"hypoallergenic");

    for(Goods a:goods){
        Program.displayInfo(a);
    }
    }
}
