import java.util.Scanner;

public class LatihanUKLmudah2 {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        int bilangan;

        System.out.print("Masukkan bilangannya: ");
        bilangan = masukan.nextInt();

        if (bilangan % 2 == 0) {
            System.out.println(bilangan + " adalah bilangan genap.");
        } else {
            System.out.println(bilangan + " adalah bilangan ganjil.");
        }
    }
}
