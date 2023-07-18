
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number < 0) {
                numbers.stream()
                        .filter(num -> num >= 1 && num <= 5)
                        .forEach(val -> System.out.println(val));
                return;
            }
            numbers.add(number);
        }

    }
}
