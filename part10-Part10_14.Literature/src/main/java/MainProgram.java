
import java.util.ArrayList;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        while (true) {
            System.out.println("Input the name of the book, empty stops: ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            System.out.println("Input the age recommendation: ");
            int age = Integer.valueOf(scanner.nextLine());
            books.add(new Book(name, age));
        }
        System.out.println(books.size() + " books in total.");
        System.out.println("Books: ");
        
        
        books.stream().sorted((book1,book2) -> {
            return book1.getAge() - book2.getAge();
        }).forEach(book -> System.out.println(book));
    }

}
