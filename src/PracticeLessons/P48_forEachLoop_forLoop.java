package PracticeLessons;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class P48_forEachLoop_forLoop {
    public static void main(String[] args) {

        // Kullanıcıdan 5 adet not alarak bir ArrayList oluşturun.
        // Bu notların ortalamasını (GANO) hesaplayarak ekrana yazdırın.

        // Örnek çıktı:
        // Notların ortalaması: 78.5

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 5 adet not giriniz");

        double notTop = 0;
       ArrayList<Integer> notlar = new ArrayList<>();

        for (int i = 0 ; i < 5; i++) {
            System.out.print(i+1+"." + " notu giriniz: ");
            int not = scan.nextInt();
            notlar.add(not);
            notTop += not;
        }

        System.out.println("Girilen notlar: " + notlar);
        System.out.println("Girilen notların ortalaması: " + notTop/5);




    }
}
