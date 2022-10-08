package za.ac.cput.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import za.ac.cput.domain.Car;
import za.ac.cput.service.lookup.CarService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("car")
@Slf4j
public class CarController {

    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @PostMapping("save")
    public ResponseEntity<Car> save(@RequestBody Car car){
        log.info("Save request: {}", car);
        Car save = carService.save(car);
        return ResponseEntity.ok(save);
    }

    @GetMapping("read/{id}")
    public ResponseEntity<Car> read(@PathVariable String id){
        log.info("Read request: {}", id);
        Car car = this.carService.read(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        return ResponseEntity.ok(car);

    }

    @DeleteMapping("delete")
    public ResponseEntity<Void> delete(@PathVariable String id){
        log.info("Read request: {}", id);
        this.carService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("all")
    public ResponseEntity<List<Car>> findAll(){
        List<Car> cars = this.carService.findAll();
        return ResponseEntity.ok(cars);
    }

}
