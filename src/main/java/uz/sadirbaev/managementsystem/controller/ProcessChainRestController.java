package uz.sadirbaev.managementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.sadirbaev.managementsystem.entity.ProcessChain;
import uz.sadirbaev.managementsystem.repository.ProcessChainRepository;

import java.util.List;

@RestController
public class ProcessChainRestController {

    @Autowired
    ProcessChainRepository processChainRepository;

    @GetMapping("/process-chains")
    public ResponseEntity<List<ProcessChain>> getAllProcessChainList() {
        try {
            List<ProcessChain> processChainList = processChainRepository.findAll();
            if (processChainList.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(processChainList, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
