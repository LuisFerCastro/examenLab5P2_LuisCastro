/* Fila 1 Asiento 3
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenlab5p2_luiscastro;

import java.util.Date;

/**
 *
 * @author lfern
 */
public class Tramites {
    String nom_tram;
    String descripcion;
    Date fecha;
    String identidad;

    public Tramites() {
    }

    public Tramites(String nom_tram, String descripcion) {
        this.nom_tram = nom_tram;
        this.descripcion = descripcion;
    }
    
    public Tramites(String nom_tram, String descripcion, Date fecha, String identidad) {
        this.nom_tram = nom_tram;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.identidad = identidad;
    }

    public String getNom_tram() {
        return nom_tram;
    }

    public void setNom_tram(String nom_tram) {
        this.nom_tram = nom_tram;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getIdentidad() {
        return identidad;
    }

    public void setIdentidad(String identidad) {
        this.identidad = identidad;
    }

    @Override
    public String toString() {
        return "Nombre: " + nom_tram + ", Descripcion: " +descripcion;
    }
    
}
