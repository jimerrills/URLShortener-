package co.jamiemerrills.urlshortener.util;

public class CC {
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String BLUE = "\u001B[34m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";

    public static final String GRAY = "\u001B[90m";


    public static String formatColoredMessage(String template, String color, Object... variables) {
        return color + String.format(template, variables) + RESET;
    }
}
