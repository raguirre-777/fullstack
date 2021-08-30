package com.coopeuch.app.controller;

import java.util.List;

import javax.validation.Valid;
import com.coopeuch.app.models.entity.Tarea;
import com.coopeuch.app.service.interfaces.ITareasService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;

import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping("/tarea")
@Validated
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST })
public class TareaController {

    @Autowired
    ITareasService tareaService;

    @GetMapping("/listar")
    public List<Tarea> listar() {
        return tareaService.getAllTareas();
    }

    @PostMapping("/crear")
    @ResponseStatus(HttpStatus.CREATED)
    public Tarea crearTarea(@Valid @RequestBody Tarea tarea) {
        Tarea temporal = tareaService.save(tarea);
        return temporal;
    }

    @DeleteMapping("/eliminar/{id}")
    public Boolean eliminar(@PathVariable Long id) {
        return tareaService.delete(id);
    }

}
