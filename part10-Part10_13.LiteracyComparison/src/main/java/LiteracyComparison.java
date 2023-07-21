
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class LiteracyComparison {

    public static void main(String[] args) {
        ArrayList<Statistics> literacies = new ArrayList<>();
        try (Scanner input = new Scanner(new File("literacy.csv"))) {
            while (input.hasNextLine()) {
                String line = input.nextLine();
                String[] pieces = line.split(",");
                String countryName = pieces[3];
                int year = Integer.valueOf(pieces[4]);
                String[] genderField = pieces[2].split(" ");
                String gender = genderField[1];
                double literacyPercentage = Double.valueOf(pieces[5]);
                literacies.add(new Statistics(countryName, year, gender, literacyPercentage));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }    

        literacies.stream().sorted((country1, country2) -> {
            return Double.valueOf(country1.getPercentage()).compareTo(Double.valueOf(country2.getPercentage()));
        }).forEach(country -> System.out.println(country));

    }

}

// Adult literacy rate, population 15+ years, female (%),United Republic of Tanzania,2015,76.08978
