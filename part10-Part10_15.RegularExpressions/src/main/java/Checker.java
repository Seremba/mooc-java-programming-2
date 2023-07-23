
public class Checker {

    public boolean isDayOfWeek(String string) {
        String pattern = "^(mon|tue|wed|thu|fri|sat|sun)$";

        if (string.matches(pattern)) {
            return true;
        }
        return false;
    }

    public boolean allVowels(String string) {

        String pattern = "^[aeiouAEIOU]+$";

        if (string.matches(pattern)) {
            return true;
        }
        return false;
    }

    public boolean timeOfDay(String string) {
        String pattern = "^([0-1][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]$";
        if (string.matches(pattern)) {
            return true;
        }
        return false;
    }
}
