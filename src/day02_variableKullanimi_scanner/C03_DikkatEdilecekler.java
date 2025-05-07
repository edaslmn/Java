package day02_variableKullanimi_scanner;

public class C03_DikkatEdilecekler {

    public static void main(String[] args) {

          /* 1) variable bir kere deklare edilir
        ama istedigimiz kadar yeniden deger ataması yapabiliriz.
     */
        int b = 20;
        // dersek tekrar int b = 30; yazdıgımızda okumaz
        // b zaten tanımlandı.

        // String b = "java candir"; bu ifadede de deger ataması yapılamaz.

        b = 25;
        b = b+10;
        b = 2*b-3;

        // b'ye ancak yukaridakiler gibi istenildiği kadar değer ataması yapılabilir.




        // 2) esitligin sol tarafında sadece variable olabilir.

        int sayi = 20; //yapılabilir.
        // ama 10 = int c; yapılamaz okumaz.

        sayi = sayi + 5; //yapılabilir
        // ama sayi+10 = sayi yapılamaz okumaz.




    /* 3) deger atamadan sadece deklarasyon yapılabilir.
    ancak deger atamadıgımız variable'i kullanamayız.
     */
        int yas; // bu sekilde deklare edilebilir ama kullanılamaz.

        // bizz bunu yazdıgımızda java adı "yas" olan bir variable olusturur. ama deger olmadıgı için java bilemez.
        // System.out.println( yas ); // Variable 'yas' might not have been initialized.
                                    // yani değer atanmadığı için okuyamam diyo.

        yas = 29;
        System.out.println( yas );
        System.out.println("47. satırda yas degeri: " + yas );






    }


}
