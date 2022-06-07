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
     System.out.println("para facilitarte las cosas, lus ataques seran automaticos hasta que termines con algun enemigo");
     
     while(enemigo1P2.vivo() == true){
         enemigo1P2.golpe(10);
     }
     
     Scanner escapamos = new Scanner(System.in);
     char escapamos1;
     System.out.println("¿Quieres seguir atacando?"); 
     System.out.println("Presiona 's' para continuar o cualquier letra para escapar");
     escapamos1 = escapamos.next().charAt(0);
      if (escapamos1 == 'S' || escapamos1 == 's' ){
          System.out.println("Perfecto continuemos");
          while(enemigo2P2.vivo() == true){
          enemigo2P2.golpe(10);
          
          System.out.println("¿Quieres seguir atacando?"); 
          System.out.println("Presiona 's' para continuar o cualquier letra para escapar");
          escapamos1 = escapamos.next().charAt(0);
          if (escapamos1 == 'S' || escapamos1 == 's' ){
              System.out.println("Perfecto continuemos");
            while(enemigo3P2.vivo() == true){
            enemigo3P2.golpe(10);
            }
              System.out.println("¿Quieres seguir atacando?"); 
              System.out.println("Presiona 's' para continuar o cualquier letra para escapar");
              escapamos1 = escapamos.next().charAt(0);
                if (escapamos1 == 'S' || escapamos1 == 's' ){
                System.out.println("Perfecto continuemos");
                     while(enemigo4P2.vivo() == true){
                     enemigo4P2.golpe(10);
                    }
                        System.out.println("¿Quieres seguir atacando?"); 
                        System.out.println("Presiona 's' para continuar o cualquier letra para escapar");
                        escapamos1 = escapamos.next().charAt(0);
                            if (escapamos1 == 'S' || escapamos1 == 's' ){
                             System.out.println("Perfecto continuemos");
                                while(enemigo5P2.vivo() == true){
                                 enemigo5P2.golpe(10);
                                }
                                   System.out.println("¿Quieres seguir atacando?"); 
                                   System.out.println("Presiona 's' para continuar o cualquier letra para escapar");
                                   escapamos1 = escapamos.next().charAt(0);
                                    if (escapamos1 == 'S' || escapamos1 == 's' ){
                                        System.out.println("Perfecto continuemos");
                                        while(enemigo6P2.vivo() == true){
                                        enemigo6P2.golpe(10);
                                        }
                                        System.out.println("¿Quieres seguir atacando?"); 
                                        System.out.println("Presiona 's' para continuar o cualquier letra para escapar");
                                        escapamos1 = escapamos.next().charAt(0);
                                            if (escapamos1 == 'S' || escapamos1 == 's' ){
                                             System.out.println("Perfecto continuemos");
                                                while(enemigo7P2.vivo() == true){
                                                 enemigo7P2.golpe(10);
                                                }
                                                    System.out.println("Ha aparecido un Jefe, no podemos hecharnos para atras.");
                                                    jefe2P2.muestraDatosJefe();
                                                    System.out.println("Toma esto, te ayudara a darle pelea.");
                                                    System.out.println("Ahora rienes un poder de 25.");
                                                    while (jefe2P2.vivo() == true){
                                                        jefe2P2.golpe(25);
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
