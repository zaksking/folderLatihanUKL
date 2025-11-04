import java.math.BigInteger;
import java.util.Scanner;

public class latihanUKLsedang1 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan bilangan bulat positif: ");
            int n = input.nextInt();
            
            // Pastikan input positif
            if (n < 0) {
                System.out.println("Bilangan harus positif!");
            } else {
                BigInteger faktorial = BigInteger.ONE; // mulai dari 1
                
                for (int i = 1; i <= n; i++) {
                    faktorial = faktorial.multiply(BigInteger.valueOf(i));
                }
                
                System.out.println("Faktorial dari " + n + " adalah:");
                System.out.println(faktorial);
            }
        }
    }
}
