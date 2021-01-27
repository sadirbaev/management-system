package uz.sadirbaev.managementsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import uz.sadirbaev.managementsystem.entity.Factory;
import uz.sadirbaev.managementsystem.entity.Line;
import uz.sadirbaev.managementsystem.entity.ProcessChain;
import uz.sadirbaev.managementsystem.model.Variable;
import uz.sadirbaev.managementsystem.repository.FactoryRepository;
import uz.sadirbaev.managementsystem.repository.LineRepository;
import uz.sadirbaev.managementsystem.repository.ProcessChainRepository;
import uz.sadirbaev.managementsystem.repository.ProcessRepository;
import uz.sadirbaev.managementsystem.service.VariableService;

import java.util.List;


@SpringBootApplication
public class ManagementSystemApplication implements CommandLineRunner {

	FactoryRepository factoryRepository;
	LineRepository lineRepository;
	ProcessRepository processRepository;
	ProcessChainRepository processChainRepository;
	VariableService variableService;

	@Autowired
	public ManagementSystemApplication(FactoryRepository factoryRepository, LineRepository lineRepository, ProcessRepository processRepository, ProcessChainRepository processChainRepository, VariableService variableService) {
		this.factoryRepository = factoryRepository;
		this.lineRepository = lineRepository;
		this.processRepository = processRepository;
		this.processChainRepository = processChainRepository;
		this.variableService = variableService;
	}

	public static void main(String[] args) {
		SpringApplication.run(ManagementSystemApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
//		System.out.println(lineRepository.findAll());
		List<Line> lineList = lineRepository.findAll();
		List<Factory> factoryList = factoryRepository.findAll();
		List<ProcessChain> processChainList = processChainRepository.findAll();
		ProcessChain processChain = lineList.get(0).getProcessChain();
		List<Variable> variableList = variableService.variableList("HC", "HC_Balancer", "DS7E");
		System.out.println(lineRepository.findAll());
	}
}
