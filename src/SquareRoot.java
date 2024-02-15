package src;


import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("If the number has an integer square root, take this, otherwise square the number\n");

        System.out.print("Enter total number to input: ");
        int size = scanner.nextInt();

        scanner.nextLine();

        int[] dataArray = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            dataArray[i] = scanner.nextInt();
        }

        scanner.close();
        SquareRootImpl.squareOrSquareRoot(dataArray);
    }
}

