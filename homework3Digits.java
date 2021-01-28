public class homework3Digits {
    public static void main(String[] args) {
        float a = 129.67F;
        float b = 135.23F;
        float c = 119F;
        float average = (a + b + c) / 3F;
        System.out.println( "We have 3 numbers A , B, C : "+ a +", " + b + ", " + c );// printing out our numbers
        System.out.println("Average of all our numbers is = " + average);// print average of them

        if (a > b && a > c && c < b ) { // we start process of finding min and max number
            System.out.println("A is highest number and it " + a);
            System.out.println(" and C is smallest number " + c);
            } else {
            if (a > b && a > c && b < c) {
                System.out.println("A is highest number and it " + a);
                System.out.println(" and b is smallest number " + b);
                } else {
                if (b > a && b > c && c < a) {
                    System.out.println("B is highest number and it " + b);
                    System.out.println(" and C is smallest number " + c);
                    } else {
                    if (b > c && b > a &&  a < c) {
                        System.out.println("B is highest number and it " + b);
                        System.out.println(" and A is smallest number " + a);
                       } else {
                       if (c > a && c > b && a < b ) {
                           System.out.println("C is highest number and it " + c);
                           System.out.println(" and A is smallest number " + a);
                           } else  {
                           if (c > a && c > b && b < a ) {
                             System.out.println("C is highest number and it " + c);
                             System.out.println(" and B is smallest number " + b);
                             }

                           }
                       }

                    }
                }
            }
        }
    }


