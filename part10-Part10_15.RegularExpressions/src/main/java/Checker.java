
public class Checker {

    public boolean isDayOfWeek(String string) {
        String pattern = "^(mon|tue|wed|thu|fri|sat|sun)$";

        if (string.matches(pattern)) {
            return true;
        }
        return false;
    }

   
}
