package day15_for_Loop;

import java.util.Scanner;

public class C06_FaktoriyelHesabı {

    public static void main(String[] args) {

        // Kullanicidan 17’den kucuk bir pozitif tamsayi alip,
        // bu sayinin faktoryel degerini hesaplayin.
        //	Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 17'den kucuk pozitif bir tamsayi giriniz...");
        int girilenSayi = scanner.nextInt();

        int faktoryel = 1 ;

        for (int i = girilenSayi; i >=1 ; i--) {

            faktoryel *= i;

        }

        System.out.println(faktoryel);
    }
}
