package day27_multiDimensionalArrays;

import java.util.Arrays;

public class C01_MDA_Kullanma {
    public static void main(String[] args) {

        int[][] sayilar = {{3,5,4},{2,3,6,8},{2,4},{10},{3,9,0,2,7}};

        // sayilar array'inin kaç elemanı var?
        System.out.println(sayilar.length); // 5

        // sayilar array'indeki 9'u yazdırın.
        System.out.println(sayilar[4][1]); // 9

        // sayilar array'inin içindeki 2. indeks içindeki inner array'i yazdırın
        System.out.println(Arrays.toString(sayilar[2])); // [2, 4]

        // sayilar[3]'ün eleman sayısı kaçtır?
        System.out.println(sayilar[3].length); // 1

        // sayilar[3]'ü yazdırın
        System.out.println(Arrays.toString(sayilar[3])); // [10]

        // sayilar[3]'ün içindeki sayıyı yazdırın
        System.out.println(sayilar[3][0]); // 10

        // sayilar[1]'yi yazdırın
        System.out.println(Arrays.toString(sayilar[1])); // [2, 3, 6, 8]

        // sayilardaki eleman olan 8'i yazdırın
        System.out.println(sayilar[1][3]); // 8

        // tüm arrayi yazdırın
        System.out.println(Arrays.toString(sayilar)); // [[I@5f184fc6, [I@3feba861, [I@5b480cf9, [I@6f496d9f, [I@723279cf]


        // multiDimensional Arrays' leri yazdırmak için
        System.out.println(Arrays.deepToString(sayilar)); // [[3, 5, 4], [2, 3, 6, 8], [2, 4], [10], [3, 9, 0, 2, 7]]



    }
}
