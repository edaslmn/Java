package day32_constructors;

public class C03_CarRunner {
    public static void main(String[] args) {

        C01_Car car1 = new C01_Car();
        System.out.println("Car1 " + car1);
        // Car1 Ozellikler ilanNo=0, marka='marka atanmadı', model='model atanmadı', yil=1900, fiyat=0

        // obje olustururken default constructor kullanılırsa
        // C01 calassındaki intance variable değerlerine sahip
        // bir obje olusturur

        // Car1 objesine ait özellikleri tek tek atayabiliriz
        car1.marka = "Toyota";
        car1.model = "Corolla";
        car1.yil = 2010;
        car1.fiyat = 5000;
        car1.ilanNo = 1001;

        System.out.println("car1 atanan " + car1);
        // car1 atanan Ozellikler ==> ilanNo=1001, marka='Toyota', model='Corolla', yil=2010, fiyat=5000

    /*
    olusturulan objenin
    istenen özzelliklere sahip olması için
    mutlaka atama yapılmalıdır.

    ANCAAAAK
    bu atamayı her obje için tek tek yapmak yerine
    argument olarak constructor'e yollayıp obje constructor'da olusturulurken
    atama işlemini de aradan çıkarabiliriz.
     */

        C01_Car car2 = new C01_Car("Mercedes", "E200", 2000, 3000, 1002);
        System.out.println("Car2 " + car2);
        // Car2 Ozellikler ==> ilanNo=1002, marka='Mercedes', model='E200', yil=2000, fiyat=3000


        C01_Car car3 = new C01_Car("0pel", "Corsa", 2015, 5000, 1003);
        System.out.println("Car3 "+ car3);
        // Car3 Ozellikler ==> ilanNo=1003, marka='0pel', model='Corsa', yil=2015, fiyat=5000
    }
}
