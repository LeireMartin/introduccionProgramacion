package modelo;

public class Bicicleta {
    private int numMarchas;
    private int diaRueda;



    
    public Bicicleta() {
    }

    
    public Bicicleta(int numMarchas, int diaRueda) {
        this.numMarchas = numMarchas;
        this.diaRueda = diaRueda;
    }


    public int getNumMarchas() {
        return numMarchas;
    }

    public void setNumMarchas(int numMarchas) {
        this.numMarchas = numMarchas;
    }
    public int getDiaRueda() {
        return diaRueda;
    }
    public void setDiaRueda(int diaRueda) {
        this.diaRueda = diaRueda;
    }
    


}
