package dao;

import entities.Disciplinas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DisciplinasDAO extends JpaRepository<Disciplinas, Long> {
}
