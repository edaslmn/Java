package PracticeLessons;

import java.util.Scanner;

public class P34_whileLoop {

    // Girilen pozitif bir sayının tam kare olup olmadığını bulunuz,
    //         tamkare ise true  değilse false yazdırınız.

    //         Not: sqrt gibi fonksiyonları  kullanmayın.

    // Example 1:
    // Input: 16
    // Output: girilen sayı tamkare bir sayıdır.
    // Not: bu sayı tamkare çünkü 4*4 = 16
    // değilse girilen sayı tamkare bir sayı değilidir desin

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Kontrol etmek istediğiniz pozitif bir tamsayı giriniz: ");
        int girilenSayi = scan.nextInt();
        boolean tamKareMi =false;
        int i = 1;

        while (i*i<=girilenSayi){

            if (i*i==girilenSayi){
                tamKareMi = true;
                break;
            }
                i++;
        }

        if (tamKareMi){
            System.out.println("Girdiğiniz " + girilenSayi + " sayısı " + i + " sayısının tam karersidir." );
        } else {
            System.out.println("Girdiğiniz sayı bir tam kare sayısı değildir.");
        }



    }
}
