package PracticeLessons;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P45_arrayList {
    public static void main(String[] args) {

    // Bir öğretmenden girmek istediği kadar notu alınız, ve
    // ortalamayı geçen öğrenci sayısını bulunuz.

        List<Integer> nots = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Not girmek için e tuşuna başınız");

        char devam = scan.next().toUpperCase().charAt(0);

        while (devam == 'E'){
            System.out.println("Not girişi: ");

            nots.add(scan.nextInt());
            System.out.print("tekrar yeni bir not girecek misiniz? E/H: ");
            devam = scan.next().toUpperCase().charAt(0);
        }
        System.out.println("Sisteme girilen notlar: " + nots);
        double ort = 0;
        int toplam = 0;

        for (Integer each:nots){
            toplam += each;
        }

        ort = toplam / nots.size();
        System.out.println("Girilen notların ortalaması: " + ort);

        List<Double> ortalamaUstu = new ArrayList<>();
        for (double each2:nots){ // wrapper class değil variable olarak tanımladım.
            if (each2>ort){
                ortalamaUstu.add(each2);
            }
        }

        System.out.println("ortalama üstündeki öğrenci sayısı " + ortalamaUstu.size());





    }
}
