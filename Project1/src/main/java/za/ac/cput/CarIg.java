/*
*Group 19
* Keallan Saunders 219169357
* SECTION B :::::: SMALL TDD Program
* 30 March 2022
* CarIg.java   +   CarIgTest.java
* ADP3 ASSIGNMENT 1
* */


package za.ac.cput;

public class CarIg {
    private String sname;
    private boolean boost = true;

    public CarIg(String sname){
        this.sname= sname;
    }
    public String getSname(){
        return sname;
    }
    public boolean Boosting(){

        return boost;
    }
}
