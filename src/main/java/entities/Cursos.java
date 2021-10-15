package entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Data
@Entity
@Table(name="Cursos")

public class Cursos implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id_do_curso", nullable = false)
    private Long idCurso;

    @Column(name="Nome_do_curso", nullable = false)
    private String nomeDoCurso;

    @Column(name="Turno", nullable = false)
    private String turno;

    @Column(name="Campus", nullable = false)
    private String campus;

    @Column(name="Data_de_início", nullable = false)
    private String dataInicio;

    @Column(name="Data_de_termino", nullable = false)
    private String dataFim;

    @Column(name="Modalidade", nullable = false)
    private String modalidade;

    /*@ManyToMany
    @JoinTable(name = "book_author",
            joinColumns = { @JoinColumn(name = "fk_book") },
            inverseJoinColumns = { @JoinColumn(name = "fk_author") })
    private List<Author> authors = new ArrayList<Author>();
     */

    @ManyToMany
    @JoinTable(name = "cursos_disciplinas",
            joinColumns = { @JoinColumn(name = "fk_cursos") },
            inverseJoinColumns = { @JoinColumn(name = "fk_disciplinas") })
    private List<Disciplinas> disciplinas = new ArrayList<Disciplinas>();

    @ManyToMany(mappedBy = "cursos")
    private List<Aluno> alunos = new ArrayList<Aluno>();
}
