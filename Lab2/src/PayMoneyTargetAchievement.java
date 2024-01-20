import java.util.Scanner;
public class PayMoneyTargetAchievement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get transaction array size
        System.out.print("Enter the size of transaction array: ");
        int transactionCount = scanner.nextInt();

        /* Get transaction values */
        int[] transactions = new int[transactionCount];
        System.out.print("Enter the values of array: ");
        for (int i = 0; i < transactionCount; i++) {
            transactions[i] = scanner.nextInt();
        }

        // Get number of targets
        System.out.print("Enter the total no of targets that needs to be achieved: ");
        int targetCount = scanner.nextInt();

        // Process each target
        for (int i = 0; i < targetCount; i++) {
            System.out.print("Enter the value of target: ");
            int target = scanner.nextInt();

            int currentSum = 0;
            int transactionIndex = 0;

            while (transactionIndex < transactionCount && currentSum < target) {
                currentSum += transactions[transactionIndex];
                transactionIndex++;
            }

            if (currentSum >= target) {
                System.out.println("Target achieved after " + transactionIndex + " transactions");
            } else {
                System.out.println("Given target is not achieved");
            }
        }
    }
}
