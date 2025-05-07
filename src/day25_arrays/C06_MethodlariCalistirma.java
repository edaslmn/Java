package day25_arrays;

import day19_methodOlusturma.C02_FaktoryelDegeriDondurme;
import day24_arrays.C02_ArraydekiElemanlarıKullanma;

public class C06_MethodlariCalistirma {
    public static void main(String[] args) {

        int[] sayilar = {1, 2, 3, 4, 5, 6, 7, 8,16};

        // sayilar array'indeki tum elementlerin toplmını yazdırın.

        C01_ArrayinElemanlariniToplama.elementToplaminiYazdir(sayilar);

        // sayilar array'indeki tüm elementleri toplayın.
        // eger toplam cift sayı ise "Ne güzel array"
        // toplam tek ise "Bu array'i begenmedim" yazdirin.

        // element toplamini yazdir methodu void olduğundan
        // toplam değerini karşılaştıramayız.

        // int sonuc = C01_ArrayinElemanlariniToplama.elementToplaminiYazdir(sayilar); ==> çalıştırmıyor.

        int toplamSonucu = C01_ArrayinElemanlariniToplama.getElementlerinToplami(sayilar);

        if (toplamSonucu % 2 == 0) {
            System.out.println("Ne guzel array");
        } else {
            System.out.println("Bu array'i beğenmedim");
        }

        // verilen int bir değerdeki en buyuk sayıyı bulun
        // sayı 15 ten küçük pozitif bir tam sayı ise faktoriyel değerini yazdırın
        // sayi 15 ten büyükse en büyük sayıyı yazdırın.

        int enBuyukEleman = C02_EnBuyulElemaniBulma.getEnBuyukEleman(sayilar);

        if (enBuyukEleman < 15 && enBuyukEleman >0) {
            System.out.println(enBuyukEleman + " sayısının faktoriyel değeri: " + C02_FaktoryelDegeriDondurme.faktoryelDegeri(enBuyukEleman));

        } else {
            System.out.println("En büyük sayi: " + C02_EnBuyulElemaniBulma.getEnBuyukEleman(sayilar));
        }

    }
}