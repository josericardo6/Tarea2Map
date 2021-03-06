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
public class Map<T extends Comparable<T>, Q extends Comparable<Q>>{
    
    private Key<T, Q> cabeza;
    private Key<T, Q> ultimo;
    private int size;
    
    public Map (){
        
        this.cabeza = null;
        this.ultimo = null;
        this.size = 0;
        
    }

    public Key<T, Q> getCabeza() {
        return cabeza;
    }

    public void setCabeza(Key<T, Q> cabeza) {
        this.cabeza = cabeza;
    }

    public Key<T, Q> getUltimo() {
        return ultimo;
    }

    public void setUltimo(Key<T, Q> ultimo) {
        this.ultimo = ultimo;
    }

    public int Size() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    /**
     * <h1>isEmpty</h1>
     * <p>
     * Metodo que determina si el Map esta vacio</p>
     *
     * @return Boolean: True/False
     */
    public boolean isEmpty(){  
        
        return cabeza == null;   
        
    }
    
    /**
     * <h1>put</h1>
     * <p>
     * Metodo que agrega un valor con su respectiva key en el Map</p>
     *
     * @param key
     * @param dato
     * @return Boolean: True/False
     */
    public boolean put(T key, Q dato){
        
        Key nuevo = new Key(key, dato);
        
        if(isEmpty()){           
            cabeza = nuevo;
            ultimo = nuevo;
            size++;
            
        }else{            
            Key aux = cabeza;
            boolean bandera = false;
            
            for (int i = 0; i < size; i++) {                
                if(aux.getKey() == key){                   
                    bandera = true;
                    break;               
                }else{          
                    aux = aux.next();      
                }           
            }          
            
            if(bandera){              
                System.out.println("ERROR: ¡La llave introducida [ " + key + " ]  ya existe dentro del Map!");                
            }else{               
                ultimo.setSig(nuevo);
                nuevo.setAnt(ultimo);
                ultimo = nuevo;
                size++;               
            }          
        }        
        return true;
    }
    
    /**
     * <h1>get</h1>
     * <p>
     * Metodo que devuelve un valor de la clave en el Map</p>
     *
     * @param key
     * @return Key: Dato
     */
    public Key get(T key){
        
        Key aux = cabeza;
        boolean bandera = false;
        
        for (int i = 0; i < size; i++) {
            if(aux.getKey() == key){  
                bandera = true;
                break;      
            }else{        
                aux = aux.next();     
            }      
        }
        
        if(bandera){     
            System.out.println("[ Get ]: "+aux.getValue());
            return aux;      
        }else{       
            System.out.println("¡Llave no encontrada!");
            return null;    
        }    
    }
    
    /**
     * <h1>clear</h1>
     * <p>
     * Metodo que borra todos los componentes del Map</p>
     *
     * @return Boolean: True/False
     */
    public boolean clear(){
        
        try{  
            cabeza = null;
            ultimo = null;
            size = 0;
            
            return true;    
        }catch(Exception e){   
            System.out.println("¡No se pudo realizar Clear!");        
            return false;         
        }  
    }
    
    /**
     * <h1>remove</h1>
     * <p>
     * Metodo que elimina un valor en el Map por medio de una key</p>
     *
     * @param key
     * @return Boolean: True/False
     */
    public boolean remove(T key){
        
        if(isEmpty()){           
            System.out.println("\n[ Remove ]: ¡Lista vacia!");
            return false;           
        }else{          
            Key aux = cabeza;
            boolean bandera = false;
            int index = 0;
            
            for (int i = 0; i < size; i++) {            
                if(aux.getKey() == key){                 
                    bandera = true;
                    break;                    
                }else{                   
                    aux = aux.next();
                    index++;                   
                }               
            }
            
            if(bandera){               
                if(index == 0){                  
                    cabeza = cabeza.next();
                    size--;                   
                }else if(index == size-1){                 
                    ultimo = ultimo.getAnt();
                    size--;                 
                }else{                 
                    Key aux2 = cabeza;
                    
                    for (int i = 0; i < index-1 ; i++) {
                        aux2 = aux2.next();                      
                    }
                    
                    aux2.setSig(aux2.next().next());
                    size--;
                }              
                return true;
                
            }else{              
                System.out.println("¡Llave no encontrada!");
                return false;
            }            
        }         
    }
    
    /**
     * <h1>containsKey</h1>
     * <p>
     * Metodo que determina si existe una key en el Map</p>
     *
     * @param key
     * @return Boolean: True/False
     */
    public boolean containsKey(T key){
        
        Key aux = cabeza;
      
        for (int i = 0; i < size; i++) {         
            if(aux.getKey() == key){               
                return true;               
            }           
        }      
        return false;
    }
    
    /**
     * <h1>containsValue</h1>
     * <p>
     * Metodo que determina si existe un valor en el Map</p>
     *
     * @param dato
     * @return Boolean: True/False
     */
    public boolean containsValue(Q dato){
        
        Key aux = cabeza;
        
        for (int i = 0; i < size; i++) {           
            if(aux.getValue() == dato){                
                return true;               
            }          
        }       
        return false;      
    }
    
    /**
     * <h1>valuesCola</h1>
     * <p>
     * Metodo que construye una Cola a partir de la lista actual y la retorna</p>
     *
     * @return Cola
     */
    public Cola valuesCola(){
        
        Cola cola = new Cola();
        
        Key aux  = cabeza;
        
        for (int i = 0; i < size; i++) {
            
            cola.queue(aux);
            
            aux = aux.next();
            
        }
        
        return cola;
        
    }
    
    /**
     * <h1>valuesPila</h1>
     * <p>
     * Metodo que construye una Pila a partir de la lista actual y la retorna</p>
     *
     * @return Pila
     */
    public Pila valuesPila(){
        
         Pila pila = new Pila();
        
        Key aux  = cabeza;
        
        for (int i = 0; i < size; i++) {
            
            pila.push(aux);
            
            aux = aux.next();
            
        }
        
        return pila;     
    }
    
    /**
     * <h1>toString</h1>
     * <p>
     * Metodo que imprime la lista de los jugadores guardados</p>
     *
     * @return String: Lista de jugadores y caracteristicas
     */
    @Override
    public String toString(){
        
        String res = "\n";
        
        Key aux = cabeza;
        
        for (int i = 0; i < size; i++) {
            
            res+= "[ " + aux.getValue() + " ] ";
            aux = aux.next();
            
        }
        
        return res + "\n";
    }
    
    /**
     * <h1>hasNext</h1>
     * <p>
     * Metodo que verifica si el nodo siguiente es null o no</p>
     *
     * @param aux
     * @return boolean: true/false
     */
    public boolean hasNext(Key aux){
        
        if(aux == null){      
            return false;      
        }else{  
            return true;    
        }     
    }
    
    public String iterator(){
        
        String coleccion = "\n| Key | -- | Value |\n\n";
        
        Key aux = cabeza;
        
        while(hasNext(aux)){
            
            coleccion+= "[ "+aux.getKey()+ " ] ---- " +  "( " + aux.getValue() + " )\n";
            aux = aux.next();
            
        }
        
        return coleccion+="--------------------------------";
    }
}
