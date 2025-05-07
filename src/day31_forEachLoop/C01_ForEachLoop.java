package day31_forEachLoop;

public class C01_ForEachLoop {
    public static void main(String[] args) {

        int[] arr = {3,5,7,1,2,5,8,1};

        // arr'deki tum elemanların toplamını yazdırın

        int toplam = 0;

        for (int i = 0; i < arr.length; i++) {

            toplam += arr[i];

        }
        System.out.println("ForLoop ile  elemanların toplamı: " + toplam); // 32


        // for each loop "bana arr'deki tum int'leri getir" mantığıyla çalısır.

        toplam = 0;

        for ( int each : arr) {
            toplam += each;
        }
        System.out.println("For-Each Loop ile elemanların toplamı: " + toplam); // 32

        // arr'deki tüm elemanları yanyana yazdırın

        for ( int each : arr){
            System.out.print(each + " "); // 3 5 7 1 2 5 8 1
        }


    }
}
