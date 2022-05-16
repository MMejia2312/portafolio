/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.portafolio;

/**
 *
 * @author mario
 */
public class Pueblo_2 extends pueblos{
    protected int visitas = 0;
    
    protected void setVisitas (int _visitas){
        this.visitas = _visitas;
        
    } 
    
    protected int getVisitas(){
    return this.visitas;
}
    
    
 public static void AventuraPueblo2 (){
     /*en un inicio creamos los diferentes personajes que seran utilizados por cada pueblo, en este caso
     se crean 5 enemigos y 1 jefe.*/
     Enemigos enemigo1P2= new Enemigos();
     Enemigos enemigo2P2= new Enemigos();
     Enemigos enemigo3P2= new Enemigos();
     Enemigos enemigo4P2= new Enemigos();
     Enemigos enemigo5P2= new Enemigos();
     Enemigos enemigo6P2= new Enemigos();
     Enemigos enemigo7P2= new Enemigos();
     Jefe jefe2P2 = new Jefe();
     
     enemigo1P2.crearEnemigo("forajido", 10,5,1,1);
     enemigo2P2.crearEnemigo("forajido", 12,5,1,1);
     enemigo3P2.crearEnemigo("forajido", 15,5,1,1);
     enemigo4P2.crearEnemigo("forajido", 20,5,1,1);
     enemigo5P2.crearEnemigo("forajido", 25,5,1,1);
     enemigo6P2.crearEnemigo("forajido", 15,5,1,1);
     enemigo7P2.crearEnemigo("forajido", 20,5,1,1);
     jefe2P2.crearJefe("Lider de los Forajidos", 30, 10, 1, 1, 0.02);
     System.out.println("te has encontrado con estos enemigos: ");
     enemigo1P2.muestraDatosEnemigo();
     enemigo2P2.muestraDatosEnemigo();
     enemigo3P2.muestraDatosEnemigo();
     enemigo4P2.muestraDatosEnemigo();
     enemigo5P2.muestraDatosEnemigo();
     enemigo6P2.muestraDatosEnemigo();
     enemigo7P2.muestraDatosEnemigo();
     jefe2P2.muestraDatosJefe();
     
}   
}
