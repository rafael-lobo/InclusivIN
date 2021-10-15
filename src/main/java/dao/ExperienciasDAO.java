package dao;

import entities.Experiencias;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciasDAO extends JpaRepository <Experiencias, Long> {
}
