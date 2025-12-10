package DoWhileLoop;
import java.util.Arrays;

public class DoWhileLoop {

	public static void main(String[] args) {
		
		int[] nums = new int[5];
		int increment = 10;
		int i = 0;
		
		do {
			nums[i] = increment;
			i++;
			increment+= 5;
		} while(i<=0);
		
		System.out.println("The final array result is:" +Arrays.toString(nums));

	}

}
