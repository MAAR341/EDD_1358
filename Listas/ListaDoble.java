
package Listas;

public class ListaDoble<T> {
    private NodoDoble<T> head;
    
    private int tamanio;
    
    public ListaDoble(){
        this.head = null;
        this.tamanio = 0;
    }
    
    public boolean estaVacia() {
        return this.head == null;
    }

    public int getTamanio() {
        return tamanio;
    }
    
    public void agregarAlInicio(T valor){
        NodoDoble<T> nuevo = new NodoDoble(valor);
        if(estaVacia()){
            this.head = nuevo;
            
        }else{
            nuevo.setSiguiente(this.head);
            head.setAnterior(nuevo);
            this.head = nuevo;
        }
    }

    public void agregarAlFinal(T valor) {
        NodoDoble nuevo = new NodoDoble(valor);
        if (head == null) {
            this.head = nuevo;
            
        } else {
            NodoDoble aux = this.head;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            nuevo.setAnterior(aux);
            aux.setSiguiente(nuevo);
            
            aux=null;
            nuevo=null;
        }
    }
    
    public void agregarDespuesDe(T valor, int posicion){
        NodoDoble nuevo = new NodoDoble(valor);
        NodoDoble aux = this.head;
        for (int contador = 1; contador <= posicion - 1; contador++) {
            aux = aux.getSiguiente();
        }
        nuevo.setSiguiente(aux.getSiguiente());
        nuevo.setAnterior(aux);
        aux.setSiguiente(nuevo);
    }
 

    public void eliminar(int posicion){
        
        NodoDoble aux = this.head;
        NodoDoble aux2 = null;
        for (int contador = 1; contador <= posicion - 1; contador++) {
            aux = aux.getSiguiente();
        }
        aux2 = aux.getSiguiente().getSiguiente();
        aux.setSiguiente(aux.getSiguiente().getSiguiente());
        aux2.setAnterior(aux);
    }
    
    public void eliminarElPrimero(){
        if(!this.estaVacia()){
            head = head.getSiguiente();
            this.head.setAnterior(null);
        }else{
            head = null;
        }
    }
    
    public void eliminarElFinal(){
        if (!this.estaVacia()) {
            NodoDoble aux = this.head;
            while (aux.getSiguiente().getSiguiente() != null) {
                aux = aux.getSiguiente();
                
            }
            aux.setSiguiente(null);
        } else {
            head = null;
        }
    }
    
    public int buscar(T valor){
        
            int posicion = 1;
            NodoDoble aux = this.head;
            while(aux!=null && aux.getDato()!=valor){
                aux=aux.getSiguiente();
                posicion++;
            }
            
        return posicion;
        
    }
    
    
  public void actualizar(T a,T valor){
     NodoDoble aux = this.head;
     while(aux!=null && aux.getDato()!=a){
        aux=aux.getSiguiente();
         
     }
     aux.setDato(valor);
  }
    
    public void transversal() {
        NodoDoble curr_node = this.head;
        while (curr_node != null) {
            System.out.print(curr_node);
            curr_node = curr_node.getSiguiente();
        }
        System.out.println("");
    }
}
