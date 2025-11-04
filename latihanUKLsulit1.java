import java.util.Scanner;
public class latihanUKLsulit1 {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = masukan.nextInt();

        double totalNilai = 0;

        int i = 1;
        while(i <= jumlahSiswa) {
            System.out.println("Masukan nilai ssiswa ke-" + i + ": ");
            double nilai = masukan.nextDouble();
            totalNilai += nilai;
            i++;
        }
        double rataRata = totalNilai / jumlahSiswa;
        System.out.println("Jumlah nilai semua siswa adalah: " + totalNilai);
        System.out.println("Rata-rata nilai siswa adalah: " + rataRata);
    }
}
