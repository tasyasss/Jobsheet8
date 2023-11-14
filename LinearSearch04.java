package Jobsheet9;
import java.util.Scanner;

public class LinearSearch04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arrayInt = {34, 18, 26, 48, 72, 20, 56, 63};
        int key = 20;
        int hasil = 0;

        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] == key) {
                hasil = i;
                break;
            }
        }
        System.out.println("key ada dalam array pada indeks ke-" + hasil);
        
        // // --- pertanyaan 2 dan 3 dan 4 ---
        // Scanner sc = new Scanner(System.in);
        // int length, elemen[], hasil = -1, key = 0;
        // System.out.print("Input jumlah element array: ");
        // length = sc.nextInt();
        // elemen = new int[length];

        // for (int i = 0; i < length; i++) {
        //     System.out.print("Input elemen array ke " + i + ": ");
        //     elemen[i] = sc.nextInt();
        // }

        // System.out.print("Masukkan key yang akan dicari: ");
        // key = sc.nextInt();

        // for (int i = 0; i < elemen.length; i++) {
        //     if (elemen[i] == key) {
        //         hasil = i;
        //         System.out.println("key ada dalam array pada indeks ke-" + hasil);
        //     }
        // }
        // if (hasil == -1) {
        //     System.out.println("key tidak ada");
        // }

        sc.close();
    }
}
