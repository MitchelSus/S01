package S01;

import java.util.Scanner;
/*
Ingrese  por  Teclado  el  Nombre  del  Obrero,  las  horas  trabajadas  y  el  Tipo  de  Actividad 
(Pintado, Laqueado, Barnizado), por cada hora trabajada se le pagara:
a) Si el Servicio es Pintado se le pagara s/. 10 
b) Si el Servicio es Laqueado se le pagara s/. 12 
c) Si el Servicio es Barnizado se le pagara s/. 14 
Por  cada  hora  extra  se  le  pagara  30%  más  sobre  el  pago  por  hora  trabajada,  sabiendo  que 
semanalmente trabaja 40 horas. Calcule y visualice El Jornal Semanal que recibirá el Obrero, el Jornal Extra y el Total del Jornal.
*/
public class Exercise01 {
    public static void main(String[] args) {
        int extra = 0, semanal = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("¿Cúal es el nombre del empleado?");
        String name = input.nextLine();
        System.out.println("¿Cuantas horas semanales trabajó?");
        int h_work = input.nextInt();
        input.nextLine();
        System.out.println("¿Cúal es la actividad que realiza?");
        String activity = input.nextLine();
        if (activity.toLowerCase().equals("pintor")) {
            semanal = h_work*10;
            System.out.println("El jornal semanal que recibirá el obrero es de: "+semanal);
            if(h_work>40){
               extra = semanal * 30 / 100;
                System.out.println("El jornal extra que recibirá el obrero es de: "+extra);
            }
        }
        
        if (activity.toLowerCase().equals("laqueado")) {
            semanal = h_work*12;
            System.out.println("El jornal semanal que recibirá el obrero es de: "+semanal);
            if(h_work>40){
               extra = semanal * 30 / 100;
                System.out.println("El jornal extra que recibirá el obrero es de: "+extra);
            }            
        }
        
        if (activity.toLowerCase().equals("barnizado")) {
            semanal = h_work*14;
            System.out.println("El jornal semanal que recibirá el obrero es de: "+semanal);
            if(h_work>40){
               extra = semanal * 30 / 100;
                System.out.println("El jornal extra que recibirá el obrero es de: "+extra);
            }        
        }
        
        int total = extra + semanal;
        System.out.println("El jornal total que recibirá el obrero es de: "+total);
    
    
    
    }

}
