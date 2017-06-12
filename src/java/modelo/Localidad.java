package modelo;

import javax.persistence.*;

@Entity @Table(name = "Localidades")
public class Localidad {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne() @JoinColumn(name = "fkProvincia")
    private Provincia provincia;
    private String nombre;

    public Localidad() {
    }

    public Localidad(Provincia provincia, String nombre) {
        this.provincia = provincia;
        this.nombre = nombre;
    }
    
    //<editor-fold desc="GYS:">

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
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
        return "Localidad{" + "id=" + id + ", provincia=" + provincia + ", nombre=" + nombre + '}';
    }
    
}
