package PracticeLessons;

import java.util.Scanner;

public class P30_whileLoop {

    /*

          While döngü sayısı belli olmayan durumlarda kullanılır.
          döngü başlangıcı ya da bitişi belli olmayan durumlarda kullanılır.
          bir koşul belirlenip o koşulun durumuna göre hareket eder.
          Koşul hiç sağlanmazsa hiç çalışmaz.

     */


    // Kullanıcıdan bir kelime girmesini isteyip kelimenin içindeki
    // indexi çift sayi olan karakterleri yazdiran bir code create ediniz

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz: ");
        String kelime = scan.next(); // scan.next() kullanma sebebimiz
                                    // kullanıcının birden fazla kelime girmesi durumunda ilk kelimeyi alması
        int index = 0;

        // biz girilen kelimenin uzunluğunu (harf sayısını) kelime.length ile buluruz.
        // son harfin index numarı ise bu uzunluğun bir eksiğidir. çünkü index 0 ile başlar

        while (index <= kelime.length()-1){ // burada sart belirlenir.

            if(index % 2 == 0){

                System.out.println(index + ". index: " + kelime.charAt(index));

            }

            index++;

        }



    }

}
