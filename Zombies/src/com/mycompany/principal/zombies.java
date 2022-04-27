package com.mycompany.principal;
import java.util.ArrayList;
import java.util.Date;

public class zombies {
    private String nombre;
    private int salud;
    private Date fechaNacimiento;
    private String sangre;

    public zombies(String n, int s, Date fN, String Sang) {
        this.nombre = n;
        this.salud = s;
        this.fechaNacimiento = fN;
        this.sangre = Sang;
    }

    public zombies (){

    }
    public String getNombre() {
        return nombre;
    }

    public int getSalud() {
        return salud;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getSangre() {
        return sangre;
    }

    public void setNombre(String nom) {
        this.nombre = nom;
    }

    public void setSalud(int sal) {
        this.salud = sal;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setSangre(String sang) {
        this.sangre = sang;
    }
}
