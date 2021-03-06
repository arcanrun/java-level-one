package geekBrains.java1;

import java.util.Arrays;

/*
* 1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
подпункт - и распечатайте индексы этих элементов

6. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны. Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||, эти символы в массив не входят.
7. **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным), при этом метод должен сместить все элементымассива на n позиций. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
пример [0,0,0,0,0,5,0,0,0,1,9] -> на 2 сдвигаем [1,9,0,0,0,0,0,5,0,0,0]
* */

public class LessonTwo {
    public static void main(String[] args) {
        one();
        two();
        tree();
        fourth();
        fifth();

    }

    public static void one() {
        int[] arrayOne = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};


        for (int i = 0; i < arrayOne.length; i++) {
            if (arrayOne[i] == 1) {
                arrayOne[i] = 0;
            } else {
                arrayOne[i] = 1;
            }
        }

        System.out.println(Arrays.toString(arrayOne));
        System.out.println("-----------end one---------");
    }

    public static void two() {
        int[] arrays = new int[8];


        for (int i = 0; i < arrays.length; i++) {
            if (i == 0) {
                arrays[0] = 0;
            } else {
                arrays[i] = arrays[i - 1] + 3;

            }
        }
        System.out.println(Arrays.toString(arrays));
        System.out.println("-----------end two---------");

    }

    public static void tree() {
        int[] arrays = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] < 6) {
                arrays[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arrays));
        System.out.println("-----------end three---------");
    }

    public static void fourth() {
        int[][] arrays = new int[10][10];

        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                if (i == j) {
                    arrays[i][j] = 1;
                    break;
                }
            }
        }


        for (int[] array : arrays) {
            System.out.println(Arrays.toString(array));

        }


        System.out.println("-----------end fourth---------");
    }

    public static void fifth() {
        int [] array = { 2, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };

        int max = 0;
        int maxIndex = 0 ;

        int min = array[0];
        int minIndex = 0;

        for(int i = 0; i < array.length; i++){
            if (array[i] > max){
                max = array[i];
                maxIndex = i;
            }
            if (array[i] < min ) {
                min = array[i];
                minIndex = i;
            }
        }
        System.out.println("max: " + max + " index: " + maxIndex);
        System.out.println("min: " + min + " index: " + minIndex);
        System.out.println("-----------end fifth---------");
    }

}
