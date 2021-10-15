package dao;

import entities.Cursos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursosDAO extends JpaRepository<Cursos, Long> {

}
