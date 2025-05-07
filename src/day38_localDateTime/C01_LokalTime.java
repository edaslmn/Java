package day38_localDateTime;

import java.time.LocalTime;

public class C01_LokalTime {
    public static void main(String[] args) {

        LocalTime yerelSaat = LocalTime.now();

        /*
        LocalTime Class'ındaki now() method'u
        calıştığı bilgisayardaki zamani alıp kodun çaliştiği satıra getirir

        ANCAAAK bu method calıştığı andaki değeri bize getirir
        bir kronometre gibi zamanı tutmaya devam etmez.

        yerel saat değeri yeni bir atama olmadıkça değişmez.
         */

        System.out.println("loop'dan once yerel saat : " + yerelSaat); // 19:48:48.559684   19:49:04.903377

        // asagidaki islemin kac saniyede bitirildigini yazdirin

        LocalTime baslangicSaati = LocalTime.now();
        System.out.println("loop'dan once baslangicSaati : " + baslangicSaati);

        String str = "";

        for (int i = 0; i <200000 ; i++) {
            str+=i;
        }

        LocalTime bitisSaati = LocalTime.now();
        System.out.println("loop'dan sonra yerel saat : " + yerelSaat);
        System.out.println("loop'dan sonra bitisSaati : " + bitisSaati);
    }
}
