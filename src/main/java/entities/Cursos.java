package entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Data
@Entity
@Table(name="Cursos")

public class Cursos implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID_do_curso", nullable = false)
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

    @ManyToMany(mappedBy = "Disciplinas")
    Set<Disciplinas> disciplinas;
}
