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
public class Animal {
    private int numeroPatas;
    private int numeroDeOjos;
    private String genero;
    private String nombreEspecie;

    public Animal() {
    }

    public Animal(int numeroPatas, int numeroDeOjos, String genero, String nombreEspecie) {
        this.numeroPatas = numeroPatas;
        this.numeroDeOjos = numeroDeOjos;
        this.genero = genero;
        this.nombreEspecie = nombreEspecie;
    }

    public String getNombreEspecie() {
        return nombreEspecie;
    }

    public void setNombreEspecie(String nombreEspecie) {
        this.nombreEspecie = nombreEspecie;
    }

    public int getNumeroDeOjos() {
        return numeroDeOjos;
    }

    public void setNumeroDeOjos(int numeroDeOjos) {
        this.numeroDeOjos = numeroDeOjos;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    @Override
    public String toString() {
        return "Animal{" + "numeroPatas=" + numeroPatas + ", numeroDeOjos=" + numeroDeOjos + ", genero=" + genero + ", nombreEspecie=" + nombreEspecie + '}';
    }
    
    public void hablar (){
        
    }
    
}
