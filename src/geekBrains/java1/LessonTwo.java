package geekBrains.java1;

import java.util.Arrays;

public class LessonTwo {
    public static void main(String[] args) {
        int[] arrayOne = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};


        for (int i = 0; i < arrayOne.length; i++) {
            if (arrayOne[i] == 1) {
                arrayOne[i] = 0;
            } else {
                arrayOne[i] = 1;
            }
        }

        System.out.println(Arrays.toString(arrayOne));
    }

}
