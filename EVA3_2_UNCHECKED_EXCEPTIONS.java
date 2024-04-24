/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_unchecked_exceptions;

/**
 *
 * @author invitado
 */
public class EVA3_UNCHECKED_EXCEPTIONS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // NULLPOLINTEREXCEPTION
        //cuando querremos usar un objecto que no existe 
        Persona persona = null;
        System.out.println(x: persona.toString());
        
        //INDEXOUTOFBOUNDSEXCEPTION: Error de arreglos
        //leer una posición que no esxiste:
        int arreglo[] = new int[10]; //N = 10
        //0 es la primer posición, N  - 1 es la ultima (9)
        arreglo[15] = 100;
        
    
      //ARITHMETICEXCEPTION: Divisón entre cero 
        int x = 10, y = 0;
        int resu = x / y;
        System.out.println(x: resu);
    }
    
}
