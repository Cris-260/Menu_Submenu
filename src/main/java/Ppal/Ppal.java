package Ppal;

import Misclases.Arreglo;
import java.util.Scanner;


public class Ppal {

    public static void main(String[] args) {
       Arreglo op = new Arreglo();
        Scanner sc = new Scanner(System.in);
        int opcion, opcion2, opcion3;
         do{
            System.out.println("\n Digite la opcion \n 1. Cargar. \n 2. Imprimir \n 3. Invertir \n 4. Ordenar \n 5. Salir ");
            opcion = sc.nextInt();
            switch(opcion){
                case 1 -> op.cargar();
                case 2 -> op.imprimir();
                case 3 -> op.invertir();
                case 4 -> {
                    System.out.println("Digite: \n 1.Burbuja. \n 2. Seleccion");
                    opcion2 = sc.nextInt();
                    switch(opcion2){
                        case 1 -> { System.out.println("1. Asecendente \n 2. Descendente");
                        opcion3 = sc.nextInt();
                        switch(opcion3){
                            case 1: op.burbuja();
                            case 2: op.burbuja(); op.invertir();
                        }
                        }
                        case 2 -> { System.out.println("1. Asecendente \n 2. Descendente");
                        opcion3 = sc.nextInt();
                        switch(opcion3){
                            case 1: op.secuencial();
                            case 2: op.secuencial();op.invertir();
                        }
                        }
                    }
                        
                }
                
    }
}
                 while(opcion !=5);
    }
    
}