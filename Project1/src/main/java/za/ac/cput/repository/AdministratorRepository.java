package za.ac.cput.repository;

/* AdministratorRepository.java
 Entity for the AdministratorRepository
 Author: Tyler Yorke Fredericks (218047894)
 Date: 10 April 2022
*/

import za.ac.cput.domain.Administrator;

import java.util.HashSet;
import java.util.Set;

public class AdministratorRepository implements IAdministratorRepository{

    private static AdministratorRepository repository = null;
    private Set<Administrator> adminDB = null;
    public AdministratorRepository() { adminDB = new HashSet<Administrator>();}

    static AdministratorRepository getRepository() {
        if (repository == null) {
            repository = new AdministratorRepository();
        }
        return repository;
    }



    @Override
    public Administrator create(Administrator administrator) {
        boolean created = adminDB.add(administrator);
        if (!created) return null;
        return administrator;
    }

    @Override
    public Administrator read(String adminId) {
        Administrator administrator = adminDB.stream()
                .filter(e -> e.getAdminId().equals(adminId))
                .findAny()
                .orElse(null);
        return administrator;
    }

    @Override
    public Administrator update(Administrator administrator) {
        Administrator oldAdministrator = read(administrator.getAdminId());
        if (oldAdministrator != null) {
            adminDB.remove(oldAdministrator);
            adminDB.add(administrator);
            return administrator;
        }
        return null;
    }

    @Override
    public boolean delete(String adminId) {
        Administrator deleteAdmin = read(adminId);
        if (deleteAdmin == null)
            return false;
        adminDB.remove(deleteAdmin);
        return true;
    }

    @Override
    public Set<Administrator> getAll() {
        return adminDB;
    }
}
