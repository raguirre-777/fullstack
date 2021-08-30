package com.coopeuch.app.models.dao;

import java.util.List;

import com.coopeuch.app.models.entity.Tarea;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TareaDao extends JpaRepository<Tarea, Long> {

    @Query(value = "select * from tarea", nativeQuery = true)
    public List<Tarea> getAllTareas();

    // public Tarea save(Tarea tarea);

    @Query(value = "select * from tarea " + " where id= :id", nativeQuery = true)
    public Tarea getByIdTarea(Long id);

}
