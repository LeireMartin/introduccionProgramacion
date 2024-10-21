package estudioEstructurasBasicas;


import java.util.Scanner;

public class EstudioTipoDeDatos {

public EstudioTipoDeDatos(){
    System.out.println("---Estudio tipo de datos:---");

    byte tipoByte=0;
    tipoByte=17;
    System.out.println("typoByte= "+ tipoByte);
//Declarar variable x como entera y variar su valor, mostrandolo en pantalla
    int x=5;
    System.out.println("El valor de 'x' es: "+x);    
    x=7;
    System.out.println("Ahora el valor de 'x' es: "+x);
    long tipoLong=76656613183716371L;
    char letra1= 'c';
    char letra2= 'a';
    char letra3='s';
    char letra4='a';

    System.out.println("letra1: "+ letra1);
    System.out.println("letra3: " +letra3);
    System.out.println("Todas las letras juntas: " + letra1+letra2+letra3+letra4);
    char c='A';
    int codAscii=c;
    System.out.println("Caracter "+c+" Ascii "+ codAscii);
    c=77;
    System.out.println("Caracter "+ c);
    float tipoFloat;
    tipoFloat=(float) 23.4;
    System.out.println(tipoFloat);
    //CASTING   
    int dividendo=7, divisor=3;
    int coc=dividendo/divisor;
    System.out.println("El cociente de la dicvison es :"+coc);
    double cociente=dividendo/(double)divisor;
    System.out.println("El cociente de la division es: "+cociente);// No muestra la arte decimal real. Para que te de el resultado real uno de los dos tiene que ser double.
//BOOLEAN
    System.out.println("---Boolean---");
    boolean sw=false;
    sw=dividendo>divisor;//Operacion tipo relacional y logico
    System.out.println(sw);

//CADENAS
System.out.println("---Cadenas---");
    String miPalabra="cerveza";
    String miFrase="¿Dónde está mi cerveza?";
    String miCaracter="M";
    System.out.println("Una palabra que uso con frecuencia: "+miPalabra);
    //Pedir datos
    System.out.println("---Pedir datos---");
    Scanner leer=new Scanner(System.in);
    String nombre="";
    int edad=0;
    System.out.println("Ingrese su nombre: ");
    nombre= leer.nextLine();
    leer=null;//Evitar problemas al mezclar variables cadenas y numericas.
    leer=new Scanner(System.in);
    System.out.println("Ingrese su edad: ");
    edad=leer.nextInt();
    System.out.println("Hola "+nombre+" tienes "+edad+" años.");

}

}
