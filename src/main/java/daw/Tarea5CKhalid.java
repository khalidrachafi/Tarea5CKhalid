/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package daw;

/**
 *
 * @author khalid
 */
public class Tarea5CKhalid {


     private String nombre;
     private double num;

    public Tarea5CKhalid(String nombre, double num) {
        this.nombre = nombre;
        this.num = num;
    }

    public Tarea5CKhalid() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNum() {
        return num;
    }

    public void setNum(double num) {
        this.num = num;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tarea5CKhalid{");
        sb.append("nombre=").append(nombre);
        sb.append(", num=").append(num);
        sb.append('}');
        return sb.toString();
    }
     
     
     
     





    
}
