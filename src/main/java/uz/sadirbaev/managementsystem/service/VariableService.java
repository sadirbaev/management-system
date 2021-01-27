package uz.sadirbaev.managementsystem.service;

import uz.sadirbaev.managementsystem.model.Variable;

import java.util.List;

public interface VariableService  {
    List<Variable> variableList(String line, String machine, String product);
}
