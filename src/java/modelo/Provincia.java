package modelo;

import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity @Table(name="provincias")
public class Provincia {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;

    public Provincia() {
    }

    public Provincia(String nombre) {
        this.nombre = nombre;
    }
    
    //<editor-fold desc="GYS:">

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //</editor-fold>

    @Override
    public String toString() {
        return "Provincia{" + "id=" + id + ", nombre=" + nombre + '}';
    }
    
    
    
    
}
