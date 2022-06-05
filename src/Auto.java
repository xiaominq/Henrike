public class Auto {
    private String typ;
    private String farbe;
    private int kilometer;

    public Auto(String typ, String farbe){
        this.typ = typ;
        this.farbe = farbe;
    }

   public String getTyp(){
        return this.typ;
    }

    public String getFarbe(){
        return this.farbe;
    }

    public int getKilometer() {
        return this.kilometer;
    }

    public void setKilometer(int kilometer) {
        this.kilometer = kilometer;
    }

    public String toString(){
        return (this.typ + ", " + this.farbe + ",  "  + Integer.toString(this.kilometer) + "km");
    }
}
