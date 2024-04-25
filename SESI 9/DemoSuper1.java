class Kotap {
    protected double panjang;
    protected double lebar;
    protected double tinggi;

    Kotap(){
        panjang = lebar = tinggi = 0;
    }

    Kotap (int p, int l, int t){
        panjang = p;
        lebar = l;
        tinggi = t;
    }

    public double hitungVolume() {
        return (panjang * lebar * tinggi);
    }
}
class KotapPejal extends Kotak {
    private double berat;

    KotapPejal(int p, int l, int t, int b){
        super(p, l, t);
        berat = b;
    }

    public double getBerat() {
        return berat;
    }
}

class DemoSuper1 {
    public static void main(String[] args) {
        KotapPejal k = new KotapPejal(6, 5, 4, 2);

        System.out.println("Volume k : " + k.hitungVolume());
        System.out.println("Berat k  : " + k.getBerat());
    }
}