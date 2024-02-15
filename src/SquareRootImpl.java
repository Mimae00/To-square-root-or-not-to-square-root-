package src;

import java.util.Arrays;

public class SquareRootImpl {
    public static void squareOrSquareRoot(int[] array) {

        int[] divisibleArray = new int[array.length];

        for (int x = 0; x < array.length; x++) {

            if (array[x] % Math.sqrt(array[x]) == 0) {
                divisibleArray[x] = (int) Math.sqrt(array[x]);
            } else {
                divisibleArray[x] = (int) Math.pow(array[x], 2);
            }
        }
        System.out.println(Arrays.toString(divisibleArray));

    }
}
