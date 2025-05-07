package day03_kullanicidanBilgiAlma_scanner;

import java.util.Scanner;

public class C04_DikdörtgeninAlanınıYazdirma {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

System.out.println("Dikdörtgenin uzun kenarını yazınız:");
double uzunkenar = scanner.nextDouble();

System.out.println("Dikdörtgenin kısa kenarını yazınız: ");
double kısakenar = scanner.nextDouble();

// Dikdörtgenin alanı
        System.out.println("Dikdörtgenin alanı:" + ( uzunkenar * kısakenar) );

    }
}
