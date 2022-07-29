/*
Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase 
es una ‘A’. 

Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que 
diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar 
la función Substring y equals() de Java.
 */
package Ejercicios_Normales;

import java.util.Scanner;

public class Ej09_IF_ELSE_palabra_empieza_con_A_ {

    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una frase:");
        String frase = leer.nextLine();
     
    if(frase.substring(0,1).toUpperCase().equals("A")){
        // if(frase.toUpperCase().startsWith("A"))
        System.out.println("CORRECTO, la palabra empieza con A");
        System.out.println("");
        
    }else {
        System.out.println("INCORRECTO, la palabra no empieza con A");}
        System.out.println("");
    } 
}