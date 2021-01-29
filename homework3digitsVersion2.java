public class homework3digitsVersion2 {
    public static void main(String[] args) {
        double array[] = new double[]{48, 24, 32};

        double maxValue = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] > maxValue){
                maxValue = array[i];
            }
        }
        System.out.println("Maximum value of " + array.length + " number is: " + maxValue);

        double minValue = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] < minValue){
                minValue = array[i];
            }
        }
        System.out.println("Minimum value of " + array.length + " number is: " + minValue);
        double sum = 0;
        for (double anArray : array) {
            sum += anArray;
        }
        double average = sum/array.length;
        System.out.println("Our numbers are :"+ array[0]+"," +array[1]+","+array[2]);
        System.out.println("Average of " + array.length + " number is: " + average);
    }
}
