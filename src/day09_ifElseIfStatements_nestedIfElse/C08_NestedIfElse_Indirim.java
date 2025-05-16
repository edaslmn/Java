package day09_ifElseIfStatements_nestedIfElse;

import java.util.Scanner;

public class C08_NestedIfElse_Indirim {

    public static void main(String[] args) {

        // Kullanicidan aldigi urun adedini ve indirimsiz birim fiyatini alin,
        // kullaniciya musteri karti olup olmadigini sorun.
        // Musteri karti varsa 10 urunden fazla alirsa %20,
        //                        az alirsa %15 indirim yapin,
        // Musteri karti yoksa 10 urunden fazla alirsa %15,
        //                        az alirsa %10 indirim yapin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen aldiginiz urun adedini girin...");
        int adet = scanner.nextInt();

        System.out.println("Lutfen aldiginiz urunun birim fiyatini girin...");
        double birimFiyat = scanner.nextDouble();

        System.out.println("Musteri kartiniz var mi ?  E : Evet, H : Hayir");
        char kartVarMi = scanner.next().toUpperCase().charAt(0);

        double indirimsizToplamFiyat = adet * birimFiyat;

        // ana degisken kart var mi olsun

        if (kartVarMi == 'E'){
            // musteri karti olanlar bolgesi
            if (adet >= 10) System.out.println("%20 indirimli ödemeniz: " + indirimsizToplamFiyat*80/100 + " TL");
            else System.out.println("%15 indirimli ödemeniz: " + indirimsizToplamFiyat*85/100 + " TL");


        } else if ( kartVarMi == 'H') {
            // musteri karti olmayanlar bolgesi
            if (adet >= 10) System.out.println("%15 indirimli ödemeniz: " + indirimsizToplamFiyat*85/100 + " TL");
            else System.out.println("%10 indirimli ödemeniz: " + indirimsizToplamFiyat*90/100 + " TL");


        } else
            System.out.println("kart var mi sorusuna girilen deger HATALI...");




        // ODEV : ana degisken alinan urun miktari olsun



    }
}
