package entities;

import lombok.Data;
import org.hibernate.mapping.Set;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name="Alunos")

public class Aluno implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id_aluno", nullable = false)
    private Long idAluno;

    @Column(name="Nome", nullable = false)
    private String nomeAluno;

    @Column(name="CPF", unique = true ,nullable = false)
    private String cpf;

    @Column(name="Email", nullable = false)
    private String email;

    @Column(name="Telefone", nullable = false)
    private String telefone;

    @Column(name="Senha", nullable = false)
    private String senha;

    @Column(name="Data_de_nascimento", nullable = false)
    private String aniversario;

    @Column(name="CEP", nullable = false)
    private String enderecoCep;

    @Column(name="Numero_do_endereco", nullable = false)
    private String enderecoNumero;

    @Column(name="Deficiencia", nullable = false)
    private String deficiencia;

    @Column(name="Linguagem_principal", nullable = false)
    private String linguagemPrincipal;

    //@OneToMany(mappedBy = "Cursos")
    //Set<Cursos> cursos;

    @ManyToMany
    @JoinTable(name = "alunos_cursos",
            joinColumns = { @JoinColumn(name = "fk_alunos") },
            inverseJoinColumns = { @JoinColumn(name = "fk_cursos") })
    private List<Cursos> cursos = new ArrayList<Cursos>();

    @OneToOne(mappedBy = "aluno")
    private Experiencias experiencias;
}
