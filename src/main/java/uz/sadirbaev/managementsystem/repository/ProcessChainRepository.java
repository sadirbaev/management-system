package uz.sadirbaev.managementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.sadirbaev.managementsystem.entity.ProcessChain;

public interface ProcessChainRepository extends JpaRepository<ProcessChain, Integer> {
}
