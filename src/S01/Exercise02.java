package S01;

import java.util.Scanner;
/*
Desarrollar un Algoritmo que permita calcular la remuneración del trabajador donde ingrese 
el básico y cargo; Según el Cargo recibirá lo siguiente:
 Si su cargo es obrero    [O] : Bonificación 100; Asignación 120.
 Si su cargo es empleado [E]: Bonificación 120; Asignación 150 y Refrigerio 200.
 Si su cargo es ejecutivo [J] : Bonificación 250; Refrigerio 250 y Asignación 500.
Calcule y Visualizar el total que es la Suma de todos los ingresos.
*/
public class Exercise02 {
    public static void main(String[] args) {
    int basico, total =  0;
        Scanner input = new Scanner(System.in);
        System.out.println("¿Cúal es su sueldo básico: ?");
        basico = input.nextInt();
        input.nextLine();
        System.out.println("¿Cúal es su cargo?");
        String cargo = input.nextLine();
        if (cargo.toUpperCase().equals("O")) {
            total = basico + 100 + 120;
        }
    
        if (cargo.toUpperCase().equals("E")) {
            System.out.println("sida");
            total = basico + 120 + 150 + 500;
        }    
    
        if (cargo.toUpperCase().equals("J")) {
            total = basico + 250 + 250 + 500;
        }
        System.out.println("La suma de todos los ingresos es de: "+total);
    
    
    
    
    }
}
