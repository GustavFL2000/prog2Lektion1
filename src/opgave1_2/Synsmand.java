package opgave1_2;

import java.time.Year;

public class Synsmand extends Mekaniker{
    private int antalSyn;

    public Synsmand(Year svendÅr, double timeLøn, int antalSyn) {
        super(svendÅr, timeLøn);
        this.antalSyn = antalSyn;
    }

    public Synsmand(String navn, String adresse, Year svendÅr, double timeLøn, int antalSyn) {
        super(navn, adresse, svendÅr, timeLøn);
        this.antalSyn = antalSyn;
    }

    public double beregnLøn(){
        return super.beregnLøn()+(antalSyn*29);
    }

    public int getAntalSyn() {
        return antalSyn;
    }

    public void setAntalSyn(int antalSyn) {
        this.antalSyn = antalSyn;
    }
}
