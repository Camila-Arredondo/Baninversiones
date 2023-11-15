package com.Grupo2.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table (name = "cuentas")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Cuentas {
    @Id
    @Column(name = "ID_Cuenta")
    private long cuentasId;

    @Column(name = "Nombre_De_Banco")
    private String nombreBanco;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Clientes cliente;


}
