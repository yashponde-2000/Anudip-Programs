package labNo43;

import java.util.TreeSet;
import java.util.Scanner;

public class TreeSetList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Prompt the user to enter the size of the TreeSet
        System.out.print("Enter the size of the TreeSet: ");
        int size = scanner.nextInt();

        // Prompt the user to enter the elements of the TreeSet
        System.out.println("Enter the elements of the TreeSet:");
        for (int i = 0; i < size; i++) {
            int element = scanner.nextInt();
            treeSet.add(element);
        }

        // Find numbers less than 7 in the TreeSet
        TreeSet<Integer> lessThan7Set = new TreeSet<>();
        for (Integer num : treeSet) {
            if (num < 7) {
                lessThan7Set.add(num);
            }
        }

        // Print numbers less than 7 in the TreeSet
        System.out.println("Numbers less than 7 in the TreeSet: " + lessThan7Set);

        scanner.close();
    }
}


