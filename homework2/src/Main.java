import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int n = 6;
        String[][] str = {
                {" 0 |", " 1 |", " 2 |", " 3 |", " 4 |", " 5 |"},
                {" 1 |", " - |", " - |", " - |", " - |", " - |"},
                {" 2 |", " - |", " - |", " - |", " - |", " - |"},
                {" 3 |", " - |", " - |", " - |", " - |", " - |"},
                {" 4 |", " - |", " - |", " - |", " - |", " - |"},
                {" 5 |", " - |", " - |", " - |", " - |", " - |"},
        };

        String[][] strResult = {
                {" 0 |", " 1 |", " 2 |", " 3 |", " 4 |", " 5 |"},
                {" 1 |", " - |", " - |", " - |", " - |", " - |"},
                {" 2 |", " - |", " - |", " - |", " - |", " - |"},
                {" 3 |", " - |", " - |", " - |", " - |", " - |"},
                {" 4 |", " - |", " - |", " - |", " - |", " - |"},
                {" 5 |", " - |", " - |", " - |", " - |", " - |"},
        };

        int[] arr1 = new int[25];
        int[] arr2 = new int[25];
        int m = 0;


        for (int i = 0; i < 25; i++) {
            arr1[i] = (int) ((Math.random() * (5 - 1 + 1)) + 1);
            arr2[i] = (int) ((Math.random() * (5 - 1 + 1)) + 1);
            m = (int) ((Math.random() * (10 - 1 + 1)) + 1);
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(m);


        for (int i = 0; i < m; i++) {

            str[arr1[i]][arr2[i]] = " # |";

        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(str[i][j]);
            }
            System.out.println();
        }


        Scanner scanner = new Scanner(System.in);
        System.out.println("All set. Get ready to rumble!");
        System.out.println();

        int capacity = m;
        int currentLength = 0;
        int[] arrRow = new int[capacity];
        int[] arrColumn = new int[capacity];
        int row;
        int column;


        out:
        for (; ; ) {

            if (currentLength == m) break;

            in:
            System.out.print("Input a row number from 1 to 5: ");
            if (!scanner.hasNextInt()) {
                System.err.println("Not a number");
                break out;
            }
            row = scanner.nextInt();

            while (row < 1 || row > 5) {
                System.out.println("Input a row number from 1 to 5, please:");
                if (!scanner.hasNextInt()) {
                    System.err.println("Not a number");
                    return;
                }
                if (row >= 1 || row <= 5) {
                    row = scanner.nextInt();

                }
            }

            System.out.print("Input a column number from 1 to 5: ");

            if (!scanner.hasNextInt()) {
                System.err.println("Not a number");
                return;
            }
            column = scanner.nextInt();

            while (column < 1 || column > 5) {
                System.out.print("Input a column number from 1 to 5, please:");

                if (!scanner.hasNextInt()) {
                    System.err.println("Not a number");
                    return;
                }

                if (column >= 1 || column <= 5) {

                    column = scanner.nextInt();

                }
            }

            arrRow[currentLength] = row;
            arrColumn[currentLength] = column;



            if (str[arrRow[currentLength]][arrColumn[currentLength]] == " # |") {

                strResult[arrRow[currentLength]][arrColumn[currentLength]] = " X |";

            } else {
                strResult[arrRow[currentLength]][arrColumn[currentLength]] = " * |";
            }


            currentLength++;


            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(strResult[i][j]);
                }
                System.out.println();
            }


        }


        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {

                if (str[i][j] == " # |") {
                  if (!(strResult[i][j] == " X |")) {
                        strResult[i][j] = " 0 |";

                   }

                }

            }
        }

        if ((Arrays.equals(arr1, arrRow)) && (Arrays.equals(arr2, arrColumn))) {
            System.out.println();
            System.out.println("You have won!");
            System.out.println();
        } else {
            System.out.println();
            System.out.println("Game over. Your result is: ");
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(strResult[i][j]);
            }
            System.out.println();
        }

        scanner.close();
    }
}