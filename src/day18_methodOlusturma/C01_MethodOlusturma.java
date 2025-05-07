package day18_methodOlusturma;

public class C01_MethodOlusturma {
    public static void main(String[] args) {

        // verilen 2 sayıdan büyük olmayanı yazdıran bir method oluşturun.

        int sayi1=23;
        int sayi2=40;

        // Bu işlemi aşağıda olusturdugumuz method ile yapabiliriz
        // işlemi yapabilmek için methodu çağırmamız gerekecek.

        buyukOlmayaniYazdir(40, 50 );
        buyukOlmayaniYazdir( sayi1, sayi2 );

    }

   public static void buyukOlmayaniYazdir ( int a , int b) {

       System.out.println( a > b ? b: a );
    }

}
