
package com.mycompany.array;

public class Trabajador {
    
    private int IDTrabajador;
    private String nombre;
    private String paterno;
    private String materno;
    private int horasEx;
    private int sueldo;
    private int anioIngreso;
    private double total;
    private double horaExtra = 276.5;

    public Trabajador(int ID, String nom, String pat, String mat, int hE, int sue, int anio) {
        this.IDTrabajador = ID;
        this.nombre = nom;
        this.paterno = pat;
        this.materno = mat;
        this.horasEx = hE;
        this.sueldo = sue;
        this.anioIngreso = anio;
        
    }
    
    public int getIDTrabajador(){
        return this.IDTrabajador;
    }
    public void setIDTrabajador(int IDTrabajador){
        this.IDTrabajador= IDTrabajador;
    }
    
   public String getNombre(){
       return this.nombre;
   }
   public void setNombre(String nombre){
       this.nombre=nombre;
   }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public int getHorasEx() {
        return horasEx;
    }

    public void setHorasEx(int horasEx) {
        this.horasEx = horasEx;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(int anioIngreso) {
        this.anioIngreso = anioIngreso;
    }
    public String toString(){
        String estado = "";
        estado +=(IDTrabajador)+"\n";
        estado +=(nombre)+"\n";
        return estado;
    }
    public double calcularSueldo(){
        int antiguedad = 2022 - this.anioIngreso;
        total = this.sueldo + (this.sueldo*(antiguedad*0.03)) + this.horasEx * horaExtra;
        return total;
    }
   
    
}
