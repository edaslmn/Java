package day25_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C07_odev {

    // Kullanicidan deger alarak String bir array olusturun
    // String array'deki en uzun ve en kisa ismi yazdirin

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen array'in kac elemanli olacagini giriniz...");
        int elemanSayisi = scanner.nextInt();

        scanner.nextLine();

        String[] arr = new String[elemanSayisi];
        String enUzunKelime = "";
        String enKısaKelime = "";

        for (int i = 0; i < elemanSayisi ; i++) {

            System.out.println("Lütfen " + i + " index için bir metin giriniz: " );
            arr[i] = scanner.nextLine();

            enUzunKelime = arr[0];
            enKısaKelime = arr [0];


            if (arr[i].length() > enUzunKelime.length()){
                enUzunKelime = arr[i];
            }
            if (arr[i].length() < enKısaKelime.length()) {
                enKısaKelime = arr[i];

            }

        }




        System.out.println("en uzun kelime " + enUzunKelime);
        System.out.println("en kısa kelime " + enKısaKelime);
        System.out.println(Arrays.toString(arr));






    }
}