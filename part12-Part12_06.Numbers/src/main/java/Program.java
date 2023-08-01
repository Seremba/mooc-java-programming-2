
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many random numbers should be printed?");
        int number = Integer.valueOf(scanner.nextLine());
        Random rand = new Random();
        for (int i = 0; i < number; i++) {
            int num = rand.nextInt(11);
            System.out.println(num);
        }
    }

}
