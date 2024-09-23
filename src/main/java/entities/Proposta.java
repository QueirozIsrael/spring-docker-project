package entities;

import jakarta.persistence.*;
import org.springframework.context.annotation.EnableMBeanExport;

@Entity
public class Proposta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double valorSolicitado;

    private int prazoPagamento;

    private Boolean aprovada;

    private boolean integrada;

    private String observacao;

    @OneToOne(mappedBy = "id_usuario")
    private Usuario usuario;

}
