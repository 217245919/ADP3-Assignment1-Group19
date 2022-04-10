package za.ac.cput.repository;

import za.ac.cput.domain.Administrator;

import java.util.Set;

public interface IAdministratorRepository extends IRepository<Administrator, String> {

    public Set<Administrator> getAll();
}
