package modelo;

public class TarjetaRegalo {

    private double saldo;

    public TarjetaRegalo() {
    }

    public TarjetaRegalo(double saldo) {
        this.getSaldo();
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
     
    public void gasta(saldo){

        if (saldo > this.saldo){
            throw new SaldoInsuficienteException();
        }else{
            this.saldo -= saldo;
        }

    }
}


