/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.io.Serializable;

/**
 *
 * @author Diego
 */
public class mascotaClase implements Serializable{

    public int Codigo;
    public String Dueno;
    public String Nombre;
    public String Raza;
    public String Color;
    public int Edad;
    public double Peso;

    public void registrarMascota(int codigo, String dueño, String nombre, String raza, String color, int edad, double peso) {
        this.Codigo = codigo;
        this.Dueno = dueño;
        this.Nombre = nombre;
        this.Raza = raza;
        this.Color = color;
        this.Edad = edad;
        this.Peso = peso;
    }

    //Metodos Set
    public void setCodigo(int codigo) {
        this.Codigo = codigo;
    }

    public void setDueño(String dueño) {
        this.Dueno = dueño;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public void setRaza(String raza) {
        this.Raza = raza;
    }

    public void setColor(String color) {
        this.Color = color;
    }

    public void setEdad(int edad) {
        this.Edad = edad;
    }

    public void setPeso(double peso) {
        this.Peso = peso;
    }

    //Metodos Get
    public int getCodigo() {
        return Codigo;
    }

    public String getDueño() {
        return Dueno;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getRaza() {
        return Raza;
    }

    public String getColor() {
        return Color;
    }

    public int getEdad() {
        return Edad;
    }

    public double getPeso() {
        return Peso;
    }
}
