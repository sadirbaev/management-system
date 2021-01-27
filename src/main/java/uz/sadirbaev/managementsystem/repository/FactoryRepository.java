package uz.sadirbaev.managementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.sadirbaev.managementsystem.entity.Factory;

public interface FactoryRepository extends JpaRepository<Factory, Integer> {
}
