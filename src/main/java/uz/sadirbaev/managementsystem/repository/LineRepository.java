package uz.sadirbaev.managementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.sadirbaev.managementsystem.entity.Line;

@Repository
public interface LineRepository extends JpaRepository<Line, Integer> {
}
