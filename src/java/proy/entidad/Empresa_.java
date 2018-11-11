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
public class Empresa_ {
    private Integer id;
    private String nombre;
    private String imagen;
    private String tipo;
    private int ruta;
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getRuta() {
        return ruta;
    }
    
    public void setRuta(int ruta) {
        this.ruta = ruta;
    }
    
    
    @Override
    public String toString() {
        return "Empresa_{" + "id=" + id + ", nombre=" + nombre + ", imagen=" + imagen + ", tipo=" + tipo + '}';
    } 
}
