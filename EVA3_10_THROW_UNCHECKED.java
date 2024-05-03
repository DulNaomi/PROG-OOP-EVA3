/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_10_throw_unchecked;

/**
 *
 * @author invitado
 */
public class EVA3_10_THROW_UNCHECKED {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* try {
        // TODO code application logic here
                Persona perso = new Persona("Naomi", "Perez", 19);
                } catch (Exception ex) {
                ex.printStackTrace();
                }*/
    
    try {
        Persona perso = new Persona();
        perso.setNombre( "Naomi");
        perso.setApellido( "Perez");
        perso.setEdad(19);
        
    } catch (Exception ex){
        ex.printStackTrace();
    }
    
        System.out.println("Fin del programa");
    }


class Persona{
private String nombre;
private String apellido;
private int edad;

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) throws Exception {
        if((edad < 0)|| (edad > 150))
            throw new RuntimeException("Valor capturado en la eddad no es valido");
        this.edad = edad;
    }
}
}

