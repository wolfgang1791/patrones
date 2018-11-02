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
public class Empresa {
    
    private Integer id_empresa;
    private String nombre;
    private String imagen;
    private Integer id_ruta;
    private String codigo_ruta;
    private Integer id_paradero;
    private String descripcion;
    private Double latitud;
    private Double longitud;

    public Integer getId_empresa() {
        return id_empresa;
    }

    public void setId_empresa(Integer id_empresa) {
        this.id_empresa = id_empresa;
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

    public Integer getId_ruta() {
        return id_ruta;
    }

    public void setId_ruta(Integer id_ruta) {
        this.id_ruta = id_ruta;
    }

    public String getCodigo_ruta() {
        return codigo_ruta;
    }

    public void setCodigo_ruta(String codigo_ruta) {
        this.codigo_ruta = codigo_ruta;
    }

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

    @Override
    public String toString() {
        return "Empresa{" + "id_empresa=" + id_empresa + ", nombre=" + nombre + ", imagen=" + imagen + ", id_ruta=" + id_ruta + ", codigo_ruta=" + codigo_ruta + ", id_paradero=" + id_paradero + ", descripcion=" + descripcion + ", latitud=" + latitud + ", longitud=" + longitud + '}';
    }
    
}
