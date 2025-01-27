package interfaces;

public class Rana extends Animal implements Presa, Cazador{
public Rana(){

}

@Override
public void acechar() {
    System.out.println("Caza bichos");}

@Override
public void huir() {
System.out.println("¡Cuidado con los pájaros!");
}
}
