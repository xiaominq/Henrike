import java.util.ArrayList;
import java.util.List;

public class Autovermietung {
    private List <Auto> autos;

    public Autovermietung(){
        this.autos = new ArrayList<Auto>();
    }

    public List<Auto> getAutos() {
        return this.autos;
    }

    public void setAutos(List<Auto> autos) {
        this.autos = autos;
    }

    public void addAuto(Auto auto){
        this.autos.add(auto);
    }

    public List<Auto> filtern(String typ, int maxKm){
        List<Auto> gefiltert = new ArrayList<Auto>();
        for(Auto a : this.autos){
            if (typ.equals(a.getTyp()) && a.getKilometer() < maxKm){
                gefiltert.add(a);
            }
        }
        return gefiltert;
    }

    public static List<Auto> mergesort(List<Auto> autos){
        if(autos.size()>1){
            List<Auto>[] teillisten = split(autos);
            List<Auto> a1 = mergesort(teillisten[0]);
            List<Auto> a2 = mergesort(teillisten[1]);
            return merge(a1,a2);
        }
        return autos;
    }

    public static List<Auto>[] split(List<Auto> autos){
        int splitIndex = autos.size()/2+1;
        List<Auto> teilliste1 = autos.subList(0,splitIndex);
        List<Auto> teilliste2 = autos.subList(splitIndex, autos.size());
        /*for(i=0; i < auto.size(); i++){
            if (i<splitIndex){
                teilliste1.add(autos.get(i));
            }
            else{
                teilliste2.add(autos.get(i));
            }
        }*/
        return new List[]{teilliste1, teilliste2};
    }

    public static List<Auto> merge(List<Auto> a1, List<Auto> a2){
        List<Auto> sorted = new ArrayList<Auto>();
        for(int i = 0; i<a1.size();){
            for (int k = 0; k<a2.size();){
                if (a1.get(i).getKilometer() < a2.get(k).getKilometer()){
                    sorted.add(a1.get(i));
                    i++;
                }
                else{
                    sorted.add(a2.get(i));
                    k++;
                }
            }
        }
        return sorted;
    }


}
