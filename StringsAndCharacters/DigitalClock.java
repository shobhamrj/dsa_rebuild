package StringsAndCharacters;

public class DigitalClock {

    // You are building a logic for a clock that requires you convert absolute time in minutes into a format supported by a digital clock.
    public static String convertToString(int minutes) {
        int hours = minutes / 60;
        minutes = minutes % 60;
        return Integer.toString(hours) + ":" + (minutes < 10 ? "0" : "") + Integer.toString(minutes);      
    }
}
