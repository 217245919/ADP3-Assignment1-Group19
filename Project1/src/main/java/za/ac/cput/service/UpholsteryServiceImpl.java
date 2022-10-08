package za.ac.cput.service;

import org.springframework.stereotype.Service;
import za.ac.cput.domain.Car;
import za.ac.cput.domain.Upholstery;
import za.ac.cput.repository.CarRepository;
import za.ac.cput.repository.UpholsteryRepository;
import za.ac.cput.service.lookup.CarService;
import za.ac.cput.service.CarServiceImpl;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class UpholsteryServiceImpl implements UpholsteryService {
    private final UpholsteryRepository repository;

    private UpholsteryServiceImpl(UpholsteryRepository repository) {
        this.repository = repository;
    }

    @Override
    public Upholstery save(Upholstery upholstery) {
        return this.repository.save(upholstery);
    }

    @Override
    public Optional<Upholstery> read(String s) {
        return this.repository.read(s);
    }

    @Override
    public void delete(Upholstery upholstery){
        this.repository.delete(upholstery);
    }

    @Override
    public List<Upholstery> findAll() {
        return this.repository.findAll();
    }

    @Override
    public void deleteById(String id){
        Optional<Upholstery> upholstery = read(id);
        if(upholstery.isPresent()) delete(upholstery.get());
    }
}
