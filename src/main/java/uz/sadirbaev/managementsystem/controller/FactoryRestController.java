package uz.sadirbaev.managementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.sadirbaev.managementsystem.entity.Factory;
import uz.sadirbaev.managementsystem.repository.FactoryRepository;

import java.util.List;

@RestController
public class FactoryRestController {

    @Autowired
    FactoryRepository factoryRepository;

    @GetMapping("/factories")
    public ResponseEntity<List<Factory>> getAllFactoryList() {
        try {
            List<Factory> factoryList = factoryRepository.findAll();
            if (factoryList.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(factoryList, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
