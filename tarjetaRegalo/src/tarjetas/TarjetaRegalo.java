package tarjetas;

public class TarjetaRegalo {
    private String saldo;
    private int id;
   

    public TarjetaRegalo() {
    }

    public TarjetaRegalo(String saldo)  {
        this.saldo = getSaldo(saldo);
        id = generaId();

    }

    private int generaId() {
        id = (int) Math.floor(Math.random() * (99999 - 0 + 1) - 0);
        return id;
    }

    public String getSaldo(String saldo) {
        return saldo;
    }

    public void setSaldo(String saldo)  {
        
         double saldoDouble=0.0;
        
            saldoDouble = Double.parseDouble(saldo);
       
        
        this.saldo = saldo;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "TarjetaRegalo [saldo=" + saldo + ", id=" + id + "]";
    }
}
