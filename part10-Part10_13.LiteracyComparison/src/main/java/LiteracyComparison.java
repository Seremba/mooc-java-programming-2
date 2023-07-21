
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        Statistics  stats = new Statistics("Uganda", 2022, "Males", 80.5);
        System.out.println(stats);
    }
    public static void compareLiteracy(String file){
        try{
            
        } catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
