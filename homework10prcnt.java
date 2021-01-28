import java.util.Scanner;

public class homework10prcnt {
    public static void main(String[] args) {
        System.out.println("We have a number . It Independance day of USA  times x 25 . "); // in little playful way we asking user to enter number//
        System.out.println("Please enter number close to our within + or -10%. "); // close to one we have put in our program //
        Scanner num = new Scanner(System.in);
        int a = num.nextInt();

        int july = 100; // this will be our number
        int b = july - (july/100)*10;// here we define range of -10% of our number
        int c = july + (july/100)*10; // here we define + 10% of our number
        if (a <= c && a >= b) {
            System.out.println("Congratulations you guess correctly we entered number 100 "); // this will print if user guessed correctly and entered
            System.out.println(" and your number " + a + " are within 10% of our number "); // number within 10% of our
        } else {
            if (a < b || a > c) {
                System.out.println("Sorry but you entered " + a);
                System.out.println("this number will not fit to  required + - 10% range of number we put in our program"); // message if user entered number outside
                System.out.println("i assume your guessed not correct number please try again.  "); // 10% range of our
                System.out.println("Run program one more time and read our tip in first line !");
            }
        }
    }
}

