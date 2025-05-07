package day05_wrapperClass_MatematikselIslemler_Concatenation;

import java.util.Scanner;

public class C05_Ödev {

    public static void main(String[] args) {

        // 3 basamaklı bir tam sayı alıp rakamlar toplamını bulun.
        // girilen ... sayısının rakamlar toplamı.. şeklinde yaz


        Scanner scanner = new Scanner(System.in);
        System.out.println(" Lütfen 3 basamaklı bir pozitif tamsayı giriniz:");

        int tamSayi = scanner.nextInt();                // 345
        int tamSayi1 = tamSayi;

        int rakam = 0;
        int rakamlarToplami = 0;

        rakam = tamSayi % 10;                           //  5
        tamSayi = tamSayi / 10;                         // 34

        rakamlarToplami = rakamlarToplami + rakam;     // 5


        rakam = tamSayi % 10;                          // 4
        tamSayi = tamSayi / 10;                        // 3

        rakamlarToplami = rakamlarToplami + rakam;      // 5 + 4 = 9


        rakamlarToplami = rakamlarToplami + tamSayi;   // 9 + 3 = 12


        System.out.println(" Girilen " + tamSayi1 + " sayısının rakamlar toplamı:" + rakamlarToplami);

    }
}
