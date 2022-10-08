package za.ac.cput.service;

import za.ac.cput.domain.Upholstery;
import za.ac.cput.service.IService;

import java.util.List;
import java.util.Set;

public interface UpholsteryService extends IService<Upholstery, String> {
    List<Upholstery> findAll();

    void deleteById(String id);
}
