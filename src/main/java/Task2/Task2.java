package Task2;


import java.util.Arrays;


/* Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке. Если длины массивов не равны,
необходимо как-то оповестить пользователя.
Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.
*/

public class Task2 {
    public static void main(String[] args) {

        int[] array1 = {15, 8, 4, 2, 5, 9};
        int[] array2 = {3, 4, 4, 2, 0, 6};

        try {
            int[] result = divide(array1, array2);
            System.out.println(Arrays.toString(result));

        } catch (RuntimeException e) {
            System.out.println("Error: Cann not divide" + e.getMessage());

        }
    }
    public static int[] divide(int[] array1, int[] array2) {

        if (array1.length != array2.length) {
            throw new RuntimeException("The length of arrays are different.");
        }
        int[] result = new int[array2.length];
        for (int i = 0; i < array1.length; i++) {

            result[i] = array1[i] / array2[i];
        }
        return result;

    }
}