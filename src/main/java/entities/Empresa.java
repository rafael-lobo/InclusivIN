package entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Empresa")
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id_da_empresa", nullable = false)
    private Long idEmpresa;

    @Column(name="Nome_empresa", nullable = false)
    private String nomeEmpresa;
}
