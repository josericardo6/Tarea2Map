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
 */
public class Nodo<T,Q>{
    
    private Nodo<T, Q> sig;
    private Nodo<T, Q> ant;
    private T key;
    private Q dato;

    public Nodo(T key, Q dato) {
        
        this.sig = null;
        this.ant = null;
        this.key = key;
        this.dato = dato;
        
    }

    public Nodo<T, Q> next() {
        return sig;
    }

    public void setSig(Nodo<T, Q> sig) {
        this.sig = sig;
    }

    public Nodo<T, Q> getAnt() {
        return ant;
    }

    public void setAnt(Nodo<T, Q> ant) {
        this.ant = ant;
    }

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }

    public Q getDato() {
        return dato;
    }

    public void setDato(Q dato) {
        this.dato = dato;
    }
    
    
    
}
