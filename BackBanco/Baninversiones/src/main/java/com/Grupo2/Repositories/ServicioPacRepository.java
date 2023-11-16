package com.Grupo2.Repositories;

import com.Grupo2.DTO.DatosCliente;
import com.Grupo2.Models.ServicioPac;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ServicioPacRepository extends JpaRepository<ServicioPac,Long> {

    @Query("SELECT NEW com.Grupo2.DTO.DatosCliente(pac.servicioPacId, cli.rut, cli.nombre, cli.apellido, cue.nombreBanco, cue.cuentasId, pac.monto, prod.nombreProducto) " +
            "FROM ServicioPac pac " +
            "INNER JOIN Producto prod ON prod.productoId = pac.producto.productoId " +
            "INNER JOIN Clientes cli ON cli.clientesId = pac.cliente.clientesId " +
            "INNER JOIN Cuentas cue ON cue.cliente.clientesId = cli.clientesId " +
            "WHERE cli.rut = :rutParam AND prod.productoId = :productoIdParam AND DAY(pac.fecha) = :dayParam")
    List<DatosCliente> findCustomQueryResults(
            @Param("rutParam") String rut,
            @Param("productoIdParam") Long productoId,
            @Param("dayParam") int day
    );
    @Query("SELECT NEW com.Grupo2.DTO.DatosCliente(pac.servicioPacId, cli.rut, cli.nombre,cli.apellido, cue.nombreBanco, cue.cuentasId, pac.monto, prod.nombreProducto) " +
            "FROM ServicioPac pac " +
            "INNER JOIN Producto prod ON prod.productoId = pac.producto.productoId " +
            "INNER JOIN Clientes cli ON cli.clientesId = pac.cliente.clientesId " +
            "INNER JOIN Cuentas cue ON cue.cliente.clientesId = cli.clientesId " +
            "WHERE cli.rut = :rutParam AND prod.productoId = :productoIdParam")
    List<DatosCliente> findByProductAndRut(
            @Param("rutParam") String rut,
            @Param("productoIdParam") Long productoId

    );
    @Query("SELECT NEW com.Grupo2.DTO.DatosCliente(pac.servicioPacId, cli.rut, cli.nombre,cli.apellido, cue.nombreBanco, cue.cuentasId, pac.monto, prod.nombreProducto) " +
            "FROM ServicioPac pac " +
            "INNER JOIN Producto prod ON prod.productoId = pac.producto.productoId " +
            "INNER JOIN Clientes cli ON cli.clientesId = pac.cliente.clientesId " +
            "INNER JOIN Cuentas cue ON cue.cliente.clientesId = cli.clientesId " +
            "WHERE cli.rut = :rutParam AND DAY(pac.fecha) = :dayParam")

    List<DatosCliente> findByRutAndDay(
            @Param("rutParam") String rut,
            @Param("dayParam") int day

    );
    @Query("SELECT NEW com.Grupo2.DTO.DatosCliente(pac.servicioPacId, cli.rut, cli.nombre,cli.apellido, cue.nombreBanco, cue.cuentasId, pac.monto, prod.nombreProducto) " +
            "FROM ServicioPac pac " +
            "INNER JOIN Producto prod ON prod.productoId = pac.producto.productoId " +
            "INNER JOIN Clientes cli ON cli.clientesId = pac.cliente.clientesId " +
            "INNER JOIN Cuentas cue ON cue.cliente.clientesId = cli.clientesId " +
            "WHERE prod.productoId = :productoIdParam AND DAY(pac.fecha) = :dayParam")

    List<DatosCliente> findByProductAndDay(
            @Param("productoIdParam") Long productoId,
            @Param("dayParam")int day);


    @Query("SELECT NEW com.Grupo2.DTO.DatosCliente(pac.servicioPacId, cli.rut, cli.nombre,cli.apellido, cue.nombreBanco, cue.cuentasId, pac.monto, prod.nombreProducto) " +
            "FROM ServicioPac pac " +
            "INNER JOIN Producto prod ON prod.productoId = pac.producto.productoId " +
            "INNER JOIN Clientes cli ON cli.clientesId = pac.cliente.clientesId " +
            "INNER JOIN Cuentas cue ON cue.cliente.clientesId = cli.clientesId " +
            "WHERE prod.productoId = :productoIdParam")
    List<DatosCliente> findByProduct(
            @Param("productoIdParam") Long productoId
    );

    @Query("SELECT NEW com.Grupo2.DTO.DatosCliente(pac.servicioPacId, cli.rut, cli.nombre,cli.apellido, cue.nombreBanco, cue.cuentasId, pac.monto, prod.nombreProducto) " +
            "FROM ServicioPac pac " +
            "INNER JOIN Producto prod ON prod.productoId = pac.producto.productoId " +
            "INNER JOIN Clientes cli ON cli.clientesId = pac.cliente.clientesId " +
            "INNER JOIN Cuentas cue ON cue.cliente.clientesId = cli.clientesId " +
            "WHERE DAY(pac.fecha) = :dayParam")

    List<DatosCliente> findByDay(
            @Param("dayParam")int day
    );

    @Query("SELECT NEW com.Grupo2.DTO.DatosCliente(pac.servicioPacId, cli.rut, cli.nombre,cli.apellido, cue.nombreBanco, cue.cuentasId, pac.monto, prod.nombreProducto) " +
            "FROM ServicioPac pac " +
            "INNER JOIN Producto prod ON prod.productoId = pac.producto.productoId " +
            "INNER JOIN Clientes cli ON cli.clientesId = pac.cliente.clientesId " +
            "INNER JOIN Cuentas cue ON cue.cliente.clientesId = cli.clientesId " +
            "WHERE cli.rut = :rutParam")

    List<DatosCliente> findByRut(
            @Param("rutParam") String rut
    );
    @Query("SELECT NEW com.Grupo2.DTO.DatosCliente(pac.servicioPacId, cli.rut, cli.nombre,cli.apellido, cue.nombreBanco, cue.cuentasId, pac.monto, prod.nombreProducto) " +
            "FROM ServicioPac pac " +
            "INNER JOIN Producto prod ON prod.productoId = pac.producto.productoId " +
            "INNER JOIN Clientes cli ON cli.clientesId = pac.cliente.clientesId " +
            "INNER JOIN Cuentas cue ON cue.cliente.clientesId = cli.clientesId "
    )
    List<DatosCliente> findByAll(

    );
}
