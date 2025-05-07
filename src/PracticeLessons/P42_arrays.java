package PracticeLessons;

import java.util.Arrays;

public class P42_arrays {
    public static void main(String[] args) {


        /*
         * Parametre olarak dize kabul eden ve rakamların toplamını yazdıran bir yöntem yazın
         * verilen dizede mevcut girdi : “ade1r4d3” çıktı : 8 hile : Kullan -->
         * Character.isDigit() --> Integer.valueOf()
         */

        /*
         * Write a method which accepts string as parameter and prints the sum of digits
         * present in thr given string input :"ade1r4d3" output : 8 ;
         * trick : Use --> Character.isDigit() --> Integer.valueOf()
         */

        String kelime = "a4e8r64fg9b3c10";
        String arr[] = kelime.split("");
        System.out.println(Arrays.toString(arr));
        System.out.println("  ");
        int toplam = 0;
        for (int i = 0; i < arr.length; i++) {
            if (Character.isDigit(arr[i].charAt(0))) {
                toplam += Integer.valueOf(arr[i]);
            }
        }
        System.out.println("toplam = " + toplam);

    }
}