/*Fila 1 Asiento 3
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenlab5p2_luiscastro;

import java.util.Date;

/**
 *
 * @author lfern
 */
public class Empleados extends usuarios{
    String carrera;
    String puestolaboral;
    String tiempo_trabajado;

    public Empleados() {
    }

    public Empleados(String nombre, String apellido, String contra) {
        super(nombre, apellido, contra);
    }
    
    public Empleados(String carrera, String puestolaboral, String tiempo_trabajado, String nombre, String apellido, String contra, Date fecha_n, String sexo, String departamento, String identidad) {
        super(nombre, apellido, contra, fecha_n, sexo, departamento, identidad);
        this.carrera = carrera;
        this.puestolaboral = puestolaboral;
        this.tiempo_trabajado = tiempo_trabajado;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getPuestolaboral() {
        return puestolaboral;
    }

    public void setPuestolaboral(String puestolaboral) {
        this.puestolaboral = puestolaboral;
    }

    public String getTiempo_trabajado() {
        return tiempo_trabajado;
    }

    public void setTiempo_trabajado(String tiempo_trabajado) {
        this.tiempo_trabajado = tiempo_trabajado;
    }

    @Override
    public String toString() {
        return "Empleados{" + "carrera=" + carrera + ", puestolaboral=" + puestolaboral + ", tiempo_trabajado=" + tiempo_trabajado + '}';
    }
    
    
}
