package lab;

public class Lab3 {

    public static void main(String[] args){
        double firsNumber;
        double secondNumber;
        NumberScanner scanner = new NumberScanner();
        while (true){
            System.out.print("Введите первое число: ");
            if(scanner.isDoubleNumber()){
                System.out.print("Введите второе число: ");
                firsNumber  = scanner.getNumber();
                if(scanner.isDoubleNumber()){
                    secondNumber = scanner.getNumber();
                    break;
                }

            }
            System.out.println("Извините, вы ввели не число!");
        }
        DoubleSwapper doubleSwap = new DoubleSwapper();
        doubleSwap.swap(firsNumber,secondNumber);

    }

}
