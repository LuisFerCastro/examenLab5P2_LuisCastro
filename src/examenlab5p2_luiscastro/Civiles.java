/* Fila 1 Asiento 3
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenlab5p2_luiscastro;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

/**
 *
 * @author lfern
 */
public class Civiles extends usuarios {
    static Random rand = new Random();
    public ArrayList<Tramites> tramites = new ArrayList();

    public Civiles() {
    }

    public Civiles(String nombre, String apellido, String contra) {
        super(nombre, apellido, contra);
    }

    public Civiles(String nombre, String apellido, String contra, Date fecha_n, String sexo, String departamento) {
        super(nombre, apellido, contra, fecha_n, sexo, departamento);
    }

    public Civiles(String nombre, String apellido, String contra, Date fecha_n, String sexo, String departamento, String identidad) {
        super(nombre, apellido, contra, fecha_n, sexo, departamento, identidad);
    }

    public ArrayList<Tramites> getTramites() {
        return tramites;
    }

    public void setTramites(ArrayList<Tramites> tramites) {
        this.tramites = tramites;
    }
    
    
    @Override
    public String toString() {
        return "Civiles{" + "tramites=" + tramites + '}';
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
        ID += year+"-";
        for (int i = 0; i < 5; i++) {
            int random = rand.nextInt(10);
            ID += random +"";
        }
        return ID;
    }
    
}
