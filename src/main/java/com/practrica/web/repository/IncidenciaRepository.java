package com.practrica.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practrica.web.entity.Equipo;

@Repository
public interface IncidenciaRepository extends JpaRepository<Equipo,Long> {

}
