import java.util.Scanner;

public class DayAndMonth {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Today I am going to tell you what day you were born.");
        System.out.println("What month were you born? (Enter a number)");
        int m = keyboard.nextInt();
        System.out.println("What date were you born?");
        int q = keyboard.nextInt();
        System.out.println("What year were you born?");
        int year = keyboard.nextInt();
        int calcDay = calcDayOfWeek(m, q, year);
        System.out.println(calcDay);

    }

    public static int calcDayOfWeek(int m, int q, int year) {
        int J = (year / 100);
        int K = (year % 100);
        int day = (q + ((13*(m+1))/5) + K + (K/4) + (J/4) - (2*J))%7;
        return day;

    }

}

