package uz.sadirbaev.managementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import uz.sadirbaev.managementsystem.entity.ProcessChain;
import uz.sadirbaev.managementsystem.model.Variable;
import uz.sadirbaev.managementsystem.model.VariableRequestBody;
import uz.sadirbaev.managementsystem.repository.ProcessChainRepository;
import uz.sadirbaev.managementsystem.service.VariableService;

import java.util.List;

@Controller
public class VariableRestController {

    @Autowired
    VariableService variableService;

    @PostMapping("/variables")
    public ResponseEntity<List<Variable>> getAllProcessChainList(@RequestBody VariableRequestBody requestBody) {
        try {
            List<Variable> variableList = variableService.variableList(requestBody.getLine(), requestBody.getMachine(), requestBody.getProduct());
            if (variableList.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(variableList, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
