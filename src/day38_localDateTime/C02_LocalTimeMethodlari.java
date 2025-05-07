package day38_localDateTime;

import java.time.LocalTime;
import java.time.ZoneId;

public class C02_LocalTimeMethodlari {
    public static void main(String[] args) {

        LocalTime yerelSaat = LocalTime.now(); // calıştığı sistemdeki zamani getirir
        System.out.println("yerel zaman: " + yerelSaat); // 21:13:48.008214

        LocalTime yerelSaatJaponya = LocalTime.now(ZoneId.of("Japan"));
        System.out.println("Japonya saati: " + yerelSaatJaponya); // 03:13:48.010213

        LocalTime yerelSaatNewyork = LocalTime.now(ZoneId.of("America/New_York"));
        System.out.println("Newyork saati: " + yerelSaatNewyork); // 14:19:41.492693600

        LocalTime yerelSaatTurkiye = LocalTime.now(ZoneId.of("Europe/Istanbul"));
        System.out.println("Türkiye saati: " + yerelSaatTurkiye); // 21:19:41.497689400


        // get.....() method'lari
        // saatin istenen bolumunu getirir
        System.out.println(yerelSaat.getHour()); // 21
        System.out.println(yerelSaat.getMinute()); // 19


        // with...() method'ları
        // saatin istenen bolumunu verilen deger olarak degistirir
        System.out.println(yerelSaat.withMinute(0)); // 21:00:36.140585600
        System.out.println(yerelSaat.withSecond(0).withNano(0)); // 21:22


        // plus..() ve minus...() method'ları
        // zamanda istenen kadar ileri veya geri götürür.

        System.out.println(yerelSaat.plusHours(100).plusMinutes(12)); // 01:37:28.494848900
        System.out.println(yerelSaat.minusMinutes(12500)); // 05:05:28.494848900


        System.out.println(yerelSaatTurkiye.isBefore(yerelSaatNewyork)); // false
        System.out.println(yerelSaatTurkiye.isAfter(yerelSaatNewyork)); // true


    }
}
