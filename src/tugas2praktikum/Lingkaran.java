package tugas2praktikum;
public class Lingkaran implements MenghitungBidang {

    private double jariJari;
    double phi = 3.14;

    public double getJariJari() {
        return jariJari;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public double keliling() {
        return keliling(this.jariJari);
    }
    
    public double keliling(double jariJari){
        return 2*phi*jariJari;
    }

    @Override
    public double luas() {
        return luas(this.jariJari);
    }
    
    public double luas(double jariJari){
        return phi*jariJari*jariJari;
    }
    
    
    
    
}