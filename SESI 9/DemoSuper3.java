class A {
    protected int a;
}
class B extends A {
    private int a;

    B (int nilai1, int nilai2){
        super.a = nilai1;
        a = nilai2;
    }
    public void tampilkanNilai(){
        System.out.println("Nilai a di dalam kelas A : " + super.a);
        System.out.println("Nilai a di dalam kelas b : " + a);
    }
}
class DemoSuper3 {
    public static void main(String[] args) {
        B obj = new B (121, 212);
        obj.tampilkanNilai();
    }
}