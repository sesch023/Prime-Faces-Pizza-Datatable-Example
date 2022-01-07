package de.fhswf.fit;

public class Util {
    private Util(){}

    public static int getInteger(String string) {
        try {
            return Integer.parseInt(string);
        }
        catch (NumberFormatException ex) {
            return 0;
        }
    }

    public static double getDouble(String string) {
        try {
            return Double.parseDouble(string);
        }
        catch (NumberFormatException ex) {
            return 0.0;
        }
    }
}
