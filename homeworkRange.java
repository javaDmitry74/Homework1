import java.util.Scanner;

public class homeworkRange {
    public static void main(String[] args) {
        int a = -100;
        int c = 100;
        System.out.println("Please enter number, any number within ");// asking user to enter number //
        System.out.println("range -100 to 100 ! ");
        Scanner num = new Scanner(System.in);
        int e;
        e = num.nextInt();
        if (e <= a) { //checking for left range
            System.out.println("According to our calculation , number you entered fit to our Left range of values ");
            System.out.println("You entered number  " + e);
        } else {
            if (e >= c ) { //checking for right range
                System.out.println("According to our calculation , number you entered fit to our Right range of values");
                System.out.println("You entered number  " + e);
            } else {
                if (e > a && e < c) { //checking for middle range
                    System.out.println("According to our calculation , number you entered fit to our Middle range of values");
                }

                    System.out.println("You entered number  " + e);
                }
            }
        }
    }


