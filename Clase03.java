public class Clase03{
    public static void main(String[] args) {
       
        //Clase 03

        //Triple comillas 
        //JDK 16 o superior

        System.out.println("""
                Clase03
                Java 17
                """);

        //JDK15 o inferior

        System.out.println(
        "Clase03\n"+
        "Java 15"
        );

        //Operadores Relacionales
        /*
         *      Operador      Nombre                Tipo
         *          <         menor                 binario
         *          <=        menor igual           binario
         *          >         mayor                 binario
         *          >=        mayor igual           binario
         *          ==        equals(comparación)   binario
         *          !=        not equals(no igual)  binario
         *          !         not(no)               unario
         */

         boolean llueve=false;
         int temp=20;
         boolean log1=true;
         boolean log2=false;
         int nro1=5;
         int nro2=7;

         System.out.println(nro1<nro2);         //true
         System.out.println(nro1<=nro2);        //true
         System.out.println(nro1<=nro2-2);      //true
         System.out.println(nro1<=nro2-3);      //false
         System.out.println(nro1>nro2);         //false
         System.out.println(nro1>=nro2);        //false
         System.out.println(nro1==nro2);        //false [operador == compara terminos]
         System.out.println(nro1==(20+30));     //false
         System.out.println(nro1+2==nro2);      //true
         System.out.println(nro1!=nro2);        //true
         System.out.println(nro1+2!=nro2);      //false

         System.out.println(log1);              //true
         System.out.println(!log1);             //false
         System.out.println(!!log1);            //true
         System.out.println(!!!log1);           //false
         System.out.println(!!!!log1);          //true


        //Tabla de verdad

        /*
         *      X       Y       OR      AND
         *      F       F       F       F
         *      F       V       V       F   
         *      V       F       V       F
         *      V       V       V       V
         */

       //Operadores Logicos
       /*
        *       Operador        Nombre
        *           ||          OR
        *           &&          AND
        */

        System.out.println(log1||log2);         //true      
        System.out.println(log1&&log2);         //false

        //Operadores binarios | & (or and)
        System.out.println(log1 | log2);          //true
        System.out.println(log1 & log2);          //false

        System.out.println(log1 || (2+2+2+2+2+2+2)==4);     //true
        System.out.println(log1 | (2+2+2+2+2+2+2)==4);      //true
        

        boolean exp;
        exp=nro1==5 || nro2==7 || !log1 || nro2==nro1-1;    //true
        //     v     |          |        |   

        System.out.println(exp);


        exp=nro1==5 && nro2==7 && !log1 && nro2==nro1-1;    //false
        //     v     |     v    |    f   |   

        System.out.println(exp);

        exp=nro1==5 && nro2==7 && !!log1 && nro2==nro1-2;    //false
        //     v     |     v    |    v   |      f  

        System.out.println(exp);

        exp=nro1==5 && nro2==7 && !!log1 && nro2==nro1+2;    //true
        //     v     |     v    |    v   |      v  

        System.out.println(exp);

        exp=2+4*3==14;                                       //true
        System.out.println(exp);

        exp=(2+4)*3==14;                                     //false
        System.out.println(exp);

        exp= ( nro1 == 5 && nro2 == 5) || !!(log1 && nro2==nro1+2); //true
        //             F               |  V
        System.out.println(exp);

        //Entradas por teclado o consola

        System.out.println("Ingrese su nombre");
        String nombre=new java.util.Scanner(System.in).nextLine(); 
        System.out.println("Hola "+nombre);

        System.out.println("Ingrese su edad:");
        int edad=new java.util.Scanner(System.in).nextInt();
        System.out.println("Su edad es: "+edad);


        //TODO Operadores Relaciones

    } //end main 
} //end class