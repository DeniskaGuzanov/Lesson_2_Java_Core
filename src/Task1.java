// задача , написать функцию добавления элемента в конец массива таким образом ,
// что б она расширяла массив при необхзодимости

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6};
        int num = 7;
        int resultArr[] = AddLast(arr, num);

        System.out.println("Исходный массив" + Arrays.toString(arr));
        System.out.println();
        System.out.println("Результат" + Arrays.toString(resultArr));


    }

    public static int[] AddLast(int[] arr, int num) {

        int tmpArr[] = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            tmpArr[i] = arr[i];

        }
        tmpArr[arr.length] = num;
        return tmpArr;
    }

    public static int[] AddIndex(int[] arr, int num, int index) {

        if (!(index >= 0 && index <= arr.length)) {
            System.out.println("Индекс за пределами исходного массива");
        } else if (index == arr.length) {
            AddLast(arr, num);
        }

        int tmpArr[] = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            if (i == index) {
                tmpArr[i] = num;
            } else {
                tmpArr[i] = arr[i];
            }
        }
        tmpArr[arr.length] = num;
        return tmpArr;
    }
}

