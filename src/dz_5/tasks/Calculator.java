package dz_5.tasks;

import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static int getInt() {
        System.out.println("Enter number ");
        int numb;
        if(scanner.hasNextInt()){
            numb = scanner.nextInt();
        }
        else{
            System.out.println("False. Enter number");
            scanner.nextInt();
            numb = getInt();
        } return numb;


}

    public static char getOperation() {
        System.out.println(" Enter operation ");
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("False. Enter operation");
            scanner.next();
            operation = getOperation();
        }
        return operation;

    }
public static int calculator(int numb1,int numb2, char operation){
        int result;
        switch (operation){
            case '+':
                result = numb1+numb2;
                break;
            case '-':
                result = numb1-numb2;
                break;
            case '*':
                result = numb1*numb2;
                break;
            case '/':
                result = numb1/numb2;
                break;
            default:
                System.out.println("False.Try enter");
                result = calculator(numb1, numb2, getOperation());
        } return result;
    }
}
