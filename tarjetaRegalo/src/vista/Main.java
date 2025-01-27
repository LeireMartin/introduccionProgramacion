package vista;

import tarjetas.SaldoIncorrectoException;
import tarjetas.TarjetaRegalo;

public class Main {
public static void main(String[] args) throws SaldoIncorrectoException {
    
   
    TarjetaRegalo();
   

    
}
private static void TarjetaRegalo() {
    try {
        TarjetaRegalo t1=new TarjetaRegalo("150");
    System.out.println(t1);
    TarjetaRegalo t2=new TarjetaRegalo("Hola");
    System.out.println(t2);
    } catch (NumberFormatException e) {
       System.out.println(e.getMessage());
    }
    
    

}
}
