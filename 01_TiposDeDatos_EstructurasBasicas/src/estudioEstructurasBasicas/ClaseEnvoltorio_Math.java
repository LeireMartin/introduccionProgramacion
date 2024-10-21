package estudioEstructurasBasicas;

public class ClaseEnvoltorio_Math {
    public ClaseEnvoltorio_Math() {
        String n = "123";
        int x = 123;
        int num;
        String num2;

        num = Integer.parseInt("1234"); //añades valor cadena a int SOLO ACEPTA CADENA NUMERICA SI NO DA NUMBERFORMATEXCEPTION
        System.out.println(num);

        // Comentar metodo valueOF para hacer lo contrario
        num2 = String.valueOf(14);
        String numString = Integer.toString(x);//Convierte int en string
        System.out.println("Numero " + x + " como cadena :" + numString);

        //metodo Integer
        System.out.println("1111 en base 2 = " + Integer.parseInt("1111", 2));//Que es base 2
        System.out.println("123456 en hexadecimal =" + Integer.toHexString(123456));//Codigo hexadecimal
        System.out.println("135 en binario =" + Integer.toBinaryString(135));//codigo binario

        //Validar caracteres
        char c = 'H';
        boolean sw = true;
        System.out.println("El caracter c es una letra ? .." + Character.isLetter(c));
        System.out.println("El caracter c es una digito ? .." + Character.isDigit(c));
        System.out.println("El caracter c es mayuscula ? .." +  Character.isUpperCase(c));

        //Pasar cadena de numeros a double
        String numDoble = "53.725538";
        double d = Double.parseDouble(numDoble);
        System.out.printf("La cadena %s es el numero %.3f %n", numDoble, d);

        //Pasar true/false a cadena
        String valorSw = "true";
        sw = Boolean.parseBoolean(valorSw);
        System.out.println(Boolean.toString(sw));
        // System.out.println(sw);

        // LA CLASE MATH
        System.out.println("Math.ceil============================");
        System.out.println(Math.ceil(2.3));// muestra por consola 3.0
        System.out.println(Math.ceil(0.895));// muestra por consola 1.0
        System.out.println(Math.ceil(-1.87));// muestra por consola .1.0
        System.out.println(Math.ceil(-0.9));// muestra por consola .0.0
        System.out.println("Math.floor==========================");
        System.out.println(Math.floor(2.8));// muestra por consola 2.0
        System.out.println(Math.floor(0.895));// muestra por consola 0.0
        System.out.println(Math.floor(-1.87));// muestra por consola .2.0
        System.out.println(Math.floor(-0.9));// muestra por consola .1.0
        System.out.println("Redondeos=============================");
        System.out.println(Math.rint(0.891));// muestra por consola 1.0
        System.out.println(Math.rint(6.5));// muestra por consola 6
        System.out.println(Math.rint(6.51));// muestra por consola 7
        System.out.println("Potencias y raices=================");
        System.out.println(Math.pow(5, 2));// muestra por consola 25
        System.out.println(Math.sqrt(25));// muestra por consola 5
        System.out.println(Math.pow(25, 1 / 2.0));// raiz cuadrada 25 = 5
        System.out.println(Math.pow(125, 1 / 3.0));// raiz cubica 125 = 5
        System.err.println("Trigonometría================");
        int angulo = 30;
        System.out.println(Math.sin(Math.toRadians(angulo)));//
        System.out.printf("El seno de un angulo de %d grados es = %.1f %n",
                angulo, Math.sin(Math.toRadians(angulo)));
        double cosAngulo = 0.86;
        System.out.printf("Un coseno de %.2f corresponde a un angulo de %f%n",
                cosAngulo, Math.toDegrees(Math.acos(cosAngulo)));
        System.err.println("Max de dos numeros==============");
        System.out.println(Math.max(3, 14));
        System.err.println("Aleatorios====================");
        System.out.println(Math.random());
        int ale = 0;
        for (x = 0; x < 20; x++) {
            ale = (int) Math.floor(Math.random() * 5);
            System.out.print(ale + "-");
        }
        System.out.println();
        for (x = 0; x < 10; x++) {
            ale = (int) Math.floor(Math.random() * 10 + 1);
            System.out.print(ale + "-");
        }
        System.out.println();
        int menor = 5, mayor = 7;
        for (x = 0; x < 20; x++) {
            ale = (int) Math.floor(Math.random() * (mayor - menor + 1) + menor);
            System.out.print(ale + "-");
        }
    }

}
