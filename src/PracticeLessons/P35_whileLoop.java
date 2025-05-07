package PracticeLessons;

import java.util.Scanner;

public class P35_whileLoop {

    // Bir top 220 m  yükseklikten atılmaktadır.
    // Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
    // Top zıplama  yüksekliği 25  santimetrenin altına indiğinde durmaktadır.
    // Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulunuz.

    public static void main(String[] args) {

        // double yukseklik = 220;
        Scanner scan = new Scanner(System.in);
        System.out.println("Topu bıraktığınız yüksekliği giriniz: ");
        double h = scan.nextDouble();

        int sayac = 0;
        int alinanYol = 0;
        double yukseklik = h;

        while (yukseklik >= 0.25){
            alinanYol += yukseklik;
            yukseklik *= 0.75;
            sayac++;

        }

        System.out.println(h + " yükseliğinden serbest bırakılan top " +sayac+ " kere zıplamış ve \n toplamda " +alinanYol+ "m yol almıştır ");








    }
}
