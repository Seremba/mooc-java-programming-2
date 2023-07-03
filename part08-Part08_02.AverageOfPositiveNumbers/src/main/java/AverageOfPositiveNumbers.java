
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int sum = 0;
        double average = 0;
        while (true) {
            int num = Integer.valueOf(scanner.nextLine());
            if (num == 0) {
                break;
            }

            if (num >= 0) {
                total += 1;
                sum += num;
                average = 1.0 * sum / total;
            }
        }

        if (total <= 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(average);
        }
    }
}
