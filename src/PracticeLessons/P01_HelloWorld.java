package PracticeLessons;

public class P01_HelloWorld {

    public static void main(String[] args) {

          // soru1: Aşağıdaki ifadelerin her birini tek bir satır kod içine yazarak konsola yazdırınız.

          //  Hello World               a=3                  Hello                        World

            System.out.println("Hello World");

            int a = 3;
            System.out.println("a=" + 3);
            System.out.println("Hello        World");

        System.out.println("Merhaba");
        System.out.println("Dünya");

        System.out.println("\"Hello Java Ben Geldim.\"");

        //soru4: tek bir sout içinde konsola
        /* Hello World
            "Merhaba Dünya"
         */

        System.out.println("Hello World\n\t\"Merhaba Dünya\"" );

        /*
        \" : ters slash işareti kendinden sonraki kod olarak algılanmamasını sağlar
        \t : bu işaret konulan string içinde işaretin konulduğu yere bit TAB tuşu(4 space) kadar boşluk bırakır
        \n or \r: String içinde konulduğu yerden itibaren aşşağı satırdan devam eder

 */
        Ödev:
/*
        ÖDEV SORUSU: Aşağıdaki gibi bir ATM Karşılama Ekranı Hazırlayıp yazdırınız
        **********  WISE BANK   **********
            WISE ATM'YE HOŞGELDİNİZ
            1 – Bakiye Sorgulama
            2 – Para Yatırma
            3 – Para Çekme
            4 – Bilgi Güncelleme
            5 – Kart İade
        **********  WISE BANK   **********
 */

        System.err.println("Wise Quarter"); // konsola kırmızı olarak düşer. hata yazdırmak için kullanılır.



    }
}
