import java.util.Scanner;

public class OneD {
    public static void main(String[] args) {
        int[] a = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements into the array:");

        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }

        // Display the array elements
        System.out.println("The elements in the array are:");
        for (int i = 0; i < a.length; i++) {
            System.out.println("Element " + (i + 1) + ": " + a[i]);
        }

        sc.close();
    }
}
