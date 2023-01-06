import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FirstTask {
    private int[] arr;
    private int number;

    //        Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

    public void firstException() throws FileNotFoundException {
        File file = new File("fff");
        Scanner scan = new Scanner(file);
    }

    public void secondException() {
        arr = new int[5];

        for (int number : arr) {
            System.out.println(arr[6]);
        }
    }

    public void thirdException() {
        System.out.println(arr);
    }
}