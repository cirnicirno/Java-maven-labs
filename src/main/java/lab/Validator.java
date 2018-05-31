package lab;

public class Validator {

    public Validator() {
    }

    public static boolean isDouble(String number){
        try{
            Double.parseDouble(number);
        }catch (NumberFormatException e){
            return false;
        }
        return true;
    }
}
