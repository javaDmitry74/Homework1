public class homework3Digits {
    public static void main(String[] args) {
        float a = 190.67F;
        float b = 188.23F;
        float c = 189F;
        float average = (a + b + c) / 3F;
        System.out.println( "We have 3 numbers A , B, C : "+ a +", " + b + ", " + c );// printing out our numbers
        System.out.println("Average of all our numbers is = " + average);// print average of them

        if (a > b && c < b ) { // we start process of finding min and max number
            System.out.println("A is highest number and it " + a);
            System.out.println(" and C is smallest number " + c);
            } else {
            if (a > b &&  b < c) {
                System.out.println("A is highest number and it " + a);
                System.out.println(" and b is smallest number " + b);
                } else {
                if (b > a && c < a) {
                    System.out.println("B is highest number and it " + b);
                    System.out.println(" and C is smallest number " + c);
                    } else {
                    if (b > c && c < a) {
                        System.out.println("B is highest number and it " + b);
                        System.out.println(" and A is smallest number " + a);
                       } else {
                       if (c > a &&  a < b ) {
                           System.out.println("C is highest number and it " + c);
                           System.out.println(" and A is smallest number " + a);
                           } else  {
                           if (c > b && b < a ) {
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


