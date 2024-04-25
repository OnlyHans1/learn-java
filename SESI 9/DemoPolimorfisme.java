class Penyanyi {
    public void bernyanyi (){
        System.out.println("Karakteristik nadanya " + "Belum didefinisikan");
    }
}
class PenyanyiJazz extends Penyanyi {
    public void bernyanyi (){
        System.out.println("Bernyanyi dengan irama Jazz");
    }
}
class PenyanyiPop extends Penyanyi {
    public void bernyanyi (){
        System.out.println("Bernyanyi dengan irama Pop");
    }
}
class PenyanyiDangdut extends Penyanyi {
    public void bernyanyi (){
        System.out.println("Bernyanyi dengan irama Dangdut");
    }
}
class DemoPolimorfisme {
    public static void main(String[] args) {
        Penyanyi p;

        PenyanyiJazz musmujiono = new PenyanyiJazz();
        PenyanyiPop audi = new PenyanyiPop();
        PenyanyiDangdut inul = new PenyanyiDangdut();

        p = musmujiono;
        p.bernyanyi();

        p = audi;
        p.bernyanyi();

        p = inul;
        p.bernyanyi();

    }
}