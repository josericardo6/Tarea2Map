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
public class Key<T,Q>{
    
    private Key<T, Q> sig;
    private Key<T, Q> ant;
    private T key;
    private Q value;

    public Key(T key, Q dato) {
        
        this.sig = null;
        this.ant = null;
        this.key = key;
        this.value = dato;
        
    }

    public Key<T, Q> next() {
        return sig;
    }

    public void setSig(Key<T, Q> sig) {
        this.sig = sig;
    }

    public Key<T, Q> getAnt() {
        return ant;
    }

    public void setAnt(Key<T, Q> ant) {
        this.ant = ant;
    }

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }

    public Q getValue() {
        return value;
    }

    public void setValue(Q value) {
        this.value = value;
    }
    
    
    
}
