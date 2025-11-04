import java.util.Scanner;
public class latihanUKLsulit2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int baris, kolom;

        System.out.print("Masukkan jumlah baris: ");
        baris = input.nextInt();
        System.out.print("Masukkan jumlah kolom: ");
        kolom = input.nextInt();

        int[][] A = new int[baris][kolom];
        int[][] B = new int[baris][kolom];
        int[][] C = new int[baris][kolom];

        System.out.println("\nMasukkan elemen matriks A:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                A[i][j] = input.nextInt();
            }
        }

        System.out.println("\nMasukkan elemen matriks B:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                B[i][j] = input.nextInt();
            }
        }

        // Tambahkan kedua matriks
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        System.out.println("\nHasil penjumlahan matriks:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}

