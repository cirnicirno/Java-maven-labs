package lab;

import java.util.Scanner;

public class DoubleSwap {
    public DoubleSwap(){

    }
    public void swap(){
        Scanner in = new Scanner(System.in);
        System.out.print("a = ");
        double a = in.nextDouble();
        System.out.print("b = ");
        double b = in.nextDouble();
        double c = b;
        b = a;
        a = c;
        System.out.println("a = "+a);
        System.out.println("b = "+b);

    }


}
