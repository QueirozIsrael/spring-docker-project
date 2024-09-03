package entities;

import jakarta.persistence.*;
import org.springframework.context.annotation.EnableMBeanExport;

@Entity
public class Proposal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double valorSolicitado;

    private int prazoPagamento;

    private Boolean aprovada;

    @OneToOne(mappedBy = "id_usuario")
    private User usuario;

}
