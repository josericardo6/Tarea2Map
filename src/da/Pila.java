/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package da;

/**
 *
 * @author Ricardo Rodriguez
 * @param <T>
 * @param <Q>
 */
public class Pila <T extends Comparable<T>, Q extends Comparable<Q>> {
    
    private Key <T, Q> cabeza;
    private Key <T , Q> ultimo;
    private int size;
    
    
    public Pila(){
        
        this.cabeza = null;
        this.size = 0;
        
    }
    
    public Key<T, Q> getCabeza() {
        return cabeza;
    }

    public void setCabeza(Key<T, Q> cabeza) {
        this.cabeza = cabeza;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isEmpty(){
        
        return cabeza == null;
        
    }
    
    @Override
    public String toString(){
        
        String res = "";
        
        Key aux = cabeza;
        
        for(int i = 0; i < size; i++){
            
            res +="[ "+ aux.getValue() + " ] ";
            
            aux = aux.next();
        }
        
        return res;
        
    }
    
    public boolean push(Key nuevo){
        
        if(0 == size){ 
            
            cabeza = nuevo;
            ultimo = nuevo;
            
        }else{
            
            Key aux = cabeza;
            
            for (int i = 0; i < size; i++) {
                
                aux = aux.next();
                
            }
            
            ultimo.setSig(nuevo); 
            ultimo = nuevo; 
            
        }
        
        size++;
        
        return true;
        
        
//        if(cabeza == null){
//            
//            cabeza = nuevo;
//            ultimo = nuevo;
//            
//        }else{
//            
//            top().setSig(nuevo);
//            
//        }
//        
//        size++;
//        return true;
    }
    
    public Key top(){
        
        Key aux = cabeza;
        
        while(aux.next() != null){
            
            aux = aux.next();
            
        }
        
        return ultimo;
    }
    
    public Key pop(){
        
        Key aux = cabeza;
        
        while(aux.next() != null){
            
            aux = aux.next();
           
        }
        
        Key aux2 = aux;
        aux = null;
        
        System.out.println("Nodo a utilizar: ["+aux2.getValue() + "]\n");
        
        size--;
        return aux2;
    }
    
    public boolean invertPila(){
        
        int cont = 0;
        
        Key aux = pop();
        
        while(cont < size){
            
            aux.setSig(pop());
            
            cont++;
        }
        
        return true;
    }
}
