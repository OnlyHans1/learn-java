class Luar {
    private int a;

    public void setA (int nilai){
        a = nilai;
    }
    public int getA(){
        return a;
    }
    class Dalam {
        private int x = 10;

        public void showData(){
            System.out.println("Nilai a dari kelas Luar  : " + a );
            System.out.println("Nilai x dari kelas Dalam : " + x );
        }
    }
    public void showData(){
        Dalam obj = new Dalam();
        obj.showData();
    }
}
class DemoInnerClass {
    public static void main(String[] args) {
        Luar obj1 = new Luar();

        obj1.setA(5);
        obj1.showData();
    }
}