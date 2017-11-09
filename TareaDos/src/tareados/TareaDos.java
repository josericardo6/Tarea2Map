/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareados;
import da.Map;

/**
 *
 * @author Ricardo Rodriguez Moya
 * Version: 1.0
 * 
 * Descripción: Tarea #2 de Programación 3, Se busca crear una estructira de datos que se asemeje
 * a un Map de Java, programando algunos de sus metodos y mostrandolo con ayuda de un Iterator 
 * personalizado.
 * 
 * Fecha de creación: 8/11/2017
 * Ultima modificación: 8/11/2017
 */
public class TareaDos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
         Map <Integer, String> map = new Map();
        
         map.put(1, "Este");                                                                                                              //Metodo Put()
         map.put(2, "Es");
         map.put(3, "Mi");
         map.put(4, "Map");
         map.put(5, "Personalizado");
        
         System.out.println("--------------------------------\n"
                 + "[ MAP ]:\n"+map.iterator());
        
         System.out.println("\n[ Size ]: "+map.Size());                                                              //Metodo Size()
        
         System.out.println("\n[ isEmpty ]: "+map.isEmpty() +"\n");                                //Metodo isEmpty()
       
         map.get(1);                                                                                                                          //Metodo Get()
        
//         map.clear();                                                                                                                  //Metodo Clear()
       
         map.remove(3);                                                                                                          //Metodo Remove()
       
         System.out.println("\n--------------------------------"
                 + "\n[ MAP despues de borrar ]:\n"+map.iterator());       //Muestra el mapa luego de borrar 
         
         System.out.println("\n[ containsKey ]: "+map.containsKey(1));                //Metodo ContainsKey()
         
         System.out.println("\n[ containsValue ]: "+map.containsValue("5") + "\n");    //Metodo ContainsValue()
       
         System.out.println("Values Cola: "+map.valuesCola().toString());                //Metodo ValuesCola()
         
         System.out.println("Values Pila: "+ map.valuesPila().toString());                   //Metodo ValuesPila()
             
    }
    
}
