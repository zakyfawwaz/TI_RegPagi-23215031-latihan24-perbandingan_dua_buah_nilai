import java.util.Scanner;

public class Latihan_24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ulang;

        System.out.println("===== Program Perbandingan Nilai =====");

        do {
            // Meminta input dari user
            System.out.print("Masukkan nilai pertama: ");
            int nilaiPertama = input.nextInt();

            System.out.print("Masukkan nilai kedua: ");
            int nilaiKedua = input.nextInt();

            // Menampilkan hasil perbandingan
            System.out.print("Hasil: ");
            if (nilaiPertama > nilaiKedua) {
                System.out.println("Nilai pertama lebih besar dari nilai kedua");
            } else if (nilaiPertama < nilaiKedua) {
                System.out.println("Nilai pertama lebih kecil dari nilai kedua");
            } else {
                System.out.println("Nilai pertama sama dengan nilai kedua");
            }

            // Menanyakan apakah user ingin mengulangi aktivitas
            System.out.print("Apakah Anda ingin mengulangi aktivitas? (ya/tidak): ");
            ulang = input.next();

        } while (ulang.equalsIgnoreCase("ya"));

        System.out.println("Program selesai. Terima kasih!");
    }
}
