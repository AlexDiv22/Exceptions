import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
        CheckInputUser checkInputUser = new CheckInputUser();
        checkInputUser.checkInputUser();
    }
}

class CheckInputUser {
    InputUser inputUser;
    Scanner in;

    public void checkInputUser() {

        while (true) {
            System.out.println("Введите строку: ");
            in = new Scanner(System.in);
            inputUser = new InputUser(in.nextLine());
            try {
                if (inputUser.getInputUser().equals("")) {
                    throw new WordContainsBlankString();
                }
                System.out.println("Ваша строка: " + inputUser.getInputUser());
                return;
            } catch (WordContainsBlankString ex) {
                System.out.println("Вам нужно ввести не пустую строку");
            }
        }
    }
}

class InputUser {
    String inputUser;

    InputUser(String inputUser) {
        this.inputUser = inputUser;
    }

    public String getInputUser() {
        return inputUser;
    }

    public void setInputUser(String inputUser) {
        this.inputUser = inputUser;
    }
}

class WordContainsBlankString extends Exception {

}