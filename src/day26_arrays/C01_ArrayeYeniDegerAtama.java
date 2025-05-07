package day26_arrays;

import java.util.Arrays;

public class C01_ArrayeYeniDegerAtama {
    public static void main(String[] args) {

        // oluşturulan bir array'in uzunluğu
        // sonra eleman ekleyerek ya da silinerek değiştirilemez.


        int[] sayilar = {3,4,5};

        // 4. eleman olarak 10 ekleyin
        // sayilar[3] = 10;



        // Ama array'e tamamen yeni bir değer ataması yapabiliriz.

        // var olan arraye yeni liste şeklinde atama yapılamaz.
        // ya önce arrayi başka bir isimle oluşturup sonra atama yapabilirsiniz.
        int[] yenArr = {5,6,7,8};
        sayilar = yenArr;
        System.out.println(Arrays.toString(sayilar));

        // ya da içinde default değerlerin olduğu array'i direkt sayılara atama yapabiliriz.
        sayilar = new int[6];

        System.out.println(Arrays.toString(sayilar));





    }
}
