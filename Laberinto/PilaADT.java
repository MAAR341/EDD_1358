
package com.mycompany.array;

public class PilaADT<T> {
    NodoDoble<T> base;
    NodoDoble<T> top;
    int Tamanio;
    
    public PilaADT(){
        this.base=null;
        this.top=null;
        this.Tamanio=0;
    }
    
    public boolean estaVacia(){
        return this.top == null;
    }
    
    public int Tamanio(){
        NodoDoble aux = this.base;
        while(aux!= null){
            aux=aux.getSiguiente();
            Tamanio += 1;
        }
        return Tamanio;
    }
    
    public void Pop(){
        if (!this.estaVacia()) {
            NodoDoble aux = this.base;
            while (aux.getSiguiente().getSiguiente() != null){
                aux = aux.getSiguiente();
                this.top=aux;
                
            }
            aux.setSiguiente(null);
        } else {
            base = null;
        }
    }
    
    public void Push(T valor){
        NodoDoble nuevo = new NodoDoble(valor);
        if (this.estaVacia()) {
            this.base = nuevo;
            this.top = nuevo;
        } else {
            NodoDoble aux = this.base;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            nuevo.setAnterior(aux);
            aux.setSiguiente(nuevo);
            this.top= aux;
        }
        
    }
    
    public T Peek(){
        if(!this.estaVacia()){
            NodoDoble aux = this.base;
            while (aux.getSiguiente() != null){
                aux = aux.getSiguiente();
                this.top=aux;
            }
            return (T) aux.getDato();
        }
        else{
            return null;
        }
    }

    public void reversePila(){ //muestra la pila de forma que el top sea el primer elemento mostrado
        NodoDoble puntero = this.base;
        while(puntero.getSiguiente() != null){
            puntero = puntero.getSiguiente();
            
        }
        while(puntero!=null){
            System.out.print(puntero);
            puntero = puntero.getAnterior();
        }
        System.out.println("");
    }

    @Override
    public String toString() {
        String estado="";
         NodoDoble puntero = this.top;
        while(puntero.getAnterior() != null){
            puntero = puntero.getAnterior();
            
        }
        while(puntero!=null){
            //System.out.print(puntero);
            estado+=puntero.toString();
            puntero = puntero.getSiguiente();
        }
        System.out.println("");
        return estado;
    }
}
