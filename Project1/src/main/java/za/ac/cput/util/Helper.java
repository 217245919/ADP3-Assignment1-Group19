package za.ac.cput.util;

import java.nio.charset.StandardCharsets;
import java.util.UUID;

public class Helper {

    //Bookings Strings
    static String aString = "0aa00000-a000-00a0-a0a0-00a00aa00a0a";
    static  String bString = "1bb11111-b111-11b1-b1b1-11b11bb11b1b";
    static String cString = "2cc22222-c222-22c2-c2c2-22c22cc22c2c";


    /////////////////
    public static String generateId() {
        return UUID.randomUUID().toString();
    }
    public static String generatebookingId(){return UUID.fromString(aString).toString();}
    public static String generatebranchId(){return UUID.fromString(bString).toString();}
    public static String generatecustId(){return UUID.fromString(cString).toString();}


    public static boolean isNullorEmpty(String s) {
        return(s == null || s.equals("") || s.isEmpty() || s.equalsIgnoreCase("null"));
    }
}
