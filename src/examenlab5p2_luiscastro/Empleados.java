/*Fila 1 Asiento 3
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenlab5p2_luiscastro;

import java.util.Date;
import java.util.Random;

/**
 *
 * @author lfern
 */
public class Empleados extends usuarios{
    static Random rand = new Random();
    String carrera;
    String puestolaboral;
    String tiempo_trabajado;

    public Empleados() {
    }

    public Empleados(String nombre, String apellido, String contra, Date fecha_n, String sexo, String departamento) {
        super(nombre, apellido, contra, fecha_n, sexo, departamento);
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

    @Override
    public String generarID() {
        String ID = "";
        int municipio = 0;
        if(departamento.equalsIgnoreCase("Francisco Morazan")){
            ID += "01";
            municipio = rand.nextInt(27)+1;
            if(municipio < 10){
                ID += "0"+municipio;
            }else{
                ID += municipio +"";  
            }
        }else if(departamento.equalsIgnoreCase("Cortes")){
            ID += "02";
            municipio = rand.nextInt(11)+1;
            if(municipio < 10){
                ID += "0"+municipio;
            }else{
                ID += municipio +"";  
            }
        }else{
            ID += "03";
            municipio = rand.nextInt(20)+1;
            if(municipio < 10){
                ID += "0"+municipio;
            }else{
              ID += municipio +"";  
            }
        }
        int year = fecha_n.getYear();
        ID += year+"";
        for (int i = 0; i < 5; i++) {
            int random = rand.nextInt(10);
            ID += random +"";
        }
        return ID;
    }
    
    
}
