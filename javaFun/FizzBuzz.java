public class FizzBuzz {
    public String fizzBuzz(int number) {
        // fizzbuzz logic here 
        if(number%3==0 && number%5==0){
            String fizzbussin = "FizzBuzz";
            return fizzbussin;
        } else if(number%3==0){
            String fizzbussin = "Fizz";
            return fizzbussin;
        } else if(number%5==0){
            String fizzbussin = "Buzz";
            return fizzbussin;
        } else {
            String x = Integer.toString(number);
            return x;
        }
    }
}

