package com.coopeuch.app.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "tarea")
public class Tarea implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long idTareas;

    @NotBlank(message = "campo obligatorio")
    @NotNull(message = "campo obligatorio")
    @NotEmpty
    private String descripcion;

    @NotBlank(message = "campo obligatorio")
    @NotNull(message = "campo obligatorio")
    @NotEmpty
    @Column(name = "fechacreacion")
    private Date fechaCreacion;

    @NotNull(message = "campo obligatorio")
    @AssertTrue
    private Boolean vigencia;

    public Long getIdTareas() {
        return idTareas;
    }

    public void setIdTareas(Long idTareas) {
        this.idTareas = idTareas;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Boolean getVigencia() {
        return vigencia;
    }

    public void setVigencia(Boolean vigencia) {
        this.vigencia = vigencia;
    }

}
