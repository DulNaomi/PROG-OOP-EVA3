/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_11_custom.exception;

/**
 *
 * @author invitado
 */
public class EVA3_11_CUSTOMEXCEPTION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
        // TODO code application logic here
            mensaje();
        } catch (MiException ex) {
            ex.printStackeTrace();
        }
            
    }
    public static void mensaje() throws MiException{
        System.out.println("mensaje");
        throw new MiException("Fallas del sistem!!");
    }
}
class MiException extends Exception{
    
    public MiException() {
}
    public MiException(string message){
        super(message);
    }
}