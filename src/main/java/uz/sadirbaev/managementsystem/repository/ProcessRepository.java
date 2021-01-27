package uz.sadirbaev.managementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.sadirbaev.managementsystem.entity.Process;

public interface ProcessRepository extends JpaRepository<Process, Integer> {
}
