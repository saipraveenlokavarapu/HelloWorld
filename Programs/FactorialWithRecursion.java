package Programs;

public class FactorialWithRecursion {
	
	public static int calculateFactorial(int n) {
		if (n==0) {
			return 1;
		}
		
		return n * calculateFactorial(n-1);
	
	}

	public static void main(String[] args) {
		
		int n = 5;
		
		int result = calculateFactorial(n);
		System.out.println("The factorial of the given number is: " +result);

	}

}
