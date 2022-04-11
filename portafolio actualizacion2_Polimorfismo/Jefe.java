/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.portafolio;

/**
 *
 * @author mario
 */

public class Jefe extends personajes {
     private int dificultad;
     private double regeneracion;
     protected int contador;
     
     /*esta es una clase derivada de personajes, que se utilizara para crear un jefe al que el jugador debera 
     enfrentar por cada pueblo*/
    
     public void setDificculdad (int _dificultad)
    {
        this.dificultad=_dificultad;
    }
    
    public int getDificultad(){
     return this.dificultad;
    }
    
     public void setRegeneracion (double _regeneracion)
    {
        this.regeneracion=_regeneracion;
    }
    
    public double getRegeneracion(){
     return this.regeneracion;
    }
    
    protected void setContador(int _contador){
        this.contador = _contador;
    }
    
    protected int getContador(){
        return this.contador;
    }
    
     public void muestraDatos(){
         System.out.println("Has llegado hasta el jefe: " + nombre);
         System.out.println("Vida: " + getVida()); 
        /*se hace llamada al metodo constructor que nos permite revisar la vida del personaje enemigo
         esto con el fin de poder mostrar los datos requeridos sin necesidad de alterar en encapsulamiento
         de la clase personajes*/
        System.out.println("Con un poder de: " + getPoder());
        System.out.println("Este tiene un grado de dificultad de: " + getDificultad());
        System.out.println("Este enemigo tiene la capacidad de curar sus heridas en un: " + getRegeneracion() +"%");
        //se hace uso de los metodos constructores para poder ver los diferentes datos que posee el jefe
     }
     
     
     
     public void crearJefe (String _nombre,int _vida, int _poder, int _vAtaque,int _dificultad, double _regeneracion){
     
        nombre =_nombre;
        vida = _vida;
        poder =_poder;
        vAtaque =_vAtaque;
        dificultad=_dificultad;
        regeneracion=_regeneracion;
     }
}
