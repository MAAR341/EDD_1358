package com.mycompany.array;

public class Nodo<T> {
    private T dato;
    private Nodo<T> siguiente;
    
    public Nodo() {
    }

    public Nodo(T valor) {
        this.dato = valor;
    }

    public Nodo(T dato, Nodo<T> siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }

    public Nodo<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo<T> siguiente) {
        this.siguiente = siguiente;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    @Override
    public String toString() {
        
        return "|"+dato+"|"; 
    }
    public String printAll(){
        return "[Dato = " + dato + "] -> [Siguiente : " + this.getSiguiente() + "]";
    }
    
    public static void main(String[] args) {
        System.out.println("Probando Nodo");
        
        Nodo<Integer> head = new Nodo<>(10);
        System.out.println( head );
        
        head.setSiguiente(new Nodo(20));
        System.out.println( head.getSiguiente() );
        
        System.out.println(".-.-.---");
        Nodo aux = head;
        while(aux != null){
            System.out.print(aux);
            aux=aux.getSiguiente();
        }
        System.out.println("");
        head.printAll();
       
    }
}