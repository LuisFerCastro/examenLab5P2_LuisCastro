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
public class usuarios {
    String nombre;
    String apellido;
    String contra;
    Date fecha_n;
    String sexo;
    String departamento;
    String identidad;

    public usuarios() {
    }

    public usuarios(String nombre, String apellido, String contra) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.contra = contra;
    }
    
    public usuarios(String nombre, String apellido, String contra, Date fecha_n, String sexo, String departamento, String identidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.contra = contra;
        this.fecha_n = fecha_n;
        this.sexo = sexo;
        this.departamento = departamento;
        this.identidad = identidad;
    }

    public usuarios(String nombre, String apellido, String contra, Date fecha_n, String sexo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.contra = contra;
        this.fecha_n = fecha_n;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public Date getFecha_n() {
        return fecha_n;
    }

    public void setFecha_n(Date fecha_n) {
        this.fecha_n = fecha_n;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getIdentidad() {
        return identidad;
    }

    public void setIdentidad(String identidad) {
        this.identidad = identidad;
    }

    @Override
    public String toString() {
        return "Usuario{" +nombre + " "+ apellido + '}';
    }
    
}
