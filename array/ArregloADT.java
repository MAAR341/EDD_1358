package com.mycompany.array;

import java.util.ArrayList;

public class ArregloADT<T> {

    //atributos
    
    private int tamanio;
    private ArrayList<T> datos;
    
    //constructores
    public ArregloADT(int tam) {
        this.tamanio = tam;
        datos = new ArrayList();
        for(int i=0; i<this.tamanio; i++){
            datos.add(null);
        }
    }
//metodos
    public int getLongitud() {
        return this.tamanio;
        
    }
    private boolean comprobar(int indice){
        return indice>=0 && indice<this.tamanio;
    }
    
     public void setElemento(int indice, T elemento){
        if(comprobar(indice)){
            this.datos.set(indice, elemento);
        } else {
            System.out.println("Fuera de rango");
        }
    }
    public T getElemento(int indice){
        if(comprobar(indice)){
            return this.datos.get(indice);
        } else {
            System.out.println("Fuera de rango");
        }
        return null;
    }
    
    public T limpiar(T elemento){
        for(int i=0; i<this.tamanio;i++){
            this.datos.set(i, elemento);
     
        }
        return (T) datos;
    }
   
    @Override
    public String toString(){
        String estado = "------------------------------\n";
        for(T elemento : datos){
            if(elemento != null){
                estado += elemento.toString()+"\n";
            }
        }
        return estado;
    }

}
