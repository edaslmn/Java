package day20_whileLoop;

import java.util.Scanner;

public class C02_WhileLoop {

    public static void main(String[] args) {

        // kullanıcıdan pozitif sayılar girmesini isteyin
        // kullanıcı pozitif sayılar girdiği muddetce gireilen sayıları toplayın
        // kullanıcı işlemi bitirmek istediğinde sıfıra bassın
        // kullanıcı negatif deger girerse, kullanıcıya uyarı yazdırın
        // girilen negatif sayıyı işleme dahil etmeyin

        Scanner scanner = new Scanner(System.in);

        int girilenSayı = 10;
        int sayılarınToplamı = 0;

        while (girilenSayı != 0) { // loop un bitmesi için gerekli şartı değil
                                    // loop un devam etmesi için gerekli sartı yazıyoruz

            System.out.println("lütfen pozitif bir tamsayı giriniz: ");
            girilenSayı = scanner.nextInt();

            if (girilenSayı > 0 ) {
                sayılarınToplamı += girilenSayı;
            } else if (girilenSayı < 0) {
                System.out.println("pozitif bir sayı girmelisiniz.");

            }

        }
    }
}