/*
 * SECTION B : SMALL TDD PROGRAM
 * Keallan Saunders 219169357
 * 30 March 2022
 * Thesun.java
 *
 * */
package za.ac.cput;

public class Thesun {
    private String sname;
    private boolean boost = true;

    public Thesun(String sname){
        this.sname= sname;
    }
    public String getSname(){
        return sname;
    }
    public boolean Boosting(){

        return boost;
    }
}

