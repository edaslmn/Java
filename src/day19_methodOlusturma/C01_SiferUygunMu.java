package day19_methodOlusturma;

public class C01_SiferUygunMu {

    //Soru 4 : verilen bir sifre icin
    //         asagidaki sartlari kontrol eden
    //         ve sifre uygun ise true degilse false donduren
    //         bir method olusturun.
    //         - ilk harf kucuk harf olmali
    //         - son karakter rakam olmali
    //         - sifre bosluk icermemeli
    //         - uzunlugu en az 10 karakter olmali

    public static void main(String[] args) {

        sifreUygunMu( "sanane");
        // 16. satır sifreUygunMu metodunu calıstırır
        // method calışır, verilen "naber?" sifresenin uygun olup olmadıgını inceler.
        // true veya false döndürür.
        // sonucu method sout içinde çağrıldığı için konsolda görürüz.
        // ama bir değere atamadığımız için kodun devamında kullanamayız


        System.out.println(sifreUygunMu("naber?"));
        // 24. satır sifreUygunMu metodunu calıstırır
        // method calışır, verilen "sanane" sifresenin uygun olup olmadıgını inceler.
        // true veya false döndürür.
        // ama sout yapmadığımız için konsolda göremeyiz.
        // bir değere atamadığımız için kodun devamını kullanamayız


        boolean sonuc = sifreUygunMu("cennetBahcesi11");
        // 32. satır sifreUygunMu metodunu calıstırır
        // method calışır, verilen "cennetBahcesi11" sifresenin uygun olup olmadıgını inceler.
        // true veya false döndürür.
        // sonucu sout yapmadığımız için konsolda göremeyiz.
        // ama bir değere atadığımız için kodun devamında ister ayzdırır,
        // ister farklı amaçlar için kullanabiliriz.

        System.out.println( "cennetBahcesi11 için inceleme sonucu: " + sonuc);

    }

    public static boolean sifreUygunMu(String sifre) {

        int flag = 10;

        //         - ilk harf kucuk harf olmali
        char ilkHarf = sifre.charAt(0);

        if (!Character.isLowerCase(ilkHarf)) {
            flag = 11;
        }

        //         - son karakter rakam olmali
        char sonKarakter = sifre.charAt(sifre.length() - 1);

        if (sonKarakter < '0' || sonKarakter > '9') {
            flag = 11;
        }

        //         - sifre bosluk icermemeli
        if (sifre.contains(" ")) {
            flag = 11;
        }

        //         - uzunlugu en az 10 karakter olmali
        if (!(sifre.length() >= 10)) {
            flag = 11;
        }

        /*
            Sona gelindiginde, flag 10 veya 11 degerini alabilir
            flag == 10 ==> hic bir hata mesaji yazdirilmadi demektir
            flag == 11 ==> hata mesaji yazdirildi, ama kac mesaj yazdirildigini bilemeyiz
         */


        // return type void disinda bir data turu secilmis ise
        // method'un sonunda secilen data turune uygun BIR DEGER return edilmelidir
        if ( flag == 10){
            return true;
        } else {
            return false;
        }
    }

}

