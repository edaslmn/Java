package day32_constructors;

public class C02_CarRunner {
    public static void main(String[] args) {


        C01_Car car1 = new C01_Car();

        // car1'in tüm özelliklerini yazdırın
        // eger car classında toString methodu yoksa
        // car1 objesini direkt yazdırırsanız objenin özelliklerini değil
        // referansını yazdırır.
        // objenin ozelliklerini tek tek yazdırmak gerekir.

        System.out.println(car1); // C01_Car@3feba861
        System.out.println(car1.ilanNo);
        System.out.println(car1.marka);

        // eger car clasında toString methodu olusturulursa objeyi direktt yazdırdığınızda
        // secilen özelliklerini yazdırır.

        System.out.println("Car1 " + car1);


         car1.yil = 2010;
         car1.marka = "Volvo";
        System.out.println(car1);

        C01_Car car2 = new C01_Car();
        System.out.println("Car2 " + car2);
        // Car2 Ozellikler ==> ilanNo=0, marka='marka atanmadı', model='model atanmadı', yil=1900, fiyat=0
    }
}
