import java.lang.Math;

public class Pythagorean {
    public double calculateHypotenuse(int legA, int legB){
        double sum = legA*legA + legB*legB;
        
        double squareRoot = Math.sqrt(sum);

        return squareRoot;
    }
}