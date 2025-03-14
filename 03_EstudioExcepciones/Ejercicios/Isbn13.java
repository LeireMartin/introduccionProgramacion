
public class Isbn13 {
    
    public Isbn13() throws ISBNException {
        System.out.println("Comprueba ISBN-13");
        // 978-84-8130-252-3 = Correcto
        // 978-84-8450-382-8 Correcto
        // 978-84-204-4290-7 Correcto
        // 978-84-95354-15-0 Incorrecto
        String isbn = "978-84-8450-382-8";
        String isbnSin = isbn.replace("-", "");
        int[] isbnInt = new int[isbnSin.length()];
        for (int x = 0; x < isbnSin.length(); x++) {
           isbnInt[x]=Integer.parseInt(String.valueOf(isbnSin.charAt(x)));
        }
        
        int suma = 0;
        for (int x = 0; x < isbnInt.length - 1; x++) {
            if (x % 2 == 0) {
                isbnInt[x] *= 1;
                suma += isbnInt[x];
            }
            if (x % 2 != 0) {
                isbnInt[x] *= 3;
                suma += isbnInt[x];

            }
        }
        int resultado = 10 - (suma % 10);
        if (resultado == isbnInt[12])
            System.out.println("El ISBN es correcto");
        else {
           throw new ISBNException();
        }

    }



}
