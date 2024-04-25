//  import java.util.Scanner;
//  public class Limas {
//         private double panjang;
//         private double lebar;
//         private double tinggi;
    
//         public void setPanjang(double panjang) {
//             this.panjang = panjang;
//         }
    
//         public void setLebar(double lebar) {
//             this.lebar = lebar;
//         }
    
//         public void setTinggi(double tinggi) {
//             this.tinggi = tinggi;
//         }
    
//         public double getPanjang() {
//             return panjang;
//         }
    
//         public double getLebar() {
//             return lebar;
//         }
    
//         public double getTinggi() {
//             return tinggi;
//         }
    
//         public double hitungVolume() {
//             return (panjang * lebar * tinggi) / 3;
//         }
    
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

//         System.out.print("Masukkan Panjang Limas: ");
//         double panjang = input.nextDouble();

//         System.out.print("Masukkan Lebar Limas: ");
//         double lebar = input.nextDouble();

//         System.out.print("Masukkan Tinggi Limas: ");
//         double tinggi = input.nextDouble();

//         Limas limas = new Limas();
//         limas.setPanjang(panjang);
//         limas.setLebar(lebar);
//         limas.setTinggi(tinggi);

//         System.out.println();
//         System.out.println("Panjang Limas: " + limas.getPanjang());
//         System.out.println("Lebar Limas: " + limas.getLebar());
//         System.out.println("Tinggi Limas: " + limas.getTinggi());
//         System.out.println("Volume Limas: " + limas.hitungVolume());

//         input.close();
//     }
// }

