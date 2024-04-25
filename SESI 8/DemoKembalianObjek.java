class Kotax {
    double panjang;
    double lebar;
    double tinggi;

    Kotax (double p, double l, double t){
        panjang = p;
        lebar = l;
        tinggi = t;
    }

    double hitungVolume(){
        return (panjang * lebar * tinggi);
    }

    Kotax perbesar (int M){
        Kotax temp = new Kotax (panjang*M, lebar*M, tinggi*M);
        return temp;
    }
}
class DemoKembalianObjek {
    public static void main(String[] args) {
        Kotax kOriginal, kBaru;

        kOriginal = new Kotax(4, 3, 2);

        kBaru = kOriginal.perbesar(2);

        System.out.println("Nilai pada objek kOriginal");
        System.out.println("panjang\t: " + kOriginal.panjang);
        System.out.println("lebar\t: " + kOriginal.lebar);
        System.out.println("tinggi\t: " + kOriginal.tinggi);
        System.out.println("Volume\t: " + kOriginal.hitungVolume());
        System.out.println("");

        System.out.println("Nilai pada objek kBaru");
        System.out.println("panjang\t: " + kBaru.panjang);
        System.out.println("lebar\t: " + kBaru.lebar);
        System.out.println("tinggi\t: " + kBaru.tinggi);
        System.out.println("Volume\t: " + kBaru.hitungVolume());

    }
}