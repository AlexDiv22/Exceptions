public class ChangeCode {
    public static void main(String[] args) {
//        ChangeCodeFirstTask changeCodeFirstTask = new ChangeCodeFirstTask();
//        changeCodeFirstTask.firstTask();

        ChangeCodeSecondTask changeCodeSecondTask = new ChangeCodeSecondTask();
        changeCodeSecondTask.secondTask();
    }
}

class ChangeCodeFirstTask {
    int[] array;

    ChangeCodeFirstTask() {
        array = new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
    }

    public void firstTask() {
        try {
            int d = 0;
            double catchedRes1 = array[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e.getMessage());
        }
    }
}

class ChangeCodeSecondTask {
    int a = 90;
    int b = 3;
    int[] abc;

    public void secondTask() {
        try {
            System.out.println(a / b);
            printSum(23, 234);
//            abc = {1, 2};
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (ArithmeticException ex) {
            System.out.println("Делить на ноль нельзя!");
        } catch (RuntimeException ex) {
            System.out.println("Что-то пошло не так...");
        }
    }

    private void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }
}