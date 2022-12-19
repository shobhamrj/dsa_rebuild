package StringsAndCharacters;

public class DigitalClock {

    //
    public static String convertToString(int minutes) {
        int hours = minutes / 60;
        minutes = minutes % 60;
        return Integer.toString(hours) + ":" + (minutes < 10 ? "0" : "") + Integer.toString(minutes);      
    }
}
