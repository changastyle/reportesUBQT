package modelo;

import javax.persistence.*;

@Entity @Table(name = "modos")
public class Modo {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;

    public Modo() {
    }

    public Modo(String nombre) {
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
        return "Modo{" + "id=" + id + ", nombre=" + nombre + '}';
    }
    
}
