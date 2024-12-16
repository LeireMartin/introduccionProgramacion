
public class Encriptacion {
    public Encriptacion() {
        System.out.println("------Encriptación de mensajes----");
        // Encripta y desencripta el siguiente mensaje:

        String mensaje = "Atacaremos al amanecer de la primera luna de Marzo";

        // La clave para desencriptar el mensaje es trasladar las posiciones del
        // mensaje:

        int[] clave = { 3, 4, 9, 6, 1, 7, 9, 8, 5, 2 };

        String[][] encriptacion = new String[(mensaje.length()/10)][(clave.length)];
        String desencriptado = "";
        encriptacion = encriptaMensaje(encriptacion, mensaje, clave);
        //desencriptado = desencriptaMensaje(encriptacion, clave);
        //muestraMensaje(encriptacion, desencriptado, mensaje);

    }

    private void muestraMensaje(String[][] encriptacion, String desencriptado, String mensaje) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'muestraMensaje'");
    }

    private String desencriptaMensaje(String[][] encriptacion, int[] clave) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'desencriptaMensaje'");
    }

    private String[][] encriptaMensaje(String[][] encriptacion, String mensaje, int[] clave) {
       int longitudMensaje= mensaje.length();
       int fila= longitudMensaje/clave.length;
       if (longitudMensaje%clave.length!=0) {
        int espacios=longitudMensaje%clave.length;
        System.out.println(fila+" "+espacios);
       }
       for(int x=0;x<mensaje.length();x++){
        //cortar mensaje

        
       }
    

       
       return null;
    }

}
