package dao;

import entities.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresaDAO extends JpaRepository <Empresa, Long> {
}
