import java.util.Scanner;

public class DayAndMonth {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Today I am going to tell you what day you were born.");
        while (1 == 1) {
            System.out.println("What month were you born? (Enter a number)");
            int month = keyboard.nextInt();
            System.out.println(daysInMonth(month));
            System.out.println("What date of the month were you born?");
            int date = keyboard.nextInt();
            System.out.println("What year were you born?");
            int year = keyboard.nextInt();
            switch (month) {
                case 1:
                    month = 13;
                    year = (year - 1);
                    break;
                case 2:
                    month = 14;
                    year = (year - 1);
            }
            System.out.println(dayOfWeek(year,date,month));
            System.out.println(poem(dayOfWeek(year,date,month)));
        }
    }
    public static String daysInMonth(int month) {
        switch (month) {
            case 1:
               return("There are 31 days in January");
            case 2:
                return ("Normally there are 28 days in February");
            case 3:
               return  ("There are 31 days in March");
            case 4:
               return ("There are 30 days in April");
            case 5:
               return ("There are 31 days in May");
            case 6:
               return ("There are 30 days in June.");
            case 7:
               return ("There are 31 days in July");
            case 8:
                return("There are 31 days in August");
            case 9:
                return ("There are 30 days in September");
            case 10:
                return ("There are 31 days in October");
            case 11:
                return ("There are 30 days in November");
            case 12:
                return ("There are 31 days in December");
            default:
                return ("error");
        }
    }
    public static String dayOfWeek(int year, int date, int month){
        int century = (year / 100);
        int modYear = (year % 100);
        int calcDay = (date + ((13 * (month + 1)) / 5) + modYear + (modYear / 4) + (century / 4) - (2 * century)) % 7;
        switch (calcDay) {
            case 0:
                return ("You were born on a Saturday");
            case 1:
                return ("You were born on a Sunday");
            case 2:
                return ("You were born on a Monday");
            case 3:
                return ("You were born on a Tuesday");
            case 4:
                return ("You were born on a Wednesday");
            case 5:
                return ("You were born on a Thursday");
            case 6:
                return ("You were born on a Friday");
            default:
                System.out.println( "error");
        }
            return "error";
    }
        public static String poem (String calcDay){
            switch (calcDay) {
                case "You were born on a Saturday":
                    return ("Saturday's child works hard for a living");

                case "You were born on a Sunday":
                    return ("The child born on the Sabbath Day" +
                            "Is fair and wise and good in every way");


                case"You were born on a Monday" :
                    return ("Monday's child is fair of face");


                case "You were born on a Tuesday":
                    return ("Tuesday's child is full of grace");


                case"You were born on a Wednesday" :
                    return ("Wednesday's child is full of woe");


                case "You were born on a Thursday":
                    return ("Thursday's child has far to go");


                case "You were born on a Friday":
                    return ("Friday's child is loving and giving");

                    default:
                    System.out.println("error");
            }
            return "error";
        }
    }
