package com.miniproject.veiculos.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "MULTAS")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Multa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String local;
    private String motivo;
    private Float valor;
    @ManyToOne
    @JoinColumn(name = "PLACA", referencedColumnName = "PLACA")
    private Veiculo veiculo;
}
