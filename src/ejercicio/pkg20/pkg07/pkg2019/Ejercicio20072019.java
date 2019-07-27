/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg20.pkg07.pkg2019;

import java.util.Scanner;

/**
 *
 * @author edy manuel
 */
public class Ejercicio20072019 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // String nombre;
       //ombre = System.console().readLine();
        //System.out.println("Hola"+nombre+", ¡encantado de conocerte!");
        
        //Scanner s = new Scanner( System.in);
        //System.out.print("introduce tu nombre:");
        //String nombre = s.nextLine();
        //System.out.print("introduce tu edad:");
        //int edad = Integer.parseInt(s.nextLine());
        //System.out.println("Tu nombre es"+ nombre+"y tu edad es "+edad);
        
        
        //lectura por espacios en blanco
        
        //Scanner s = new Scanner( System.in);
        //System.out.print("introduce tu nombre y edad separados por un espacio");
        //String nombre = s.next();
        //int edad = s.nextInt();
        //System.out.println("Tu nombre es"+ nombre+"y tu edad es "+edad);
        
        //diferencia entre equals y el ==}
        
        //String c1= "Hola";
        //String c2= new String(c1);
        //String c3=c1;
        //System.out.println(c1+"=="+c2+"->"+(c1==c2));
        //System.out.println(c1+"equals"+c2+"->"+c1.equals(c2));
        //System.out.println(c3+"equals"+c1+"->"+c1.equals(c3));
        Scanner s= new Scanner(System.in);
        int numero = 0;
        while(numero>0){
            System.out.println("ingrese numero");
            numero = s.nextInt();
        }
        System.out.println("fin");
    }
    
}
