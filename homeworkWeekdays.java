import java.util.Scanner;

public class homeworkWeekdays {
    public static void main(String[] args) {
        System.out.println("Please enter number, any number you think of, ");// asking user to enter number , with little point about week days//
        System.out.println("but try to think about days of the week at same time ! ");
        Scanner num = new Scanner(System.in);
        int a;
        a = num.nextInt();
        {
            System.out.println("You entered number  " + a);// confirming to user hes entry number //

                switch (a) {
                    case 1:
                        System.out.println("Great you tough about Monday!");
                        break;
                    case 2:
                        System.out.println("Great you tough about Tuesday!");
                        break;
                    case 3:
                        System.out.println("Great you tough about Wendsday!");
                        break;
                    case 4:
                        System.out.println("Great you tough about Thursday!");
                        break;
                    case 5:
                        System.out.println("Great you tough about Friday!");
                        break;
                    case 6:
                        System.out.println("Great you tough about Saturday!");
                        break;
                    case 7:
                        System.out.println("Great you tough about Sunday!");
                        break;
                    default:
                        System.out.println("Sorry but according to our records there is no week day related to number you entered  " + a);
                        System.out.println("You could run program again and use our hint about week days ");
                }

            }
        }
    }
