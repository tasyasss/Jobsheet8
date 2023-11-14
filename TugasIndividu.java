package Jobsheet9;
// import java.util.Scanner;

public class TugasIndividu {
    public static void main(String[] args) {
        // --- individu 1 ---
        int[] a = {1, 2, 3};
        int[] b = new int[a.length];

        for (int i = 0; i < a.length; i++){
            b[i] = a[i];
            System.out.print(b[i]);
        }

        // // --- individu 2 ---
        // Scanner sc = new Scanner(System.in);
        // int[] a = new int[10];
        // for (int i = 0; i < a.length; i++){
        //     System.out.print("Masukkan angka ke-" + i + ": ");
        //     a[i] = sc.nextInt();
        // }

        // for (int i = a.length - 1; i >= 0; i--){
        //     System.out.println(a[i]);
        // }
        // sc.close();
    }
}
