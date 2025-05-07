package day03_kullanicidanBilgiAlma_scanner;

import java.util.Locale;
import java.util.Scanner;

public class C05_KullaniciBilgileriniYazdirma {

    public static void main(String[] args) {

        // kullanicinin ismini, soyismini ve yasini alıp su formatta yazdırın.
        // girilen bilgiler : J Doe, 44


        Scanner scanner = new Scanner(System.in);

        System.out.println(" adınızı giriniz: ");
       char isminilkharfi = (scanner.nextLine().toUpperCase().charAt(0));

          /*
            Kullanicidan metin degeri alinacaksa
            scanner.next() veya scanner.nextLine() kullanabiliriz
            ikisi arasinda tek bir fark var
            scanner.next() : Kullanici birden fazla kelime girse de
                             ilk kelimeyi (ilk space'e kadar olan kismi) alir
            scanner.nextLine() : girilen satirdaki tum harfleri ve kelimeleri alir
            EGER kullanicidan TEK BIR karakter alacaksak
            scanner.nextChar() olmadigi icin
            once scanner.nextLine() ile tum metni alip
            sonra o metnin ilk harfini charAt(0) ile alabiliriz.
            ONEMLI NOT  :
            eger kullanicidan birden fazla metin degeri alacaksak
            scanner.nextLine() ile almaniz tavsiye edilir
            eger ilk degeri scanner.next() ile sonraki degeri scanner.nextLine() ile alirsaniz
            sorun yasayabilirsiniz
         */


        System.out.println("Soyisminizi giriniz:");
        String soyisim = scanner.nextLine();

        System.out.println("Yasınızı giriniz:");
        int yas = scanner.nextInt();

        System.out.println("Girilen bilgiler:" + isminilkharfi + " " + soyisim + ", " + yas);

    }




}
