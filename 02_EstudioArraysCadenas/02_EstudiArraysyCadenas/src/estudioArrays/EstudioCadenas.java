package estudioArrays;

public class EstudioCadenas {
    public EstudioCadenas(){
        System.out.println("ESTUDIO CADENAS");

        System.out.println("Propiedades de las cadenas");
        String cadena="Hola mundo!:";

        System.out.println("---.length---");

        int tam=cadena.length();
        System.out.println("El tamaño de la cadena "+ cadena+" es de:"+tam+" caracteres.");

        System.out.println("------CharAt-----");
        for(int x=0; x<cadena.length(); x++){
            System.out.println(cadena.charAt(x)+"-");
        }

        System.out.println("----------Substring---------");
        System.out.println(cadena.substring(0, tam));
        System.out.println(cadena.substring(2));
        

        System.out.println("---------indexOf--------");
        System.out.println(cadena.indexOf("mundo"));
        System.err.println(cadena.indexOf('!'));
        System.out.println(cadena.indexOf('x'));

        System.out.println("-------EQUALS-----");
        System.out.println("Devuelve true o False");
        System.out.println(cadena.equals("HOLA MUNDO!:"));
        System.out.println(cadena.equalsIgnoreCase("HOLA MUNDO!:"));//IGNORA MAYUSCULAS

        System.out.println("-------copareTo------");
        //Permite comparar cadenas lexicográficamente.
        //Retornará 0 si son IGUALES
        //Retornará -x si el 1º es ANTERIOR afabeticamente.
        //Retornará x si el 1º es POSTERIOR alfabeticamente.
         String a="Ana";
         String b="Bea";
        System.out.println(a.compareTo(b));

        System.out.println("------Trim------");
        //Elimina espacios por delante y por detras.
        String cadena3= cadena.trim();
        System.out.println(cadena3);

        System.out.println("----ToLowerCase------ToUpperCase----");
        //pasa a mayusculas o minusculas
        System.out.println(cadena.toUpperCase());

        System.out.println("-----Replace-----");
        System.out.println(cadena.replace(':','!'));
        
        System.out.println("----StartWith-----Contains----EndsWith----");
        //Devuelve true o false
        System.out.println(cadena.startsWith("Hola"));
        System.out.println(cadena.contains("!"));
        System.out.println(cadena.endsWith(":"));

        System.out.println("----Split----");
        //Trasforma Strings en Arrays 
        String nombres= "Juan, Luis, Ana, Pepe";
        System.out.println(nombres.split(","));

        System.out.println("-----ToCharArray----");
        char[] caracteres;
        caracteres=cadena.toCharArray();
        for(int x=0; x<caracteres.length;x++){
            System.out.println(caracteres[x]);}
        
       

}
}
