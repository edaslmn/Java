package day02_variableKullanimi_scanner;

public class C02_VariableOlusturmaVeKullanma {

    public static void main(String[] args) {


        int sayi = 20;

        System.out.println("10. satırda sayi'nin degeri: " + sayi);
        // 10. satırda sayi'nin değeri: 20


        // sayi variable'ina yeni bir deger atayalim
        // int sayi = 30;
        /* bunu okuyamadı çünkü sayi variable'inin degeri zaten belirli.
        belirlenen deger dışında atanan degeri okumaz.
         */
        // başka bir değer atayabilmek icin başına int koymadan sadece "sayi = 30;" kullanmalıyız.

        sayi = 30;

        System.out.println("23. satırda sayi'nin degeri: " + sayi );

        /* java'da "=" assingment (atama) isaretidir.
        java "=" gordugunde once "="in sagına bakar.
        esittirin sagındaki islemi yapar.
        islem bittikten sonra bulunan degeri variable'a atama yapar.
         */
        sayi=sayi+5;

        System.out.println("32. satırda sayi'nin degeri: " + sayi );


        int a = 10;
        a = 2*a+1;
        System.out.println("37. satırda a'nin degeri: " + a );




    }


}
