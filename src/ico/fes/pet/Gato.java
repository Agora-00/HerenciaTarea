/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.pet;

/**
 *
 * @author Agora
 */
public class Gato extends Animal{
    private String raza;
    private String nombre;
    private int edad;
    private boolean vivo;

    public Gato() {
    }
    public void emitirSonido(){
   
}

    public Gato(String raza, String nombre, int edad, boolean vivo) {
        this.raza = raza;
        this.nombre = nombre;
        this.edad = edad;
        this.vivo = vivo;
    }
    

    
    
public Gato (int numeroPatas, int numeroDeOjos, String genero, String nombreEspecie, String raza, String nombre, int edad, boolean vivo){
    super(numeroPatas,numeroDeOjos,genero,nombreEspecie);
    this.raza= raza;
    this.nombre = nombre;
    this.edad = edad;
    this.vivo = vivo;
    
}

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    @Override
    public String toString() {
        return super.toString() + "Gato{" + "raza=" + raza + ", nombre=" + nombre + ", edad=" + edad + ", vivo=" + vivo + '}';
    }

    
    
    
}
