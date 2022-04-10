package za.ac.cput.repository;

import za.ac.cput.domain.Administrator;

import java.util.Set;

public class AdministratorRepository implements IAdministratorRepository{

    private static AdministratorRepository repository = null;
    private Set<Administrator> adminDB = null;

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
