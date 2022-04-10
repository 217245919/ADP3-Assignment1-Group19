package za.ac.cput.repository;

import za.ac.cput.domain.Service;

import java.util.Set;

public interface IServiceRepository extends IRepository<Service, String> {

    public Set<Service> getAll();
}
