package day03_kullanicidanBilgiAlma_scanner;

import java.util.Scanner;

public class C02_KullanicidanDegerAlma {

    public static void main(String[] args) {

        // kullanıcıdan bir double,
        // bir de int sayı alip bunlarin toplamini ve carpimini yazdirin.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen bir ondalikli sayi giriniz.");
        double girilenOndalikliSayi = scanner.nextDouble();

        System.out.println("Lütfen bir tamsayi giriniz.");
        int girilenTamsayi = scanner.nextInt();

        // girilen sayıların toplamini yazdiralim
        System.out.println("girilen sayıların toplamı :" + (girilenOndalikliSayi + girilenTamsayi) );

        // girilen sayıların carpimlarini yazdiralim.
        System.out.println("girilen sayıların carpimi :" + girilenTamsayi * girilenOndalikliSayi);

    }
}
