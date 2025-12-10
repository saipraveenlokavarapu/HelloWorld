package ForEachLoop;

public class ForEachLoopWithArrays {

	public static void main(String[] args) {
		
		int[] nums = {1, 2, 3, 4, 5};
		int sum = 0;
		
		for (int num : nums) {
			sum+= num;
		}
		
		System.out.println("The sum of the numbers in the given array is: " +sum);

	}

}
