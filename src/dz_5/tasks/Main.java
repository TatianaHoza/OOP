package dz_5.tasks;

import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        int num1 =Calculator.getInt();
        int num2 = Calculator.getInt();
        char oper = Calculator.getOperation();
        double result = Calculator.calculator(num1,num2,oper);
        System.out.println("Result of operation: "+result);


    }
    private static Logger log = Logger.getLogger(Main.class.getName());

    public void someMethod(){
        log.info("Create calculator");
    }
}
