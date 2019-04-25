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
            int century = (year / 100);
            int modYear = (year % 100);
            int calcDay = (date + ((13 * (month+1) ) / 5) + modYear + (modYear / 4) + (century / 4) - (2 * century) ) % 7;
            calcDayOfWeek(calcDay);
            poem(calcDay);
            }



        }

    public static String daysInMonth(int month){
        if (month==1){
            return ("You were born in January" +
                    "There are 31 days in January");
        }
        if (month==2){
            return ("You were born in February" +
                    "Normally there are 28 days in February");
        }
        if (month==3){
            return ("You were born in March" +
                    "There are 31 days in March");
        }
        if (month==4){
            return ("");

        }
        if (month==5){
            return ("");

        }
        if (month==6){
            return ("");

        }
        if (month==7){
            return ("");

        }
        if (month==8){
            return ("");

        }
        if (month==9){
           return ("");

        }
        if (month==10){
            return ("");

        }
        if (month==11){
           return ("");

        }
        if (month==12){
            return ("");

        }
        return (" ");
    }


    public static boolean calcDayOfWeek(int calcDay) {

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
    public static String poem(int calcDay){
        if (calcDay == 0){
            return ("Saturday's child works hard for a living");
        }
        if (calcDay ==1){
            return("The child born on the Sabbath Day" +
                    "Is fair and wise and good in every way");

        }
        if (calcDay==2){
            return("Monday's child is fair of face");
        }
        if (calcDay==3){
            return("Tuesday's child is full of grace");
        }
        if (calcDay==4){
            return ("Wednesday's child is full of woe");
        }
        if (calcDay==5){
            return ("Thursday's child has far to go");
        }
        if (calcDay==6){
            return("Friday's child is loving and giving");
        }
        return (" ");
    }





    }




