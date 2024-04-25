// import java.util.Scanner;

// public class Latihan1 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         int i = 1;
//         int total =0;

//         System.out.println("Menganalisis berapa kota?");
//         i += scanner.nextInt();

//         String [] kota = new String[i];
//         int [] jumlahKendaraan = new int [i];
//         int [] jenisKendaraan = new int [3];

//         System.out.println("Kota apa saja?");
//         i = 0;
//         while ( i < kota.length)
//         {
//             kota [i] = scanner.nextLine();
//             i++;
//         }
//         // for (i=0; i <= kota.length; i++)
//         // {
//         // kota [i] = scanner.nextLine();    
//         // }
//         i = 1;
//         while (i < jumlahKendaraan.length)
//         {
//             System.out.println("Berapa total keseluruhan jumlah kendaraan pada kota " + kota[i]);
//             jumlahKendaraan[i]= scanner.nextInt();
//             total += jumlahKendaraan[i];
//             i++;
//         }
//         // for (i = 0; i <= kota.length; i++)
//         // {
//         //     System.out.println("Berapa jumlah kendaraan pada kota "+  kota [i +1]);
//         //     jumlahKendaraan[i] = scanner.nextInt();
//         //     total+=jumlahKendaraan[i+1];
//         // }
//         System.out.println("Berapa Jumlah Mobil ");
//         jenisKendaraan[0] = scanner.nextInt();
//         total -= jenisKendaraan[0];

//         System.out.println("Berapa Jumlah Truk ");
//         jenisKendaraan[1] = scanner.nextInt();
//         total -= jenisKendaraan[1];

//         for ( i = 1; i < kota.length; i++)
//         {
//             System.out.println("Jumlah Kendaraan pada Kota " + kota[i] + " adalah " + jumlahKendaraan[i]);
//         }

//         System.out.println("Jumlah Mobil adalah " + jenisKendaraan[0]);
//         System.out.println("Jumlah Truk adalah " + jenisKendaraan[1]);
//         System.out.println("Jumlah Sepeda Motor adalah " + total);
//     }
// }
