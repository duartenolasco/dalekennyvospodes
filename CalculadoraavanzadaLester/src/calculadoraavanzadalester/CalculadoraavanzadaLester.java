/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadoraavanzadalester;

import java.util.Scanner;
import javax.swing.JOptionPane;
//acciones de la calculadora promedio de 3 numeros
//sumar
//restar, multiplicar, division y residuo, potencia
//raiz cuadrada, ecuacion cuadratica
/**
 *
 * @author leste
 */
public class CalculadoraavanzadaLester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
      int dato = 0, numero = 0, dato2 = 0;
      double primernumero, segundonumero, numerorandom=0;
      double suma,  resta, division, multiplicacion, potencia, raizcu, raizcubica;
      double logaritmo, numerologaritmo=0;
        
        
        System.out.println("1.- calculadora sencilla");
        System.out.println("2.- calculadora especial");
        System.out.println("3.- salir");
        System.out.println("seleccione un numero en el rango del 1 al 3: ");
        numero = entrada.nextInt();
        
      if(numero==1){ 
           System.out.println("****************************************");
        System.out.println("Hola que tal te mostrare la calculadora simple");//el ln es para salto de linea
        System.out.println("Las operaciones que puedes realizar son:");
        System.out.println("1.- Suma");
        System.out.println("2.- Resta");
        System.out.println("3.- Division");
        System.out.println("4.- Multiplicacion");
        System.out.println("5.- Raiz cuadrada de un numero");
        System.out.println("6.- Potencia de un numero");
        System.out.println("7.- Salir");
        System.out.print("Escoja una opcion: ");
        dato = entrada.nextInt();
        System.out.println("****************************************");
        
       
        
        switch(dato){
            
            case 1: System.out.print("Digite su primer numero: ");
        primernumero = entrada.nextDouble();
        System.out.print("Digite su segundo numero: ");
        segundonumero =entrada.nextDouble();
        
        System.out.println("El primer numero es: "+primernumero);
        System.out.println("el segundo numero es: "+segundonumero);
        
       suma = primernumero + segundonumero;
      
       System.out.println("la suma de sus dos numeros es: "+suma);
                break;
          
            case 2: 
                System.out.print("Digite su primer numero: ");
        primernumero = entrada.nextDouble();
        System.out.print("Digite su segundo numero: ");
        segundonumero =entrada.nextDouble();
        
        System.out.println("El primer numero es: "+primernumero);
        System.out.println("el segundo numero es: "+segundonumero);
        
       resta = primernumero - segundonumero;
      
       System.out.println("la resta de sus dos numeros es: "+resta);
                break;
                
            case 3: System.out.print("Digite su primer numero: ");
        primernumero = entrada.nextDouble();
        System.out.print("Digite su segundo numero: ");
        segundonumero =entrada.nextDouble();
        
        System.out.println("El primer numero es: "+primernumero);
        System.out.println("el segundo numero es: "+segundonumero);
        
       division = primernumero / segundonumero;
      
       System.out.println("la division de sus dos numeros es: "+division);
                break;
                
            case 4: System.out.print("Digite su primer numero: ");
        primernumero = entrada.nextDouble();
        System.out.print("Digite su segundo numero: ");
        segundonumero =entrada.nextDouble();
        
        System.out.println("El primer numero es: "+primernumero);
        System.out.println("el segundo numero es: "+segundonumero);
        
       multiplicacion = primernumero * segundonumero;
      
       System.out.println("la multiplicacion de sus dos numeros es: "+multiplicacion);
                break;
                
            case 5: 
                System.out.print("Digite el numero que desea saber la raiz cuadrada:");
                primernumero = entrada.nextDouble();
                
                raizcu = Math.sqrt(primernumero);
                System.out.println("La raiz cuadrada de "+primernumero+" es: "+raizcu);
                
                break;
                
            case 6: System.out.print("Ingrese el numero que desea elevar: ");
                    primernumero = entrada.nextDouble();
                    
                    System.out.println("Ingrese cuantas veces desea elevarlo");
                    System.out.print("Puede ser del 0 al infinito: ");
                    segundonumero = entrada.nextDouble();
                    
                    potencia = Math.pow(primernumero, segundonumero);
                    
                    System.out.println("El numero  "+primernumero+" elevado al "+segundonumero+" Da como resultado: "+potencia);
                
                break;
                
            case 7: 
                System.out.println("el numero ingresado no tiene funcion");
                
            default: System.out.println("El numero no esta en el rango mencionado");
        }   
    }
      
      if(numero==2){
        System.out.println("calculadora especial");
        System.out.println("****************************************");
        System.out.println("Hola que tal te mostrare la calculadora especial");
        System.out.println("Las operaciones que puedes realizar son:");
        System.out.println("1.- potencia");
        System.out.println("2.- raiz cubica");
        System.out.println("3.- numero aleatorio");
        System.out.println("4.- calcular hipotenusa");
        System.out.println("5.- calcular logaritmo ");
        System.out.println("6.- salir ");
        System.out.print("Escoja una opcion: ");
        dato2 = entrada.nextInt();
        System.out.println("****************************************");
        
         switch(dato2){
            
            case 1: System.out.print("Ingrese el numero que desea elevar: ");
                    primernumero = entrada.nextDouble();
                    
                    System.out.println("Ingrese cuantas veces desea elevarlo");
                    System.out.print("Puede ser del 0 al infinito: ");
                    segundonumero = entrada.nextDouble();
                    
                    potencia = Math.pow(primernumero, segundonumero);
                    
                    System.out.println("El numero  "+primernumero+" elevado al "+segundonumero+" Da como resultado: "+potencia);
                break;
          
            case 2: 
                System.out.print("Digite el numero que desea saber la raiz cubica:");
                primernumero = entrada.nextDouble();
                
                raizcubica = Math.cbrt(primernumero);
                System.out.println("La raiz cuadrada de "+primernumero+" es: "+raizcubica);
                
                break;
                
            case 3: System.out.println("a continuacion te mostrare un numero aleatorio");
                 numerorandom = Math.random();
                System.out.println("el numero aleatorio es: "+numerorandom);
                break;
                
            case 4: System.out.println("calcular la hipotenusa de un triangulo rectangulo");
            double catetoa =0, catetob = 0;
                System.out.println("Ingrese el cateto a: ");
                catetoa = entrada.nextDouble();
                System.out.println("Ingrese el cateto b: ");
                catetob = entrada.nextDouble();
                
            double hipotenusa = Math.hypot(catetoa, catetob);
                System.out.println("la hipotenusa del triangulo rectangulo es: "+hipotenusa);
                
                break;

                
            case 5: 
                System.out.println("ingrese el numero que desea calcular su logaritmo");
                numerologaritmo = entrada.nextDouble();
                
                logaritmo = Math.log(numerologaritmo);
                
                System.out.println("el logarirmo natural de "+numerologaritmo+"es: "+logaritmo);
                break;
                
            case 6: 
                 System.out.println("gracias por utilizar mi calculadora");
        System.exit(0);
                break;
                
           
            default: System.out.println("El numero no esta en el rango mencionado");
        }
    }
      
    if(numero==3){
        System.out.println("gracias por utilizar mi calculadora");
        System.exit(0);
    }
    
    else{
        System.out.println("el numero ingresado no tiene funcion");}
        
    }
    
}
