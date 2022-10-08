package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import za.ac.cput.domain.Upholstery;
import za.ac.cput.service.UpholsteryService;
import za.ac.cput.service.UpholsteryService;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("upholstery")
public class UpholsteryController {

    private final UpholsteryService upholsteryService;

    @Autowired
    public UpholsteryController(UpholsteryService upholsteryService) {
        this.upholsteryService = upholsteryService;
    }

    @PostMapping("save")
    public ResponseEntity<Upholstery> save(@RequestBody Upholstery upholstery){
        Upholstery save = upholsteryService.save(upholstery);
        return ResponseEntity.ok(save);
    }

    @GetMapping("read/{id}")
    public ResponseEntity<Upholstery> read(@PathVariable String id){
        Upholstery upholstery = this.upholsteryService.read(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        return ResponseEntity.ok(upholstery);
    }

    @DeleteMapping("delete")
    public ResponseEntity<Void> delete(@PathVariable String id){
        this.upholsteryService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("all")
    public ResponseEntity<List<Upholstery>> findAll(){
        List<Upholstery> upholsteries = this.upholsteryService.findAll();
        return ResponseEntity.ok(upholsteries);
    }


}
