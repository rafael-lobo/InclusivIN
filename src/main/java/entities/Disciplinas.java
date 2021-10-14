package entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Data
@Entity
@Table(name = "Disciplinas")

public class Disciplinas implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="ID_da_disciplina", nullable = false)
    private Long idDisciplina;

    @Column(name="Nome_da_disciplina", nullable = false)
    private String nomeDisciplina;

    @Column(name="Carga_horária", nullable = false)
    private int cargaHoraria;

    /*
    ManyToMany(mappedBy="authors")
    private List<Book> books = new ArrayList<Book>();
     */

    @ManyToMany(mappedBy = "disciplinas")
    private List<Cursos> cursos = new ArrayList<Cursos>();
}
