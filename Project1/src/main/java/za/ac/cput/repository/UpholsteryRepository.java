package za.ac.cput.repository;
/*
    UpholsteryRepository.java
    Repository for the Upholstery
    Wajedien Samuels (216287820)
    10 April 2022
 */

import org.springframework.stereotype.Repository;
import za.ac.cput.domain.Upholstery;

import java.util.*;

@Repository
public class UpholsteryRepository implements IUpholsteryRepository {
    private final List<Upholstery> upholsteryList;

    public UpholsteryRepository() {
        this.upholsteryList = new ArrayList<>();
    }

    public static UpholsteryRepository upholsteryRepository() {
        return null;
    }

    @Override
    public Upholstery save(Upholstery upholstery) {
        Optional<Upholstery> read = read(upholstery.getUpholsteryId());
        if (read.isPresent()) {
            delete(read.get());
        }
        return upholstery;
    }

    @Override
    public Optional<Upholstery> read(String id) {
        return this.upholsteryList.stream().filter(g -> g.getUpholsteryId().equalsIgnoreCase(id))
                .findFirst();
    }

    @Override
    public void delete(Upholstery upholstery) {
        this.upholsteryList.remove(upholstery);
    }


    public List<Upholstery> findAll() {
        return null;
    }
}