import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[][] scedule = new String[7][2];
        scedule[0][0] = "Sunday";
        scedule[0][1] = "do home work";
        scedule[1][0] = "Monday";
        scedule[1][1] = "go to courses; watch a film";
        scedule[2][0] = "Tuesday";
        scedule[2][1] = "do home work";
        scedule[3][0] = "Wednesday";
        scedule[3][1] = "do home work; watch a film";
        scedule[4][0] = "Thursday";
        scedule[4][1] = "go to courses; do home work";
        scedule[5][0] = "Friday";
        scedule[5][1] = "do home work; watch a film";
        scedule[6][0] = "Saturday";
        scedule[6][1] = "go to courses";

        String day = "";

  /*      for (int i = 0; i < scedule.length; i++) {
            for (int j = 0; j < scedule[i].length; j++) {
                System.out.print(" | " + scedule[i][j] + " | ");
            }
            System.out.println();
        }*/
        Scanner scanner = new Scanner(System.in);

      out:  for (int i = 1; i < 8; i++) {

        in:    System.out.println("Please, input the day of the week:");

           if (scanner.hasNextLine()) {
                day = scanner.nextLine();

            } else {

                System.out.println("Sorry, I don't understand you, please try again. Input the day of the week:");
                continue out;
            }


            day = day.trim();
            day = day.toUpperCase();


            switch (day) {
                case "SUNDAY":
                    System.out.println("Your tasks for Sunday: do home work.");
                    continue;
                case "MONDAY":
                    System.out.println("Your tasks for Monday: go to courses; watch a film.");
                    continue;
                case "TUESDAY":
                    System.out.println("Your tasks for Tuesday: do home work.");
                    continue;
                case "WEDNESDAY":
                    System.out.println("Your tasks for Wednesday: do home work; watch a film.");
                    continue;
                case "THURSDAY":
                    System.out.println("Your tasks for Thursday: go to courses; watch a film.");
                    continue;
                case "FRIDAY":
                    System.out.println("Your tasks for Friday: do home work; watch a film.");
                    continue;
                case "SATURDAY":
                    System.out.println("Your tasks for Saturday: go to courses.");
                    continue;
                case "EXIT":
                    i = 8;
                    break;
                default:
                    break;
            }
        }
        scanner.close();
    }
}
