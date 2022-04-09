package za.ac.cput.repository;
/*
    UpholsteryRepository.java
    Repository for the Upholstery
    Wajedien Samuels (216287820)
    10 April 2022
 */

import za.ac.cput.domain.Upholstery;

import java.util.HashSet;
import java.util.Set;

public class UpholsteryRepository implements IUpholsteryRepository {
    private static UpholsteryRepository repository = null;
    private Set<Upholstery> upholsteryDB = null;

    public UpholsteryRepository() { upholsteryDB = new HashSet<Upholstery>();}

    public static UpholsteryRepository getRepository(){
        if(repository == null){
            repository = new UpholsteryRepository();
        }
        return repository;
    }


    @Override
    public Upholstery create(Upholstery upholstery) {
        boolean created = upholsteryDB.add(upholstery);
        if(!created)
            return null;
        return upholstery;
    }

    @Override
    public Upholstery read(String upholsteryId) {
        for (Upholstery u : upholsteryDB)
            if(u.getUpholsteryId().equals(upholsteryId)){
                return u;
            }
        return null;
    }

    @Override
    public Upholstery update(Upholstery upholstery) {
        Upholstery oldUpholstery = read(upholstery.getUpholsteryId());
        if (oldUpholstery !=null){
            upholsteryDB.remove(oldUpholstery);
            upholsteryDB.add(upholstery);
            return upholstery;
        }
        return null;
    }

    @Override
    public boolean delete(String upholsteryId) {
        Upholstery upholsteryToDelete = read(upholsteryId);
        if(upholsteryToDelete == null)
            return false;
        upholsteryDB.remove(upholsteryToDelete);
        return true;
    }

    @Override
    public Set<Upholstery> getAll() {
        return upholsteryDB;
    }
}
