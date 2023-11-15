package com.Grupo2.Models;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "pac")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ServicioPac {
    @Id
    @Column(name = "ID_Codigo_de_Servicio")
    private String servicioPacId;

    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date fecha;

    private Long monto;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Clientes cliente;

    @ManyToOne
    @JoinColumn(name = "id_producto")
    private Producto producto;

}

