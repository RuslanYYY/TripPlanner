package sample;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        message1();
        message2();
        message3();
        message4();
        System.out.println("Error!");
    }

    public static void message1() {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Vacation Planner!");
        System.out.print("What is your name?");
        String name = input.next();
        System.out.println("Nice to meet you " + name + ", where are you travelling to ?");
        String place = input.next();
        System.out.println("Great! " + place + " sounds like a great trip");
    }

    public static void message2() {
        Scanner input = new Scanner(System.in);
        System.out.print("How many days are you going to spend travelling? ");
        int days = input.nextInt();
        System.out.print("How much money, in USD, are you planning to spend on your trip? ");
        double money = input.nextDouble();
        System.out.print("What is the three letter currency symbol for your travel destination? ");
        String symbol = input.next();
        System.out.print("How many " + symbol + " are there in 1 USD? ");
        double curse = input.nextDouble();
        int inHours = days*336;
        int inMinutes = inHours*60;
        int inSeconds = inMinutes*60;
        System.out.println("If you are travelling for " + days + " that is the same as " + inHours + " hours or " + inMinutes + " minutes or " + inSeconds + " seconds");
        double spendUSD = money/14;
        System.out.println("If you are going to spend " + money + " USD that means per day you can spend up to " + spendUSD + " USD");
        double moneyDif = money*curse;
        double spendDif = moneyDif/14;
        System.out.println("Your total budget in " + symbol + " is " + moneyDif + " " + symbol + ", which per day is " + spendDif + " " + symbol);

    }

    public static void message3() {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the time difference, in hours, between your home and your destination? ");
        int timeDiff = input.nextInt();
        int timeMidnight = 24+timeDiff;
        int timeNoon = 12+timeDiff;
        System.out.println("That means that when it is midnight at home it will be " + timeMidnight + " hours in your travel destination and when it is noon at home it will be " + timeNoon + " hours");


    }

    public static void message4() {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the square area of your destination country in km2? ");
        double sqrKm = input.nextDouble();
        double sqrMil = sqrKm*0.386102;
        System.out.println("In miles2 that is " + sqrMil);
    }
}