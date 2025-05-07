package day05_wrapperClass_MatematikselIslemler_Concatenation;

import java.util.Scanner;

public class C04_RakamlarToplaminiBulma {

    public static void main(String[] args) {

        // Kullanicidan 3 basamaklı bir pozitif bir
        // tamsayi alıp girilen sayinin rakamlar toplamini yazdırın.


        Scanner scanner = new Scanner(System.in);
        System.out.println(" Lutfen 3 basamaklı pozitif bir tamsayi giriniz:");
        int sayi = scanner.nextInt(); //234

        int rakam = 0;
        int rakamlarToplami = 0;

rakam = sayi % 10; // sayının son rakamını verir. rakam = 4
rakamlarToplami = rakamlarToplami + rakam; // rakamlarToplami = 4

sayi = sayi / 10; // sayı artık iki basamaklı oldu. // sayıyı 10'a bölüp bölüm kısmını verir. sayi = 23

            rakam = sayi % 10;    // rakam = 3
            rakamlarToplami = rakamlarToplami + rakam;   // rakamlarToplami = 4 + 3 = 7

            sayi = sayi / 10; // sayi artık bir basamaklı. // sayi = 2

            rakamlarToplami = rakamlarToplami + sayi;    // rakamlarToplami = 7 + 2 = 9

        System.out.println("girilen sayının rakamlar toplamı:" + rakamlarToplami);



    }
}
