package estudioEstructurasBasicas;

import java.util.Scanner;

public class EjerciciosMath {
    public EjerciciosMath(){
        System.out.println("EJERCICIOS MATH");
        Scanner leer=new Scanner(System.in);
        //Decimal a binario

        // String numero = " ";
        // int noleido=leer.nextInt();
        // int resto=0;
        // int div=0;
        // do{ resto= noleido%=2;
        //     div= noleido/=2;
        //     numero+=resto;


        // }while(div!=1);
        // System.out.println(numero);


        //1.    Introducir un número entero por teclado que se supone que es un año. 
        //Indicar si es bisiesto o no y por qué motivo (P.e.: “Es bisiesto por ser múltiplo de 4 y no de 100”.
        //P.e.: “Es bisiesto por ser múltiplo de 400”. P.e.: “No es bisiesto por ser múltiplo de 100”).

        // int anno=0;
      

        // do{
        //     System.out.println("Introduce un año para saber si es bisiesto");
        //     anno = leer.nextInt();

        // }while(anno<0);
        // if (anno>0){
        //     if((anno%100==0)&&(anno%400==0)){
        //         System.out.println("El año "+ anno+" es Bisiesto a pesar de ser múltiplo de 100 por que tabien es múltiplo de 400.");
        //     }
        //     else if(anno%100==0){
        //         System.out.println("El año"+anno+ "no es bisiesto por que es múltiplo de 100");
        //         System.out.println("El año "+ anno+" es Bisiesto a pesar de ser múltiplo de 100 por que tabien es múltiplo de 400.");
        //     }
        //     else if(anno%4==0){
        //         System.out.println("El año "+anno+ " es bisiesto por que es múltipo de 4");
                
        //     }
        //     else{
        //         System.out.println("El año "+anno+" no es bisiesto, no es múltiplo ni de 4 ni de 400");
        //     }
        // }

    // 2.  Calcular la suma : 1 + 2 + 3 +.....+ 20. 
    //     Luego, la suma : 1 + 3 +5 +  + 51.
    //     Y, por último, la suma : 1 - 2 + 3 -   + 19 - 20.

        //a. 
        int suma1=0;
        for(int i=1;i<21;i++){
            suma1+=i;
        }
        System.out.println(suma1);


        //b.

        int a=1;
        int suma2=0;
        do{
            a++;
            if(a%2!=0){
                suma2+=a;
            }
        }while(a<52);
        System.out.println(suma2+1);//le sumo 1 por que al obligarle a entrar a el bucle le he quitado el primer 1
    
        //c.

        int suma3=0;

        for(int no=1;no<21;no++){
            if(no%2==0){
                suma3-=no;
            }
            else if(no%2!=0){
                suma3+=no;
            }
        }
        System.out.println(suma3);
    
    }

}
