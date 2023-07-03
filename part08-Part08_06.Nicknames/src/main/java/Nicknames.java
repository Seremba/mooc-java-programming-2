
import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {
        // Do the operations required here!
        HashMap<String, String> nickNames = new HashMap<>();
        nickNames.put("matthew", "matt");
        nickNames.put("micheal", "mix");
        nickNames.put("arthur", "artie");

        String matthew = nickNames.get("matthew");
        System.out.println(matthew);
    }

}
