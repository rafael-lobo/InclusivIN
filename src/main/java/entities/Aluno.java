package entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Data
@Table(name="Alunos")

public class Aluno implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID", nullable = false)
    private Long idAluno;

    @Column(name="Nome", nullable = false)
    private String nomeAluno;

    @Column(name="CPF", unique = true ,nullable = false)
    private String cpf;

    @Column(name="E-mail", nullable = false)
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

    @Column(name="Deficiência", nullable = false)
    private String deficiencia;

    @Column(name="Linguagem_principal", nullable = false)
    private String linguagemPrincipal;

    @OneToMany(mappedBy = "Cursos")
    Set<Cursos> cursos;
}
