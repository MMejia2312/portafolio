/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.portafolio;

import java.util.Scanner;

/**
 *
 * @author mario
 */
public class Pueblo_1 extends pueblos {
    protected int visitas = 0;
    //la variable "visitas" nos servira para saber si el jefe de este pueblo ya fue vencido para asi no volver
    // a crearlo si se vuelve a visitar el pueblo.
    
    
    protected void setVisitas (int _visitas){
        this.visitas = _visitas;
        
    } 
    
    protected int getVisitas(){
    return this.visitas;
}
    /*el metodo pelea, como su nombre lo indica sera utilizado para realizar los diferentes combates
    que tendran lugar en los pueblos (el metodo podria ser movido a la clase padre "pueblos")*/
    public static void pelea(){
        
    }
    
 public static void AventuraPueblo1 (){
     /*en un inicio creamos los diferentes personajes que seran utilizados por cada pueblo, en este caso
     se crean 5 enemigos y 1 jefe.*/
     Enemigos enemigo1P1= new Enemigos();
     Enemigos enemigo2P1= new Enemigos();
     Enemigos enemigo3P1= new Enemigos();
     Enemigos enemigo4P1= new Enemigos();
     Enemigos enemigo5P1= new Enemigos();
     Jefe jefe1P1 = new Jefe();
     
     //la vida de los ladrones va aumentando en evidencia de la dificultad de cada uno.
     enemigo1P1.crearEnemigo("Ladron", 10,5,1,1);
     enemigo2P1.crearEnemigo("Ladron", 12,5,1,1);
     enemigo3P1.crearEnemigo("Ladron", 15,5,1,1);
     enemigo4P1.crearEnemigo("Ladron", 20,5,1,1);
     enemigo5P1.crearEnemigo("Ladron", 25,5,1,1);
     jefe1P1.crearJefe("Lider de los Ladrones", 30, 10, 1, 1, 0.02);
     System.out.println("te has encontrado con estos enemigos: ");
     enemigo1P1.muestraDatosEnemigo();
     enemigo2P1.muestraDatosEnemigo();
     enemigo3P1.muestraDatosEnemigo();
     enemigo4P1.muestraDatosEnemigo();
     enemigo5P1.muestraDatosEnemigo();
     System.out.println("para facilitarte las cosas, lus ataques seran automaticos hasta que termines con algun enemigo");
     
     while(enemigo1P1.vivo() == true){
         enemigo1P1.golpe(10);
     }
     
     Scanner escapamos = new Scanner(System.in);
     char escapamos1;
     System.out.println("¿Quieres seguir atacando?"); 
     System.out.println("Presiona 's' para continuar o cualquier letra para escapar");
     escapamos1 = escapamos.next().charAt(0);
      if (escapamos1 == 'S' || escapamos1 == 's' ){
          System.out.println("Perfecto continuemos");
          while(enemigo2P1.vivo() == true){
          enemigo2P1.golpe(10);
          
          System.out.println("¿Quieres seguir atacando?"); 
          System.out.println("Presiona 's' para continuar o cualquier letra para escapar");
          escapamos1 = escapamos.next().charAt(0);
          if (escapamos1 == 'S' || escapamos1 == 's' ){
              System.out.println("Perfecto continuemos");
            while(enemigo3P1.vivo() == true){
            enemigo3P1.golpe(10);
            }
              System.out.println("¿Quieres seguir atacando?"); 
              System.out.println("Presiona 's' para continuar o cualquier letra para escapar");
              escapamos1 = escapamos.next().charAt(0);
                if (escapamos1 == 'S' || escapamos1 == 's' ){
                System.out.println("Perfecto continuemos");
                     while(enemigo4P1.vivo() == true){
                     enemigo4P1.golpe(10);
                    }
                        System.out.println("¿Quieres seguir atacando?"); 
                        System.out.println("Presiona 's' para continuar o cualquier letra para escapar");
                        escapamos1 = escapamos.next().charAt(0);
                            if (escapamos1 == 'S' || escapamos1 == 's' ){
                             System.out.println("Perfecto continuemos");
                                while(enemigo5P1.vivo() == true){
                                 enemigo5P1.golpe(10);
                                }
                                System.out.println("Ha aparecido un Jefe, no podemos hecharnos para atras.");
                                jefe1P1.muestraDatosJefe();
                                System.out.println("Toma esto, te ayudara a darle pelea.");
                                System.out.println("Ahora rienes un poder de 25.");
                                while (jefe1P1.vivo() == true){
                                    jefe1P1.golpe(25);
                                }

                            }else{
                            System.out.println("Hora de la retirada");
                            }
                        
                 }else{
                 System.out.println("Hora de la retirada");
                }
          
            }else{
            System.out.println("Hora de la retirada");
            }
        }
      }else{
          System.out.println("Hora de la retirada");
      }
     
     
     
     
    }
 }
    

