package day13_stringManipulation;

import java.util.Scanner;

public class C03_soru {

    public static void main(String[] args) {

        // Kullanicidan bir cumle ve cumlede aratilacak bir metin isteyin
        // girilen cumle ve metin'e gore asagidaki 3 sonucdan uygun olani yazdirin
        // 1- cumle aranan metni icermiyor
        // 2- cumle aranan metni sadece 1 adet iceriyor
        // 3- cumle aranan metni 1'den fazla iceriyor

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz...");
        String cumle = scanner.nextLine();


        System.out.println("Cumlede aranacak metni giriniz...");
        String metin = scanner.nextLine();

        int metinIlkIndex= cumle.indexOf(metin);
        int metinIkinciIndex = cumle.indexOf(metin, metinIlkIndex+1);

        if ( metinIlkIndex == -1  ){
            System.out.println("Aradiginiz metin cumlede yok");
        } else if ( metinIkinciIndex == -1   ) { // metinIlkIndex != -1 &&
            System.out.println("Aradiginiz metin cumlede sadece 1 kere geciyor");
        } else {
            System.out.println("Aradiginiz metin cumlede 1'den fazla kere kullanilmis");
        }

    }
}
