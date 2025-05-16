package day04_dataCasting;

public class C02_ExplicitNarrowing {

    public static void main(String[] args) {

        int a = 13;
        int b = 4567;

       // byte c = a;
       // byte d = b;

        /*
        Java kodları compile ederken ( kodları gozden gecirip,
        bilgisayarin anlayacagi 1 ve 0'lara donusturur.)
        yani run tuşuna basmadan önce
        SADECE syntax ( yazım şekli ) ile ilgilenir.
        Degerlere bakmaz.

        Daha geniş kapsamlı data turundeki degeri
        daha dar kapsamlı data turundeki VARİABLE'a atamak isterseniz
        Java bu islemi OTOMATİK OLARAK yapmaz.

        Eger illa da yapalım derseniz
        Java sorumlulugu almanizi ister.
        ve ne yapar eder buyuk degeri kucuk kaba sigdirir.
         */

        byte c = (byte)a; // a'nın data turu int ama biz byte'a atamak istiyoruz.
        byte d = (byte)b;

        System.out.println("13'un byte variable'a atanmis hali:" +c );
        System.out.println("4567'un byte variable' atanmis hali:" + d);


        double dbl1 = 74.3;
        float fl1 = 57.98f;

        int sayi1 = (int)dbl1;
        int sayi2 = (int)fl1;

        System.out.println("74.3'un int variable'a atanmis hali:" + sayi1);
        System.out.println("57.98 'ın int variable'a atanmis hali:" + sayi2);










    }
}
