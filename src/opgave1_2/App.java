package opgave1_2;

import java.time.Year;
import java.util.ArrayList;

public class App {
    /**
     * Beregner summen af ugelønnen for alle i listen
     **/
    public static double samletLoen(ArrayList<Mekaniker> list){
        double total = 0;
        for(Mekaniker mekaniker : list){
            total += mekaniker.beregnLøn();
        }
        return total;
    }

    public static void main(String[] args) {

        ArrayList<Mekaniker> liste = new ArrayList<>();

        Mekaniker m1 = new Mekaniker("gitte", "vej1",Year.of(2007) ,300);
        Mekaniker m2 = new Mekaniker("jette", "vej2",Year.of(2006) ,310);
        Værkfører v1 = new Værkfører("Hans","vej4",Year.of(2000),400,Year.of(2010),200);
        Synsmand s1 = new Synsmand("Bo","Vej4",Year.of(2002),300,100);

        liste.add(m1);
        liste.add(m2);
        liste.add(v1); // polymorfi
        liste.add(s1); // polymordi

        double samletLøn = samletLoen(liste);
        System.out.println("Samlet ugeløn: " + samletLøn + " kr.");
    }
}
