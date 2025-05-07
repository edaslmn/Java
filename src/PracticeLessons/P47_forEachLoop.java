package PracticeLessons;

import java.util.ArrayList;

public class P47_forEachLoop {
    public static void main(String[] args) {

        /*
        // Bir ArrayList oluşturun ve içine 3 adet meyve ekleyin.
        // Daha sonra bu meyveleri büyük harflerle ekrana yazdırın. (forEachLoop kullanın)

        // Örnek çıktı:
        // Meyveler: ELMA ARMUT ÇİLEK
         */

        ArrayList<String> meyveler = new ArrayList<>();
        meyveler.add("mangostan");
        meyveler.add("muz");
        meyveler.add("elma");
        meyveler.add("portakal");
        meyveler.add("üzüm");

        System.out.println(meyveler);

        for (String meyve:meyveler){
            System.out.print(meyve.toUpperCase() + " ");
        }
















    }
}
