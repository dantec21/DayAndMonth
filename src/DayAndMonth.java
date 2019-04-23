import java.util.Scanner;

public class DayAndMonth {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Today I am going to tell you what day you were born.");
        while (1==1) {
            System.out.println("What month were you born? (Enter a number)");
            int month = keyboard.nextInt();
            System.out.println("What date were you born?");
            int date = keyboard.nextInt();
            System.out.println("What year were you born?");
            int year = keyboard.nextInt();
            calcDayOfWeek(month, date, year);
            dayOfWeek(int calcDay;);
        }
    }

    public static int calcDayOfWeek(int month, int date, int year) {
        int century = (year / 100);
        int modYear = (year % 100);
        int calcDay = (date + ((13 * (month+1) ) / 5) + modYear + (modYear / 4) + (century / 4) - (2 * century) ) % 7;


        return calcDay;
    }
    public static boolean dayOfWeek(int calcDay){
        switch (calcDay){
            case 0:
                System.out.println("You were born on a Saturday");
                break;
            case 1:
                System.out.println("You were born on a Sunday");
                break;
            case 2:
                System.out.println("You were born on a Monday");
                break;
            case 3:
                System.out.println("You were born on a Tuesday");
                break;
            case 4:
                System.out.println("You were born on a Wednesday");
                break;
            case 5:
                System.out.println("You were born on a Thursday");
                break;
            case 6:
                System.out.println("You were born on a Friday");
                break;
        }
        return true;



    }

}

