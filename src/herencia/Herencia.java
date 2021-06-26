/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;


import ico.fes.pet.Gato;
import ico.fes.pet.Perro;

/**
 *
 * @author Agora
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Gato gato = new Gato(4, 2, "Macho", "Felino", "Egipcio", "Rufus", 4, true);
        System.out.println(gato);
        
        Perro perro = new Perro("Chihuahua", "Vertebrados", true, .56f, 4, 2, "Hembra", "Caninos");
        System.out.println(perro);
    }
    
}
