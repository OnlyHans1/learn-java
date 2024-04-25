// import java.util.Scanner;

// public class SkorBola {
//     public static void main (String [] args){
//         Scanner input = new Scanner(System.in);

//         System.out.print("Masukan Nama Tim : ");
//         String team = input.nextLine();
//         System.out.print("Main Ke 1 (M/K)");
//         String m1 = input.nextLine();
//         System.out.print("Main ke 2 (M/K)");
//         String m2 = input.nextLine();
//         input.close();

//         int total = 0;
//         if (m1.equalsIgnoreCase("M") && m2.equalsIgnoreCase("M")){
//             total = 2;
//         } 
//         else if (m1.equalsIgnoreCase("K") && m2.equalsIgnoreCase("K")){
//             total=0;
//         } 
//         else {
//             total = 1;
//         }
//         System.out.println("");
//         System.out.println("        HASIL PERTANDINGAN SEPAK BOLA       ");
//         System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
//         System.out.println("NAMA TIM    : " + team);
//         System.out.println("MAIN KE 1   : " + m1);
//         System.out.println("MAIN KE 2   : " + m2);
//         System.out.println("SKOR        : " + total);

//         if (total == 2){
//             System.out.println("Keterangan : Medali Emas");
//         }
//         else if (total == 1 && m1.equalsIgnoreCase("M")){
//             System.out.println("Keterangan : Medali Perak");
//         }
//         else if (total == 1 && m2.equalsIgnoreCase("M")){
//             System.out.println("Keterangan : Medali Perunggu");
//         }
//         else {
//             System.out.println("Latihan Lebih Keras!");
//         }
//     }
// }
