class Kotak {
    double panjang;
    double lebar;
    double tinggi;

    Kotak (double p, double l, double t) {
        panjang = p;
        lebar = l;
        tinggi = t;
    }

    double hitungVolume (){
        return (panjang * lebar * tinggi);
    }

    boolean sama (Kotak k){
        if ((k.panjang == this.panjang) && (k.lebar == this.lebar) && (k.tinggi == this.tinggi)){
            return true;
        }
        else {
            return false;
        }
    }
}

class DemoParamObjek1{
    public static void main(String[] args) {
        
        Kotak k1, k2, k3, k4;

        k1 = new Kotak(4, 2, 3);
        k2 = new Kotak(9, 6, 4);
        k3 = new Kotak(4, 3, 2);
        k4 = new Kotak(6, 5, 4);

        System.out.println("K1 == K2 : " + k1.sama(k2));
        System.out.println("K1 == K3 : " + k1.sama(k3));
        System.out.println("K1 == K4 : " + k1.sama(k4));
    }
}