package za.ac.cput.factory;

/* AdministratorFactory.java
 Entity for the AdministratorFactory
 Author: Tyler Yorke Fredericks (218047894)
 Date: 10 April 2022
*/

import za.ac.cput.domain.Administrator;

public class AdministratorFactory {

    public static Administrator createAdministrator(String adminId, String adminFname, String adminSname) {

        Administrator administrator = new Administrator.Builder()
                .setAdminId(adminId)
                .setAdminFName(adminFname)
                .setAdminSName(adminSname)
                .build();
        return administrator;
    }
}
