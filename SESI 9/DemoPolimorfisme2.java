class Bentuk {
    public double luas() {
        System.out.println("Tidak didefinisikan");
        return 0;
    }
}

class PersegiPanjang extends Bentuk {
    private double panjang;
    private double lebar;

    PersegiPanjang(int p, int l) {
        panjang = p;
        lebar = l;
    }

    public double luas() {
        System.out.println("Dalam objek Persegi Panjang : ");
        return (panjang * lebar);
    }
}

class BujurSangkar extends Bentuk {
    private double sisi;

    BujurSangkar(int s) {
        sisi = s;
    }

    public double luas() {
        System.out.println("Dalam objek Bujur Sangkar : ");
        return (sisi * sisi);
    }
}

class Segitiga extends Bentuk {
    private double alas;
    private double tinggi;

    Segitiga(int a, int t) {
        alas = a;
        tinggi = t;
    }

    public double luas() {
        System.out.println("Dalam objek Segitiga : ");
        return ((alas * tinggi) / 2);
    }
}

class Lingkaran extends Bentuk {
    private double jarijari;

    private final double PI = 3.1416;

    Lingkaran(int r) {
        jarijari = r;
    }

    public double luas() {
        System.out.println("Dalam objek Lingkaran : ");
        return (PI * jarijari * jarijari);
    }
}

public class DemoPolimorfisme2 {
    public static void main(String[] args) {
        Bentuk obj;

        PersegiPanjang pp = new PersegiPanjang(5, 3);
        BujurSangkar bs = new BujurSangkar(4);
        Segitiga st = new Segitiga(4, 3);
        Lingkaran lk = new Lingkaran(2);

        obj = pp;
        System.out.println("Luas Persegi Panjang : " + obj.luas());
        System.out.println();

        obj = bs;
        System.out.println("Luas Bujur Sangkar : " + obj.luas());
        System.out.println();

        obj = st;
        System.out.println("Luas Segitiga : " + obj.luas());
        System.out.println();

        obj = lk;
        System.out.println("Luas Lingkaran : " + obj.luas());
        System.out.println();
    }
}
