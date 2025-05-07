package day02_variableKullanimi_scanner;

public class C04_DataTurleri {

    public static void main(String[] args) {


        boolean bl1 = true;
        boolean bl2 = false;

        /* boolean bl3 = "true" ==> "" içindeki her seyi string yani metin olarak kabul eder.
                                     ve bu boolean için uygun degildir.
         */



        char chr1 = 'e';
        char chr2 = '5';
        char chr3 = '$';
      //char chr4 = 'a '; ==> char tek bir karaktere izin verir.
        // a'nın yanında bir boşluk oldugu için +1 karakter olarak okudu ve kabul etmedi.
        char chr5 = ' '; // boslugu bir karakter olarak algıladıgı icin kabul eder.
       // char chr6 = "s"; ==> char ' kullanır. " kabul etmez.



        byte byt1 = 20;        // 8 bit   -128 - 127         ==> 20 sayısı için byte uygundur.
        short shr1 = 20;       // 16 bit  -32.768 - 32.767
        int sayi1 = 20;        // 32 bit  -2 mlyr - 2 mlyr
        long lng1 = 20;        // 64 bit   zibilyon biseyler


        int sayi2 = -1262325265; // 32 bit
        int sayi3 = -234567;     // 32 bit
        int sayi4 = 0;           // 32 bit
        int sayi5 = 45678910;    // 32 bit



        float fl1 = 4.6f;
        float fl2 = 5364.353563f;

        // float'a atanan değer ondalıklı degilse en sona f yazmaya gerek yok.
        float fl8 = 65; // tam sayı oldugu icin sonuna f yazmadan da kabul etti.



        double dbl1 = 34.3763;
        double dbl2 = 45;



        float fl3 = 20;
        float fl4 = 3;

        System.out.println( fl3 / fl4 );  // asıl sonucu 6,6666666666... dır.
                                          // float virgulden sonra 6 veya 7 basamak tutar.
                                          // devirlilerde son rakamını 1 eksik verir
                                          // okudugunda sonucu 6.6666665 verdi.


        double dbl3 = 20;
        double dbl4 = 3;

        System.out.println( dbl3 / dbl4 ); // asıl sonucu 6,6666666... dır
                                           // double virgülden sonra 15 veya 16 basamak tutar
                                           // devirlilerde son rakamı 1 fazla verir.
                                           // okudugunda sonucu 6.666666666666667 verdi.




        // Non-Primitive data türlerinde hazır metotlar vardır.

String str1 = " Java Candir ";

        /* hazır metotları kullanabilmek için str1. yazdıktan sonra
        cıkan hazır metotlardan gerekli olan biri seçilir ==> str1.toLowerCase()
        sonra en sonuna .sout yazdıklır ve okutulur ==>  System.out.println( str1.toLowerCase() );
         */

        System.out.println( str1.toLowerCase() ); // kucuk harfe cevirir ==> java candır

        System.out.println(str1.toUpperCase());   // buyuk harfe cevirir ==> JAVA CANDİR


        // Primitive data türlerinde hazır metotlar bulunmadıgından onlarda olmaz.

        int sayi9 = 30;
        // sayi9. yazdıgımızda hazır metotlar gelmez.





    }
}
