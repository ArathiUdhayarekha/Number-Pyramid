import java.util.Scanner;
public class NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Input the number of rows
        System.out.print("Enter the number of rows for the pyramid: ");
        int n = scanner.nextInt();

        // Step 2 & 3: Generate pyramid using loops
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print numbers
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }

            // Move to next line
            System.out.println();
        }

        scanner.close();
    }
}
