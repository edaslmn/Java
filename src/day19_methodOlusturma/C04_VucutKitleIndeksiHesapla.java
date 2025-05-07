package day19_methodOlusturma;

import java.util.Scanner;

public class C04_VucutKitleIndeksiHesapla {

    public static void main(String[] args) {

        System.out.println(vucudKitleEndeksiHesapla());

    }

    // soru 2- kullanıcıdan boy(cm) ve kilo(kg) isteyip
    //         vucut kitleindeksini hesaplayan ve sonucu donduren bir method olusturun.
    //         kilo*1000 / ( boy*boy)
        public static double vucudKitleEndeksiHesapla (){

            Scanner scanner = new Scanner(System.in);

            System.out.println("Lutfen Kg olarak kilonuzu giriniz");
            double kilo = scanner.nextDouble();

            System.out.println("Lutfen cm olarak boyunuzu giriniz");
            double boy = scanner.nextDouble();

            return kilo * 1000 / (boy * boy);
        }
}
