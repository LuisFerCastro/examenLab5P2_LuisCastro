/* Fila 1 Asiento 3
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenlab5p2_luiscastro;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author lfern
 */
public class Civiles extends usuarios {
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

    @Override
    public String toString() {
        return "Civiles{" + "tramites=" + tramites + '}';
    }

    @Override
    public String generarID() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
