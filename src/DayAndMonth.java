import java.util.Scanner;

public class DayAndMonth {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Today I am going to tell you what day you were born.");
        System.out.println("What month were you born? (Enter a number)");
        int month = keyboard.nextInt();
        System.out.println("What date were you born?");
        int date = keyboard.nextInt();
        System.out.println("What year were you born?");
        int year = keyboard.nextInt();
        int calcDay = calcDayOfWeek(month, date, year);
        System.out.println(calcDay);

    }

    public static int calcDayOfWeek(int month, int date, int year) {
        int century = year / 100;
        int modYear = (year % 100);
        int day = (date + ((13 * (month + 1)) / 5) + modYear + ((modYear) / 4) + (century / 4) - (2 * century) % 7);
        return day;

    }

}

