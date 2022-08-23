public class Rectangulo {
    public static void main(String[] args) {
        /*
         * -Ingresar por consola la longitud de dos lados de un rectangulo
         * -Calcular e imprimir el perímetro y superficie del rectangulo
         */
    
    System.out.println("Ingrese el lado 1:");
    int lado1=new java.util.Scanner(System.in).nextInt();
    System.out.println("Ingrese el lado 2:");
    int lado2=new java.util.Scanner(System.in).nextInt();

    double perimetro=(lado1+lado2)*2;
    double superficie=(lado1*lado2);
    
    System.out.println("Perimetro= "+perimetro);
    System.out.println("Superficie= "+superficie);

    //TODO Replicar todo con un triangulo rectangulo,
    //debe ingresar base y altura

    System.out.println("Ingrese el lado 1: ");
    int lado1=new java.util.Scanner(System.in).nextInt();
    System.out.println("Ingrese el lado2: ");
    int lado2:new java.util.Scanner(System.in).nextInt();

    double base=(lado1+lado2)/2;
    // RESOLVER Y APRENDER MATEMATICAS DE PRE-ESCOLAR double altura=() 
    }
}