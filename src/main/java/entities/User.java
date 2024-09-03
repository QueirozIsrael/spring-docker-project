package entities;

import jakarta.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String cpf;

    private String telefone;

    private Double renda;

    @OneToOne
    @JoinColumn(name = "id_usuario")
    private Proposal proposta;
}
