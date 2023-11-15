package com.Grupo2.Repositories;

import com.Grupo2.Models.Cuentas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CuentasRepository extends JpaRepository<Cuentas, Long> {

}
