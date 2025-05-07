package day50_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C06_CheckedException {
    public static void main(String[] args) throws FileNotFoundException {

        /*
            Checked Exception kodu yazarken
            Java'nın kontrol edip, farkına varabildiği exception türleridir.

            Java yazdığımız kodlar içerisinde
            compile time'da bir exception riski görürse
            altını kırmızı çizer ve bizden çözüm bekler

            çözüm iki türlü olabilir

            1-  try catch kullanarak
                exception'ı handle edebilir
                ve exception oluştuğunda NORMAL çalışmaya
                devam etmesini sağlayabilirsiniz.

            2-  EĞER exception'ı kontrol altına almak istemiyorsanız
                sadece kodun çalışır hale gelmesi için
                kırmızı çizgiyi kaldırmak istiyorsanız
                Java'ya sorumluluğu aldığınızı beyan etmelisiniz.

                Bunun için method signature'ına muhtemel exception class ismini yazmalısınız


                Signature'a "throws FileNotFoundException" yazmak
                "Bu method'da FileNotFoundException oluşma riski var" demektir

                Signature'a bunu eklemenin 2 faydası var
                - Java'ya sorumluluğu aldığımızı söyleriz
                - bu class'ı sonradan kullanacak kişiler
                  veya parent edinecek class'lar bu riskin farkına varmış olur

         */

        // String str = 45; // CTE Required type: String    Provided: int

        String dosyaYolu = "src/day50_exceptions/deneme.txt";

        FileInputStream fileInputStream = new FileInputStream(dosyaYolu);
        // Unhandled exception: java.io.FileNotFoundException


    }
}
