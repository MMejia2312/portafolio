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
     Enemigos enemigo1= new Enemigos();
     
     Enemigos enemigo2= new Enemigos();
     Enemigos enemigo3= new Enemigos();
     Enemigos enemigo4= new Enemigos();
     Enemigos enemigo5= new Enemigos();
     Enemigos enemigo6= new Enemigos();
     Enemigos enemigo7= new Enemigos();
     Jefe jefe2 = new Jefe();
     
     enemigo1.crearEnemigo("forajido", 10,5,1,1);
     enemigo2.crearEnemigo("forajido", 12,5,1,1);
     enemigo3.crearEnemigo("forajido", 15,5,1,1);
     enemigo4.crearEnemigo("forajido", 20,5,1,1);
     enemigo5.crearEnemigo("forajido", 25,5,1,1);
     enemigo6.crearEnemigo("forajido", 15,5,1,1);
     enemigo7.crearEnemigo("forajido", 20,5,1,1);
     jefe2.crearJefe("Lider de los Forajidos", 30, 10, 1, 1, 0.02);
     System.out.println("te has encontrado con estos enemigos: ");
     enemigo1.muestraDatos();
     enemigo2.muestraDatos();
     enemigo3.muestraDatos();
     enemigo4.muestraDatos();
     enemigo5.muestraDatos();
     enemigo6.muestraDatos();
     enemigo7.muestraDatos();
     jefe2.muestraDatos();
     
}   
}
