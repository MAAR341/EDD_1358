package com.mycompany.array;

import java.util.ArrayList;

public class ArregloADT<T> {

   
    //atributos
    
    private int tam;
    private int longitud;
    private ArrayList<T> datos;
    
    //constructores
    public ArregloADT(int tamanio) {
        this.tam = tamanio;
        datos = new ArrayList();
        for(int i=0; i<tam; i++){
            datos.add((T) new Object());
        }
    }
//metodos
    public int getLongitud() {
        
        return datos.size();
        
    }
    
     public void setElemento(int indice, T elemento){
        if(indice>=0 && indice<this.tam){
            datos.set(indice, elemento);
        }
    }
    public T getElemento(int indice){
        if(indice>=0 && indice<this.tam){
            return (T) datos.get(indice);
        }
        return (T) datos;
    }
    
    public T limpiar(T elemento){
        for(int i=0; i<datos.size();i++){
            datos.set(i, elemento);
     
        }
        return (T) datos;
    }
    @Override
    public String toString(){
        return datos.toString();
    }

}
