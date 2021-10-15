package entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "Experiencia")

public class Experiencias implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id_da_experiencia", nullable = false)
    private int idExperiencia;

    @Column(name="Tipo_experiencia", nullable = false)
    private String tipoExperiencia;

    @Column(name="Tempo_experiencia", nullable = false)
    private int tempoExperiencia;

    @Column(name="Resumo_experiencia", nullable = false)
    private String ResumoExperiencia;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="Id_do_Aluno", referencedColumnName = "id")
    private Aluno aluno;

}
