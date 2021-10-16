/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

/**
 *
 * @author carde
 */
public class Producto {
    
    private int ID;
    private String Nombre;
    private int Precio;

    public Producto() {
    }

    public Producto(int ID, String Nombre, int Precio) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.Precio = Precio;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }
    
    
    
    
    
}
