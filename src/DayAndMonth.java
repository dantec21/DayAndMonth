import java.util.Scanner;

public class DayAndMonth {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Today I am going to tell you what day you were born.");
        while (1==1) {
            System.out.println("What month were you born? (Enter a number)");
            int month = keyboard.nextInt();
            daysInMonth(month);
            System.out.println("What date of the month were you born?");
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

    public static boolean daysInMonth(int month){
       // System.out.println("Inside of the daysInMonth method");


        switch (month){
            case 1:
                System.out.println("You were born in January");
                System.out.println("There are 31 days in January");
        }
        switch (month){
            case 2:
            System.out.println ("You were born in February");
                System.out.println("Normally there are 28 days in February");
        }
        switch (month){
            case 3:
            System.out.println ("You were born in March");
            System.out.println ("There are 31 days in March");
        }
        if (month==4){
            System.out.println("You were born in April");
            System.out.println("There are 30 days in April");
        }
        if (month==5){
            System.out.println("You were born in May");
            System.out.println("There are 31 days in May");
        }
        if (month==6){
            System.out.println("You were born in June");
            System.out.println("There are 30 days in June.");
        }
        if (month==7){
            System.out.println("Your were born in July");
            System.out.println("There are 31 days in July");
        }
        if (month==8){
            System.out.println("You were born in August");
            System.out.println("There are 31 days in August");
        }
        if (month==9){
            System.out.println("Your were born in September");
            System.out.println("There are 30 days in September");
        }
        if (month==10){
            System.out.println("You were born in October");
            System.out.println("There are 31 days in October");
        }
        if (month==11){
            System.out.println("You were born in November");
            System.out.println("There are 30 days in November");
        }
        if (month==12){
            System.out.println("You were born in December");
            System.out.println("There are 31 days in December");
        }
        return true;

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
    public static boolean poem(int calcDay){
        if (calcDay == 0){
            System.out.println("Saturday's child works hard for a living");
        }
        switch (calcDay){
            case 1:
            System.out.println("The child born on the Sabbath Day");
            System.out.println("Is fair and wise and good in every way");
        }
        switch(calcDay){
            case 2:
            System.out.println("Monday's child is fair of face");
        }
        switch (calcDay){
            case 3:
            System.out.println("Tuesday's child is full of grace");
        }
        switch (calcDay){
            case 4:
            System.out.println("Wednesday's child is full of woe");
        }
        switch (calcDay){
            case 5:
            System.out.println("Thursday's child has far to go");
        }
        switch (calcDay) {
            case 6:
            System.out.println("Friday's child is loving and giving");
        }
        return true;
    }





    }




