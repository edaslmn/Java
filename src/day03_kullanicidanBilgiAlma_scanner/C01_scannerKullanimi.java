package day03_kullanicidanBilgiAlma_scanner;

import java.util.Scanner;

public class C01_scannerKullanimi {

    public static void main(String[] args) {

        // kullanicidan bir tam sayi alin
        // ve girilen tam sayinin 10 katını asagıdaki sekilde yazdirin
        //orn: input=> 5   output=> girilen sayının 10 katı yani 50

        // 1. adım: scanner objesi oluşturun
        Scanner scanner = new Scanner(System.in);

        // 2. adım: kullanıcıya ne istediginizi yazdirin.
        System.out.println("Lütfen bir tam sayi giriniz.");

        // 3. adım: olusturdugumuz scanner objesini kullanarak kullanıcının girdigi bilgiyi
        // konsoldan alıp
        // olusturdugumuz uygun bir variable'e kaydedelim.

        int girilenSayi = scanner.nextInt();

System.out.println("girilen sayinin 10 kati :" + ( girilenSayi * 10 ));



    }
}
