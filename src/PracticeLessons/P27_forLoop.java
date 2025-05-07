package PracticeLessons;

import java.util.Scanner;

public class P27_forLoop {
    public static void main(String[] args) {

        // Kullanıcıdan 5 adet sayı isteyiniz
        // Bu sayılardan 5 ile 10 arasındakiler hariç, diğerlerinin toplamını bulunuz.
        // bu soruyu continue kullanarak çözünüz.

        Scanner scanner =new Scanner(System.in);
        System.out.println("Lütfen 5 adet pozitif sayı giriniz.");
        int toplam = 0;
        int s1 = 0;

        for (int i = 1; i <= 5 ; i++) {
            System.out.println(i + ". sayı: ");
            s1 = scanner.nextInt();

            if (s1 >= 5 && s1 <=10){
                continue;
            }
            toplam += s1;
        }
        System.out.println("girilen sayıların toplamı: " + toplam);





    }
}
