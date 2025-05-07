package day25_arrays;
public class C02_EnBuyulElemaniBulma {
    public static void main(String[] args) {

        /*
         eger verilen görevi yapmak için tüm elementleri
         gözden geçirmemiz gerekiyorsa for loop kullanırız.
         */

        // verilen bir int array'daki en buyuk elemanı yazdırın

        int[] sayilar = {-2,-5,-7,-11,-4};

        int enBuyukElaman = sayilar[0];

        for (int i = 0; i < sayilar.length; i++) {

            if (sayilar[i] > enBuyukElaman) {
                enBuyukElaman = sayilar[i] ;
            }
        }
        System.out.println("Array'deki en buyuk eleman: " + enBuyukElaman);

    }

    // verilen bir int array'daki en buyuk elemanı döndüren bir method oluşturun.

    public static int getEnBuyukEleman (int[] arr){

        int enBuyukElaman = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > enBuyukElaman) {
                enBuyukElaman = arr[i] ;
            }
        }
        return enBuyukElaman;
    }

}
