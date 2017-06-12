package modelo;

import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity @Table(name = "Equipos")
public class Equipo 
{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String direccionIP;
    private String mac;
    private String deviceName;
    private String SSID;
    @OneToOne(fetch = FetchType.EAGER) @JoinColumn(name = "fkModo")
    private Modo modo;

    public Equipo() {
    }

    public Equipo(String direccionIP, String mac, String deviceName, String SSID, Modo modo) {
        this.direccionIP = direccionIP;
        this.mac = mac;
        this.deviceName = deviceName;
        this.SSID = SSID;
        this.modo = modo;
    }
    
    
    //<editor-fold desc="GYS:">

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDireccionIP() {
        return direccionIP;
    }

    public void setDireccionIP(String direccionIP) {
        this.direccionIP = direccionIP;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getSSID() {
        return SSID;
    }

    public void setSSID(String SSID) {
        this.SSID = SSID;
    }

    public Modo getModo() {
        return modo;
    }

    public void setModo(Modo modo) {
        this.modo = modo;
    }
    
    //</editor-fold>

    @Override
    public String toString() {
        return "Equipo{" + "id=" + id + ", direccionIP=" + direccionIP + ", mac=" + mac + ", deviceName=" + deviceName + ", SSID=" + SSID + ", modo=" + modo + '}';
    }
    
    
    
}
