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
public class Perro extends Animal {
    private String raza;
    private String clasificacion;
    private boolean conPelo;
    private float altura;

    public Perro() {
    }

    public Perro(String raza, String clasificaion, boolean conPelo, float altura, int numeroPatas, int numeroDeOjos, String genero, String nombreEspecie) {
        super(numeroPatas, numeroDeOjos, genero, nombreEspecie);
        this.raza = raza;
        this.clasificacion = clasificaion;
        this.conPelo = conPelo;
        this.altura = altura;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getClasificaion() {
        return clasificacion;
    }

    public void setClasificaion(String clasificaion) {
        this.clasificacion = clasificaion;
    }

    public boolean isConPelo() {
        return conPelo;
    }

    public void setConPelo(boolean conPelo) {
        this.conPelo = conPelo;
    }

    @Override
    public String toString() {
        return super.toString() + "Perro{" + "raza=" + raza + ", clasificaion=" + clasificacion + ", conPelo=" + conPelo + ", altura=" + altura + '}';
    }
    
    public void emitirSonido(){
        System.out.println("Guau");
    }

      
}
    
    
    
    
     

