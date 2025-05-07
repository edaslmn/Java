package day20_whileLoop;

public class C01_forLoopVsWhileLoop {

    public static void main(String[] args) {

        // 2 basamaklı pozitif tamsayıları
        // büyükten kucuğe doğru
        // aralarında bir boşluk olacak sekilde yazdırın

        for (int i = 99; i >= 10; i--){
            System.out.print( i + " ");
        }
        System.out.println();


        // aynı görevi while loop ile yaparsak

        int sayı = 99;

        while ( sayı >= 10) {
            System.out.print( sayı + " ");
            sayı--;
        }
        System.out.println();

        // verilen pozitif tam sayıdan baslayarak
        // ilk 10 sayıyı yazdırın

        int verilenSayı = 23;





    }
}
