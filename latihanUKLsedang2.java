import java.util.Scanner;

public class LatihanUKLsedang2 {

    public static double hitungTabung(double r, double t) {
        double hasilHitungan = Math.PI * r * r * t;
        return hasilHitungan;
    }

    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);

        System.out.print("Masukkan jari-jari tabung (cm): ");
        double jarijari = masukan.nextDouble();

        System.out.print("Masukkan tinggi tabung (cm): ");
        double tinggi = masukan.nextDouble();

        double volume = hitungTabung(jarijari, tinggi);
        System.out.println("Hasil volume tabung adalah: " + volume);
    }
}
