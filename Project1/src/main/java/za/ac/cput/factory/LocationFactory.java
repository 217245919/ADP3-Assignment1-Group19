/*
Keallan Saunders 219169357
ADP3 ASSIGNMENT1
DD: 10 APRIL 2022
LocationFactory.java
**************** DO NOT TOUCH ********************
 */
package za.ac.cput.factory;

import za.ac.cput.domain.Location;
import za.ac.cput.util.Helper;

public class LocationFactory {
    public static Location createLocation(String branchName, String branchCellno){
        String branchId = Helper.generatebranchId();
        String branchLoca = Helper.generatbranchLoc();
        String delivBId = Helper.generateDelBId();

        Location location = new Location.Builder().setBranchId(branchId)
                .setBranchName(branchName)
                .setBranchCellno(branchCellno)
                .build();
        return location;
    }
}
