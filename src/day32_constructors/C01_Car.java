package day32_constructors;

public class C01_Car {

    int ilanNo;
    String marka = "marka atanmadı";
    String model= "model atanmadı";
    int yil = 1900;
    int fiyat;

    C01_Car(String mrk, String mdl, int yl, int fyt, int iNo){

        marka = mrk;
        model = mdl;
        yil = yl;
        fiyat = fyt;
        ilanNo = iNo;

    }
    /*
    biz görünür constructor olusturduğumuzda
    java default constructor'ı siler
    bu durumda daha önce
    default constructor ile olusturulan objeler CTE verir

    CTE vermesinin önüne geçmek için
    bir classta görünür bir constructor olusturduğumuzda
    default constructorın yerine parametresiz bir constructor da olustururuz
      */

    C01_Car(){

    }



    /*
        bir class olusturduğumuzda
        baska classlarda bu classtan obje olusturulduğunda
        objenin referansını değil
        TUM ÖZELLİKLERİNİ yazdırmasını isterseniz
        toString() metodunu classınıza uyarlamalısınız.
     */

    @Override
    public String toString() {
        return "Ozellikler ==> " +
                "ilanNo=" + ilanNo +
                ", marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", yil=" + yil +
                ", fiyat=" + fiyat;
    }
}
