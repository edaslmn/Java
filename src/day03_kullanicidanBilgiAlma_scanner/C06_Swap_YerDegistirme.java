package day03_kullanicidanBilgiAlma_scanner;

import java.util.Scanner;

public class C06_Swap_YerDegistirme {

    public static void main(String[] args) {

        // kullanıcıdan iki sayı alıp ikisinin de degerleini degistirin.

        Scanner scanner = new Scanner(System.in);


        System.out.println("Lütfen ilk tamsayiyi giriniz:");
        int sayi1 = scanner.nextInt();

        System.out.println("Lütfen ikinci tamsayiyi giriniz: ");
        int sayi2 = scanner.nextInt();

        int temp = 0;

        temp = sayi2;

        sayi2 = sayi1;

        sayi1 = temp;

        // boş kova olmadan variable'nin değerlerini degiştirin => ödev



    }



}
