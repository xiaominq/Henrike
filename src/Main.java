import java.util.List;

public class Main {

    public static void main(String[] args){

        Autovermietung av = new Autovermietung();

        Auto auto = new Auto("Sportwagen", "blau");
        auto.setKilometer(25000);

       av.addAuto(auto);

       //Autos hinzufügen

        List<Auto> gefiltert = av.filtern("Sportwagen", 50000);
        for(Auto a: gefiltert){
            System.out.println(a.toString());
        }

        List<Auto> sorted = av.mergesort(av.getAutos());

    }
}
