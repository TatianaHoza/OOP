//package dz_2.tasks;
//
//import dz_2.tasks.listOfAnimals.Cat;
//
//import java.util.Scanner;
//
//public interface ConsolUser {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int x = 0;
//        String str = "";
//
//        while (!"6".equals(str)){
//            System.out.println("1. Enter new animals in ZOO");
//            System.out.println("2. Delete animal");
//            System.out.println("3. Display indo about animal № __");
//            System.out.println("4. Display info about all animals in ZOO");
//            System.out.println("5. Make sound animal №__");
//            System.out.println("6. Make sound all animals in ZOO");
//            str = scan.next();
//
//            try{
//                x= Integer.parseInt(str);
//            } catch (NumberFormatException e){
//                System.out.println("false");
//            }
//            switch (x){
//                case 1:
//                    Zoo.addAnimal();
//                    break;
//                case 2:
//                    Zoo.deleteAnimal();
//                    break;
//                case 3:
//                    Zoo.toString();
//                    break;
//
//
//            }
//
//        }
//
//    }
//}
