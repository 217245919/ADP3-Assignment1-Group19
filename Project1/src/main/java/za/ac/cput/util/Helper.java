package za.ac.cput.util;

import java.nio.charset.StandardCharsets;
import java.util.UUID;

public class Helper {

    public static boolean isNullorEmpty(String s) {
        return(s == null || s.equals("") || s.isEmpty() || s.equalsIgnoreCase("null"));
    }
    //Bookings Strings
    static String aString = "0001";
    static String bString = "#712CPT";
    static String cString = "#CCT0004";
    static String dString = "Cape Town Central";

    /////////////////
    public static String generateId() {
        return UUID.randomUUID().toString();
    }
    public static String generatebookingId(){return UUID.nameUUIDFromBytes(aString.getBytes()).toString();}
    public static String generatebranchId(){return UUID.nameUUIDFromBytes(bString.getBytes()).toString();}
    public static String generatecustId(){return UUID.nameUUIDFromBytes(cString.getBytes()).toString();}
    public static String generatbranchLoc(){return UUID.nameUUIDFromBytes(dString.getBytes()).toString();}
    public static String generateDelBId(){return UUID.randomUUID().toString();}
}
