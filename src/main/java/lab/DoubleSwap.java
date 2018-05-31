package lab;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DoubleSwap {
    public Scanner in = new Scanner(System.in);

    public DoubleSwap(){


    }
    public void input(){
            System.out.print("a = ");
            double a = isCorrectInput();
            System.out.print("b = ");
            double b = isCorrectInput();
            double[] swap = mySwap(a, b);
            System.out.println("a = " + swap[0]);
            System.out.println("b = " + swap[1]);
    }



    public double isCorrectInput(){
        double typing;
        do {
            try {
                typing = in.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Попробуй еще раз");
                in.next();
                typing = 0;
            }
        } while (typing == 0);
        return typing;

    }
    public double[] mySwap(double a, double b){

        a = a + b - (b = a);
        //double[] result = new double[1];
        double[] result = {a, b};
        return result;

    }


}
