package tugas2praktikum;
public class PersegiPanjang implements MenghitungBidang {
    private double panjang, lebar;

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    @Override
    public double keliling() {
        return keliling(this.panjang, this.lebar);
    }
    
    public double keliling(double panjang, double lebar){
        return 2*(panjang+lebar);
    }

    @Override
    public double luas() {
        return luas(this.panjang, this.lebar);
    }
    
    public double luas(double panjang, double lebar){
        return panjang*lebar;
    }

    
    
}