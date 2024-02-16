/* Fila 1 Asiento 3
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenlab5p2_luiscastro;

import java.util.ArrayList;

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

    @Override
    public String toString() {
        return "Civiles{" + "tramites=" + tramites + '}';
    }
    
}
