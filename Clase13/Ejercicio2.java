import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        //Ejercicio
        /*
         * Ejercicio 
         * - Crear la funcion superficieRectangulo, ingresa como parámetros dos lados
         * y devuelve el calculo de superficie.
         * 
         * - Crear la funcion perimetroRectangulo, ingresa como parámetros dos lados
         * y devuelve el calculo devuelve el perimetro.
         * 
         */

        // Integer.parseInt("26")   Convierte un String con un número en un entero
        // Double.parseDouble("26.5")
        // Float.paseFloat("25.5")

        int lado1;
        int lado2;

        if(args.length==2){
            lado1=Integer.parseInt(args[0]);
            lado2=Integer.parseInt(args[1]);
        }else{
            System.out.print("Ingrese lado1 (cms): ");
            lado1=new Scanner(System.in).nextInt();
            System.out.print("Ingrese lado2 (cms): ");
            lado2=new Scanner(System.in).nextInt();
        }

        System.out.println(superficieRectangulo(lado1, lado2));
        System.out.println(perimetroRectangulo(lado1, lado2));

    }

    public static int superficieRectangulo(int lado1, int lado2){
        return lado1*lado2;
    }

    public static int perimetroRectangulo(int lado1, int lado2){
        return (lado1+lado2)*2;
    }

}