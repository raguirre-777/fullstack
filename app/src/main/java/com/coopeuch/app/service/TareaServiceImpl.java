package com.coopeuch.app.service;

import java.util.List;

import com.coopeuch.app.models.dao.TareaDao;
import com.coopeuch.app.models.entity.Tarea;
import com.coopeuch.app.service.interfaces.ITareasService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TareaServiceImpl implements ITareasService {

    @Autowired
    private TareaDao tareaDao;

    @Override
    public List<Tarea> getAllTareas() {
        return tareaDao.getAllTareas();
    }

    @Override
    public Tarea save(Tarea tarea) {
        return tareaDao.save(tarea);
    }

    @Override
    public Boolean delete(Long id) {
        this.tareaDao.deleteById(id);
        return true;

    }

    @Override
    public Tarea update(Tarea tarea) {
        return tareaDao.save(tarea);
    }

}
