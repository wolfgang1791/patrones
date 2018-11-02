/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proy.entidad;

/**
 *
 * @author Jonathan
 */
public class Paradero {
    private Integer id_paradero;
    private String descripcion;
    private Double latitud;
    private Double longitud;

    public Integer getId_paradero() {
        return id_paradero;
    }

    public void setId_paradero(Integer id_paradero) {
        this.id_paradero = id_paradero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getLatitud() {
        return latitud;
    }

    public void setLatitud(Double latitud) {
        this.latitud = latitud;
    }

    public Double getLongitud() {
        return longitud;
    }

    public void setLongitud(Double longitud) {
        this.longitud = longitud;
    }

    
}
