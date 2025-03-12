import java.util.Arrays;
import java.util.Scanner;

@SuppressWarnings("unused")
public class AlgoritmoLuhn {
    public AlgoritmoLuhn()throws TarjetaException{
        //Scanner leer=new Scanner(System.in);
       
        String tarjetaBancaria="462005844188702";
        int[] tarjeta=new int[tarjetaBancaria.length()];
        int suma=0;

        if(tarjetaBancaria.length()==16){
        
            try {
                
                for (int i = 0; i < tarjetaBancaria.length(); i++) {
                    tarjeta[i]=Integer.parseInt(String.valueOf(tarjetaBancaria.charAt(i)));

                    if(i%2==0){
                        tarjeta[i]*=2;
                        if(tarjeta[i]>9){
                            int decena=tarjeta[i]/10;
                            int unidad=tarjeta[i]%10;

                            tarjeta[i]=decena+unidad;
                        }
                    }
                    suma+=tarjeta[i];
                }
                
                if(suma%10!=0){
                    throw new TarjetaException();
                }
             System.out.println(Arrays.toString(tarjeta));
            } catch (Exception e) {
                System.out.println(e.getMessage());;
            }
        }else{
            throw new TarjetaException();
        }

        System.out.println( Arrays.toString(tarjeta)+" "+suma);
    }
    
}
