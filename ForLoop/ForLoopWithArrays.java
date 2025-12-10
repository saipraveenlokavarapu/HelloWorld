package ForLoop;

public class ForLoopWithArrays {

	public static void main(String[] args) {
		
		int[] nums = new int[4];
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = i;
		}
		
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
			}

	}

}
