import java.util.Scanner;

public class Konvertsekunder {
    //lav et program der læser et antal sekunder ind
    //og skriver hvor mange dage, timer, minutter og sekunder
    // det angivne antal sekunder svarer til.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter amount of seconds: ");
        int totalSeconds = input.nextInt();
        int remainingSeconds = 0;

        int years = totalSeconds / 31557600;
        remainingSeconds = totalSeconds % 31557600;

        int months = totalSeconds / 2629800;
        remainingSeconds = totalSeconds % 2629800;

        int days = totalSeconds / 86400;
        remainingSeconds = totalSeconds % 86400;

        int hours = remainingSeconds / 3600;
        remainingSeconds = remainingSeconds % 3600;

        int minutes = remainingSeconds / 60;
        remainingSeconds = remainingSeconds % 60;

        System.out.println(
                Integer.toString(totalSeconds) + " seconds equals " +
                        Integer.toString(years) + "years, " +
                        Integer.toString(months) + "months, " +
                        Integer.toString(days) + " days, " +
                        Integer.toString(hours) + " hours, " +
                        Integer.toString(minutes) + " minutes and " +
                        Integer.toString(remainingSeconds) + "seconds."
        );

    }
}
