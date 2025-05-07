package PracticeLessons;

public class P26_forLoop {
    public static void main(String[] args) {

        // 0'dan 1000'e kadar (dahil)
        // 13' e tam bölünebilen sayıları ve toplamlarını yazdırın

        int toplam = 0;

        for (int i = 1000; i >= 0 ; i--) {

            if ( i % 13 == 0){
                System.out.print(i+" ");
                toplam += i;
            }
        }
        System.out.println();

        System.out.println("13'e bölünebilen sayıların toplamı: " + toplam);




    }
}
