package dz_4.tasks;

import java.util.Random;

public class Main {

        public Main(){
            Random rnd = new Random();

           strDA = new DynamicArray<>();
            for (int i = 0; i < 20; i++) {
                StringBuilder str = new StringBuilder();
                for (int j = 1; j < rnd.nextInt(2,15); j++) {
                    str.append((char)rnd.nextInt(8,90));
                }

            }

            Integer[] rndArray = new Integer[20];
            for (int i = 0; i < rndArray.length; i++) {
                rndArray[i] = rnd.nextInt(1,1000);
            }
            intDA = new DynamicArray<>(rndArray);

            for (int i = 0; i < 5; i++) {
                double v = rnd.nextDouble(1.0, 10.0);
                rnd.nextDouble(1.0,10.0);
            }
        }
        public DynamicArray<String> strDA;
        public DynamicArray<Integer> intDA;
        public DynamicArray<Double> dblDA = new DynamicArray<>();

    }

