import java.util.InputMismatchException;
import java.util.Scanner;

public class EstudioExcepciones {
 public EstudioExcepciones(){
    Scanner leer=new Scanner(System.in);
System.out.println("Estudio de Ecepciones en Java");
    String text=null;
    

    try{
     int div =5/5;
     System.out.println(div);

     int[] array={1,2,3};
     System.out.println(array[2]);

     System.out.println(text.length());

     System.out.println("Introduzca un numero");
    int num=leer.nextInt();
    //ponemos tantos catch como excepcions vaya a tener el codigo
    }catch(ArithmeticException e){
        //Le podemos poner el nombre que queramos al "e"
        //tiene que tener la excepcion que se va a producir
    
        System.out.println("Error division entre 0");
    }
    catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Error: "+e.getMessage());
        System.out.println("Indice fuera del rango");
    }
    catch(NullPointerException e){
        System.out.println("Error: "+e.getMessage());
    }
    catch(InputMismatchException e){
        System.out.println("Tipo de dato incorrecto.");
    }
    
    System.out.println("Fin del programa");
    
try {
    compruebaEdad(17);
} catch (MenorEdadException e) {
    // TODO Auto-generated catch block
    
}

}

private void compruebaEdad(int i) throws MenorEdadException {
    if(i<18){
        throw new MenorEdadException();
    }
}
}
