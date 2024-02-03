import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbersList = new ArrayList<>();

        System.out.print("Enter the number of integers to input: ");
        int n = scanner.nextInt();

        System.out.println("Enter " + n + " integers:");

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            numbersList.add(num);
        }

        System.out.println("Elements in the ArrayList:");
        for (int num : numbersList) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}