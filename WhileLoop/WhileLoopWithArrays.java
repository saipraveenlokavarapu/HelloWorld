package WhileLoop;

public class WhileLoopWithArrays {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int i = 0;

        // Using while loop to iterate through the array
        while (i < numbers.length) {
            System.out.println(numbers[i]);
            i++;
        }
    }
}

