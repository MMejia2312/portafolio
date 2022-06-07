/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.portafolio;

/**
 *
 * @author mario mejía
 */
/*la clase Enemigos es una clase hija, la cual hereda los datos generales de la clase ya existente personajes
ademas de añadig algunos datos extra que son necesario para el juego.*/
public class Enemigos extends personajes {
     private int dificultad;
     protected int contador;
     
   
    public void setDificculdad (int _dificultad)
    {
        this.dificultad=_dificultad;
    }
    
    public int getDificultad(){
     return this.dificultad;
    }
    
    protected void setContador(int _contador){
        this.contador = _contador;
    }
    
    protected int getContador(){
        return this.contador;
    }
     public void muestraDatosEnemigo(){
         System.out.println("enemigo: " + nombre);
         System.out.println("Vida: " + getVida()); 
        /*se hace llamada al metodo constructor que nos permite revisar la vida del personaje enemigo
         esto con el fin de poder mostrar los datos requeridos sin necesidad de alterar en encapsulamiento
         de la clase personajes*/
        System.out.println("Con un poder de: " + getPoder());
        System.out.println("Este tiene un grado de dificultad de : " + getDificultad());
        
     }
     
     public void crearEnemigo (String _nombre,int _vida, int _poder, int _vAtaque,int _dificultad){
     
        nombre =_nombre;
        vida = _vida;
        poder =_poder;
        vAtaque =_vAtaque;
        dificultad=_dificultad;
     }
}
