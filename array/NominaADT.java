
package com.mycompany.array;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class NominaADT {
int tam=0;
String lineasL = "";
ArrayList<ArrayList<String>> lista = new ArrayList<>();
ArregloADT<Trabajador> nomina = new ArregloADT(lista.size());
String[] lineas;
String[] tamanio;
Trabajador emp;
int contador;
    public void leer(){
        
        try{
           BufferedReader lector = new BufferedReader(new FileReader("C:\\Users\\LENOVO\\Downloads\\junio.dat"));
           String linea;
           while((linea = lector.readLine()) !=null){
                lineas = linea.split(",");
                tamanio = linea.split("\n");
                tam += tamanio.length;
                ArrayList<String> trabTemp = new ArrayList<>();
                for(String dato : lineas){
                    trabTemp.add(dato);
                }
                lista.add(trabTemp);
           }
           nomina = new ArregloADT(tam-1);
           int col = 0;
           for(int fila = 1; fila<lista.size(); fila++){
               emp = new Trabajador(Integer.parseInt(lista.get(fila).get(0)), lista.get(fila).get(1), lista.get(fila).get(2), lista.get(fila).get(3), Integer.parseInt(lista.get(fila).get(4)), Integer.parseInt(lista.get(fila).get(5)), Integer.parseInt(lista.get(fila).get(6)));
               nomina.setElemento(col, emp);
               col++;
           }
           System.out.println(lista);
       }catch(Exception e){
           e.printStackTrace();
           
       }
    }
       
    public void listarSueldos(){
        for (int contador = 0; contador < nomina.getLongitud(); contador++) {
            emp = nomina.getElemento(contador);
            System.out.println("ID: " + emp.getIDTrabajador() + " Sueldo: " + emp.calcularSueldo());
        }
    }   
    
    public void mayorAntiguedad(){
        int mayor = 2023;
        int indice = 0;
        for (int contador = 0; contador < nomina.getLongitud(); contador++) {
            emp = nomina.getElemento(contador);
            if(emp.getAnioIngreso()<mayor){
                indice = contador;
                mayor = emp.getAnioIngreso();
            }
        }
        System.out.println("El mayor es: " + mayor);
    }   
    public void menorAntiguedad(){
        int menor = 2020;
        int indice = 0;
        for (int contador = 0; contador < nomina.getLongitud(); contador++) {
            emp = nomina.getElemento(indice);
            if(emp.getAnioIngreso()>menor){
                indice = contador;
                menor = emp.getAnioIngreso();
            }
            
        }
    System.out.println("El menor es: " + menor);
    }      
}
