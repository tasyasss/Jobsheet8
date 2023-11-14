package Jobsheet9;
import java.util.Scanner;

public class ArrayNilai04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nilaiAkhir = new int[5];
        // for (int i = 0; i < 10; i++) {
        //     System.out.print("Input nilai akhir mahasiswa ke-" + (i+1) + ": ");
        //     nilaiAkhir[i] = sc.nextInt();
        // }
        // for (int i = 0; i < 10; i++) {
        //     System.out.println("Nilai akhir mahasiswa ke-" + (i+1) + " adalah " + nilaiAkhir[i]);
        // }

        // // --- pertanyaan 1 ---
        // for (int i = 0; i < nilaiAkhir.length; i++) {
        //     System.out.print("Input nilai akhir mahasiswa ke-" + (i+1) + ": ");
        //     nilaiAkhir[i] = sc.nextInt();
        // }
        // for (int i = 0; i < 10; i++) {
        //     System.out.println("Nilai akhir mahasiswa ke-" + (i+1) + " adalah " + nilaiAkhir[i]);
        // }

        // // --- pertanyaan 3 ---
        // for (int i = 0; i < nilaiAkhir.length; i++) {
        //     System.out.print("Input nilai akhir mahasiswa ke-" + (i+1) + ": ");
        //     nilaiAkhir[i] = sc.nextInt();
        // }
        // for (int i = 0; i < 10; i++) {
        //     if (nilaiAkhir[i] > 70) {
        //         System.out.println("Mahasiswa ke-" + (i+1) + " lulus");    
        //     }
        // }

        // // --- pertanyaan 4 ---
        // for (int i = 0; i < nilaiAkhir.length; i++) {
        //     System.out.print("Input nilai akhir mahasiswa ke-" + (i+1) + ": ");
        //     nilaiAkhir[i] = sc.nextInt();
        // }
        // for (int i = 0; i < 10; i++) {
        //     if (nilaiAkhir[i] > 70) {
        //         System.out.println("Mahasiswa ke-" + (i+1) + " lulus");
        //     } else {
        //         System.out.println("Mahasiswa ke-" + (i+1) + " tidak lulus");
        //     }
        // }

        // --- pertanyaan 5 ---
        double jumlah = 0, mean, rendah = 100, tinggi = 0;
        int lulus = 0, tdkLulus = 0;
        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Input nilai akhir mahasiswa ke-" + (i+1) + ": ");
            nilaiAkhir[i] = sc.nextInt();
            // rumus totalan
            jumlah += nilaiAkhir[i];

            // cari terbesar terkecil
            if (nilaiAkhir[i] > tinggi) {
                tinggi = nilaiAkhir[i];
            }
            if (nilaiAkhir[i] <= rendah) {
                rendah = nilaiAkhir[i];
            }
        }
        System.out.println("------------------------------");
        for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] > 70) {
                System.out.println("Mahasiswa ke-" + (i+1) + " lulus");
                lulus++;
            } else {
                System.out.println("Mahasiswa ke-" + (i+1) + " tidak lulus");
                tdkLulus++;
            }
        }
        // System.out.println(jumlah);
        System.out.println("------------------------------");
        mean = jumlah / nilaiAkhir.length;
        System.out.println("Rata-rata nilai mahasiswa: " + mean);
        
        System.out.println("Nilai tertinggi: " + tinggi);
        System.out.println("Nilai terendah: " + rendah);

        System.out.println("Mahasiswa lulus: " + lulus);
        System.out.println("Mahasiswa tidak lulus: " + tdkLulus);



        sc.close();
    }
}
