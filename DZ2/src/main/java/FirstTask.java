import java.util.InputMismatchException;
import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        FloatNum floatNum = new FloatNum();
        floatNum.parseFloat();
    }
}

class FloatNum {
    Scanner in;

    public void parseFloat() {
        while (true) {
            in = new Scanner(System.in);
            try {
                System.out.println("Введите дробное число: ");
                System.out.println("Ваше число: " + in.nextFloat());
                return;
            } catch (InputMismatchException e) {
                System.out.println("Вам нужно ввести дробное число");
            }
        }
    }
}