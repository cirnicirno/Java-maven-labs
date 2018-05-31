package lab;

import java.util.Scanner;

public class DoubleSwapper {

    public DoubleSwapper() {
    }

    public void swap(double firstNumber, double secondNumber) {
        firstNumber = firstNumber + secondNumber;
        secondNumber = firstNumber - secondNumber;
        firstNumber = firstNumber - secondNumber;
        printSwap(firstNumber,secondNumber);
    }

    private void printSwap(double firstNumber, double secondNumber) {
        System.out.println("Число a= " + firstNumber + " Число b= " + secondNumber);
    }
}
