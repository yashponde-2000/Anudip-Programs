package labNo43;

	
	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Scanner;

	public class ShortTheArray {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the size of the array: ");
	        int size = scanner.nextInt();

	        ArrayList<Integer> numbers = new ArrayList<>();

	        System.out.println("Enter " + size + " elements:");

	        for (int i = 0; i < size; i++) {
	            int num = scanner.nextInt();
	            numbers.add(num);
	        }

	        System.out.println("Before sorting: " + numbers);

	        Collections.sort(numbers);

	        System.out.println("After sorting: " + numbers);

	        scanner.close();
	    }
	


}
