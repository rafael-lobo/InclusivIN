package services;

import dao.CursosDAO;
import entities.Cursos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursosService {

    @Autowired
    private CursosDAO cursosDAO;

    public void salvar(Cursos cursos){
        cursosDAO.save(cursos);
    }

    public List<Cursos> findAll(){
        return cursosDAO.findAll();
    }
}
