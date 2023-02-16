package Today;
import java.util.*;

interface AdvancedArithmetic {
    int divisorSum(int n);
}

class MyCalculator implements AdvancedArithmetic {
    public int divisorSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
} 

public class Out {
	 public static void main(String[] args) {
	        MyCalculator myCalculator = new MyCalculator();
	        Scanner scanner = new Scanner(System.in);
	        int n = scanner.nextInt();
	        scanner.close();
	        int sum = myCalculator.divisorSum(n);
	        System.out.println( "Sum of divisor is : " +sum);
	    }
     }
