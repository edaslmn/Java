package day25_arrays;

public class C01_ArrayinElemanlariniToplama {
    public static void main(String[] args) {

        // verilen int bir array'in tüm elementlerini toplayıp
        // toplam değerini yazdırın.

        int[] sayilar = {3,5,7,1,2,4};
        int toplam = 0;

        for ( int i = 0; i < sayilar.length; i++ ){

            toplam += sayilar [i];
        }
        System.out.println("Array'deki elemanların toplami: " + toplam);

    }


        // verilen int bir array'in tüm elementlerini toplayıp
        // toplam değerini yazdıran bir method oluşturun.

    public static void elementToplaminiYazdir ( int[] arr){

        int toplam = 0;

        for ( int i = 0; i < arr.length; i++ ){

            toplam += arr [i];
        }
        System.out.println("Array'deki elemanların toplami: " + toplam);

    }


    // verilen int bir array'in tüm elementlerini toplayıp
    // toplam değerini döndüren bir method oluşturun.

    public static int getElementlerinToplami(int[]arr){

        int toplam = 0;

        for ( int i = 0; i < arr.length; i++ ){

            toplam += arr [i];
        }

        return toplam;
    }



}
