package za.ac.cput.factory;

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
