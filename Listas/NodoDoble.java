
package Listas;

public class NodoDoble<T> {
    private T dato;
    private NodoDoble<T> siguiente;
    private NodoDoble<T> anterior;
    
    public NodoDoble(){
        
    }
    
    public NodoDoble (T valor) {
        this.dato = valor;
    }

    public NodoDoble (T dato, NodoDoble<T> anterior, NodoDoble<T> siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
        this.anterior = anterior;
    }

    public NodoDoble<T> getSiguiente() {
        return siguiente;
    }
    
    public NodoDoble<T> getAnterior(){
        return anterior;
    }

    public void setSiguiente(NodoDoble<T> siguiente) {
        this.siguiente = siguiente;
    }
    
    public void setAnterior(NodoDoble<T> anterior) {
        this.anterior = anterior;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    @Override
    public String toString() {
        
        return "-> |"+dato+"| <-"; 
    }
    public String printAll(){
        return "[Anterior : " + this.getAnterior() + " <- [Dato = " + dato + "] -> [Siguiente : " + this.getSiguiente() + "]";
    }
    
    public static void main(String[] args) {
        System.out.println("Probando Nodo");
        
        NodoDoble<Integer> head = new NodoDoble<>(10);
        System.out.println( head );
        
        head.setSiguiente(new NodoDoble(20));
        head.setAnterior(new NodoDoble(0));
        System.out.println( head.getSiguiente() );
        System.out.println(head.getAnterior());
        
        System.out.println(".-.-.---");
        NodoDoble aux = head;
        while(aux != null){
            System.out.print(aux);
            aux=aux.getSiguiente();
        }
        while(aux != null){
            
            aux=aux.getAnterior();
            System.out.print(aux);
        }
        System.out.println("");
        head.printAll();
       
    }
}
