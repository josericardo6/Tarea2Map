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
public class Cola <T extends Comparable<T>, Q extends Comparable<Q>> {
    
    private Key  <T, Q> cabeza;
    private Key <T , Q> ultimo;
    private int size;
    
    public Cola(){
        
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
    
     public boolean queue(Key nuevo){
        
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
    }
    
}
