import java.util.Arrays;

public class SecondTask {

    //        Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
//        и возвращающий новый массив, каждый элемент которого равен разности элементов двух
//        входящих массивов в той же ячейке. Если длины массивов не равны,
//        необходимо как-то оповестить пользователя.
//
    private int[] arrFirst;
    private int[] arrSecond;
    private int[] arrResult;

    SecondTask(int[] arrFirst, int[] arrSecond){
        this.arrFirst = arrFirst;
        this.arrSecond = arrSecond;
    }

    public int[] subArr(){
        arrResult = new int[arrFirst.length];
        if(arrFirst.length != arrSecond.length){
            throw new ArrayIndexOutOfBoundsException("Размер одного из массивов меньше другого");
        }
        for (int i = 0; i < arrFirst.length; i++) {

            arrResult[i] = arrFirst[i] - arrSecond[i];
        }
        System.out.println(Arrays.toString(arrResult));
        return arrResult;
    }




}