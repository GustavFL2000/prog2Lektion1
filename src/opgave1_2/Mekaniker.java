package opgave1_2;

import java.time.Year;

public class Mekaniker extends Person{
    private Year SvendÅr;
    private double timeLøn;

    public Mekaniker(Year svendÅr, double timeLøn) {
        SvendÅr = svendÅr;
        this.timeLøn = timeLøn;
    }

    public Mekaniker(String navn, String adresse, Year svendÅr, double timeLøn) {
        super(navn, adresse);
        SvendÅr = svendÅr;
        this.timeLøn = timeLøn;
    }

    public double beregnLøn(){
        //Beregner løn for en uge med 37timer
        return timeLøn*37;
    }

    public Year getSvendÅr() {
        return SvendÅr;
    }

    public void setSvendÅr(Year svendÅr) {
        SvendÅr = svendÅr;
    }

    public double getTimeLøn() {
        return timeLøn;
    }

    public void setTimeLøn(double timeLøn) {
        this.timeLøn = timeLøn;
    }
}
