package PracticeLessons;

import java.util.Scanner;

public class P14_switchCase {

    public static void main(String[] args) {

        // Girilen 3 basamaklı bir sayıyı yazı ile yazdırınız.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen 3 basamaklı bir sayı giriniz: ");
        int sayı = scanner.nextInt();
        System.out.println("Girilen sayı: " + sayı);

        int birlerBasamagı = sayı % 10;
        int onlarBasamagı = (sayı / 10) % 10;
        int yuzlerBasamagı = sayı / 100;


        switch (yuzlerBasamagı){
            case 1 : System.out.print("yüz"); break;
            case 2 : System.out.print("ikiyüz"); break;
            case 3 : System.out.print("ücyüz"); break;
            case 4 : System.out.print("dortyüz"); break;
            case 5 : System.out.print("besyüz"); break;
            case 6 : System.out.print("altıyüz"); break;
            case 7 : System.out.print("yediyüz"); break;
            case 8 : System.out.print("sekizyüz"); break;
            case 9 : System.out.print("dokuzyüz"); break;
            default:
        }

        switch (onlarBasamagı){
            case 1 : System.out.print("on"); break;
            case 2 : System.out.print("yirmi"); break;
            case 3 : System.out.print("otuz"); break;
            case 4 : System.out.print("kırk"); break;
            case 5 : System.out.print("elli"); break;
            case 6 : System.out.print("altmıs"); break;
            case 7 : System.out.print("yetmis"); break;
            case 8 : System.out.print("seksen"); break;
            case 9 : System.out.print("doksan"); break;
            default:

        }

        switch (birlerBasamagı){
            case 0 : System.out.println(""); break;
            case 1 : System.out.print("bir"); break;
            case 2 : System.out.print("iki"); break;
            case 3 : System.out.print("üc"); break;
            case 4 : System.out.print("dort"); break;
            case 5 : System.out.print("bes"); break;
            case 6 : System.out.print("altı"); break;
            case 7 : System.out.print("yedi"); break;
            case 8 : System.out.print("sekiz"); break;
            case 9 : System.out.print("dokuz"); break;
            default:

        }

    }
}
