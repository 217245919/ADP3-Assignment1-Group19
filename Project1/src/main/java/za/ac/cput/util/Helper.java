package za.ac.cput.util;

import java.util.UUID;

public class Helper {

    public static boolean isNullorEmpty(String s) {
        return(s == null || s.equals("") || s.isEmpty() || s.equalsIgnoreCase("null"));
    }

    public static String generateId() {
        return UUID.randomUUID().toString();
    }
    public static String generatebookingId(){return UUID.fromString("0001").toString();}
    public static String generatebranchId(){return UUID.fromString("#712CPT").toString();}
    public static String generatecustId(){return UUID.fromString("#CCT0004").toString();}
    public static String generatbranchLoc(){return UUID.fromString("Cape Town Central").toString();}
    public static String generateDelBId(){return UUID.randomUUID().toString();}
}
