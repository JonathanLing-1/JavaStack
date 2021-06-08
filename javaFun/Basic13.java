import java.util.ArrayList;

public class Basic13{
    public int printAll(){
        int i = 0;
        while(i<256){
            System.out.println(i);
            i++;
        }
        return i;
    }
    public int printOdd(){
        int i = 1;
        while(i<256){
            System.out.println(i);
            i+=2;
        }
        return i;
    }
    public int printSum(){
        int i = 0;
        int sum = 0;
        while(i<256){
            System.out.println("New number:"+i);
            System.out.println("Sum:"+sum);
            sum+=i;
            i++;
        }
        return i;
    }

    public int iterateArray(){
        int[] myArray = {1,3,5,7,13};
        for(int i=0; i<myArray.length; i++){
            System.out.println(myArray[i]);
        }
        return 1;
    }

    public int findMax(int[] arr){
        
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    public double findAverage(int[] arr){
        double avg= 0;
        double sum=0;
        for(int i=0; i<arr.length; i++){
                sum += arr[i];
        }
        avg = (double) sum/ (double) arr.length;
        return avg;
    }
    public int greaterThanY(int[] arr, int y){
        int value=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>y){
                value++;
            }
        }
        return value;
    }
    public ArrayList squaredValues(int[] arr){
        ArrayList<Object> myArray = new ArrayList<Object>();
        
        for(int i=0; i<arr.length; i++){
            myArray.add(arr[i]*arr[i]);
        }
        return myArray;

    }
    public ArrayList noNegatives(int[] arr){
        ArrayList<Object> myArray = new ArrayList<Object>();
        for(int i=0; i<arr.length; i++){
            if(arr[i]<0){
                myArray.add(arr[i]*-1);
            }else{
                myArray.add(arr[i]);
            }
        }
        return myArray;
    }
    public ArrayList minMaxAvg(int[] arr){
        ArrayList<Object> myArray = new ArrayList<Object>();

        int min = arr[0];
        int max = arr[0];
        int sum = 0;
        double avg = 0;

        for (int i=0; i<arr.length; i++) {
            sum += arr[i];
            if (min > arr[i]) {
                min = arr[i];
            }
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        avg = (double) sum / arr.length;
        myArray.add(max);
        myArray.add(min);
        myArray.add(avg);

        return myArray; 
    }
    public ArrayList shiftOne(int[] arr){
        ArrayList<Object> myArray = new ArrayList<Object>();
        
        for(int i=1; i<arr.length; i++){
            myArray.add(arr[i]);
        }
        myArray.add(0);

        return myArray;
    }
}