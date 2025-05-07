package day23_scope;

public class C04_HastaneRunner {
    public static void main(String[] args) {



        C03_Hastane pers1 = new C03_Hastane();

        System.out.println(pers1.persIsmi); // isim atanmadı
        System.out.println(pers1.persAdres); // adres atanmadı
        System.out.println(pers1.hastaneIsmi); // Yildiz
        System.out.println(pers1.bashekim); // Dr Eda

        pers1.persIsmi = "Fulya";
        pers1.persAdres = "Fulya / İstanbul";
        pers1.persTel = "63573636337";


        C03_Hastane pers2 = new C03_Hastane();

        pers2.persIsmi = "Sevda";
        pers2.persAdres = "Besiktas";
        pers2.persTel = "3763683883";

        pers2.bashekim = "Dr Merve";
        pers2.hastaneAdresi = "İstanbul";

        System.out.println(pers1.hastaneAdresi); // İstanbul
        System.out.println(pers1.persIsmi); // Fulya
        System.out.println(pers1.bashekim); // Dr Merve
        System.out.println(pers1.persAdres); // Fulya / İstanbul



    }


}
