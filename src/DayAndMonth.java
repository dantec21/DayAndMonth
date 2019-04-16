import java.util.Scanner;

public class DayAndMonth {
    public static void main(String[]args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Today I am going to tell you what day you were born.");
        System.out.println("What month were you born? (Enter a number)");
        int month = keyboard.nextInt();
        System.out.println("What date were you born?");
        int date = keyboard.nextInt();
        System.out.println("What year were you born?");
        int year = keyboard.nextInt();
        int century = year/100;
        math();
        }
    public static void math(int month, int date, int year,int century){
        int day = date+((13*(month+1))/5)+year+(year/4)+5-century;
    }
}
