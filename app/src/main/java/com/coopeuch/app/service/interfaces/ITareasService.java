package com.coopeuch.app.service.interfaces;

import java.util.List;

import com.coopeuch.app.models.entity.Tarea;

public interface ITareasService {

    public List<Tarea> getAllTareas();

    public Tarea save(Tarea tarea);

    public Boolean delete(Long id);

    public Tarea update(Tarea tarea);

}
