public class Basic13Test{
    public static void main(String[] args){
        Basic13 printAll = new Basic13();
        printAll.printAll();

        Basic13 printOdd = new Basic13();
        printOdd.printOdd();

        Basic13 printSum = new Basic13();
        printSum.printSum();

        Basic13 iterateArray = new Basic13();
        iterateArray.iterateArray();

        int[] myArray = {1,3,5,7,13};
        Basic13 findMax = new Basic13();
        int max = findMax.findMax(myArray);
        System.out.println(max);

        
        Basic13 findAverage = new Basic13();
        double avg = findAverage.findAverage(myArray);
        System.out.println(avg);

        Basic13 greaterThanY = new Basic13();
        int value = greaterThanY.greaterThanY(myArray, 5);
        System.out.println(value);

        Basic13 squaredValues = new Basic13();
        System.out.println(squaredValues.squaredValues(myArray));

        Basic13 noNegatives = new Basic13();
        System.out.println(noNegatives.noNegatives(myArray));

        Basic13 minMaxAvg = new Basic13();
        System.out.println(minMaxAvg.minMaxAvg(myArray));

        Basic13 shiftOne = new Basic13();
        System.out.println(shiftOne.shiftOne(myArray));


    } 
}