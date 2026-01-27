package opgave1_2;


import java.time.Year;

public class Værkfører extends Mekaniker {
    private Year værkføreUdnævnt;
    private double extraLøn;

    public Værkfører(Year svendÅr, double timeLøn, Year værkføreUdnævnt, double extraLøn) {
        super(svendÅr, timeLøn);
        this.værkføreUdnævnt = værkføreUdnævnt;
        this.extraLøn = extraLøn;
    }

    public Værkfører(String navn, String adresse, Year svendÅr, double timeLøn, Year værkføreUdnævnt, double extraLøn) {
        super(navn, adresse, svendÅr, timeLøn);
        this.værkføreUdnævnt = værkføreUdnævnt;
        this.extraLøn = extraLøn;
    }

    public double beregnLøn(){
        return super.beregnLøn()+(extraLøn*37);
    }

    public double getExtraLøn() {
        return extraLøn;
    }

    public void setExtraLøn(double extraLøn) {
        this.extraLøn = extraLøn;
    }

    public Year getVærkføreUdnævnt() {
        return værkføreUdnævnt;
    }

    public void setVærkføreUdnævnt(Year værkføreUdnævnt) {
        this.værkføreUdnævnt = værkføreUdnævnt;
    }
}
