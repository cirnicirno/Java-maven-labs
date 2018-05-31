package lab;

import java.util.Scanner;

public class NumberScanner {

    private double number;
    private Scanner in;
    private String line;

    public NumberScanner() {
        in = new Scanner(System.in);
    }

    public boolean isDoubleNumber(){
        line = in.nextLine();
        if(Validator.isDouble(line)){
            number = Double.parseDouble(line);
            return true;
        }
        return false;
    }

    public double getNumber(){
        return number;
    }
}
