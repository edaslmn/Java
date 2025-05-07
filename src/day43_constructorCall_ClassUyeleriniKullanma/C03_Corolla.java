package day43_constructorCall_ClassUyeleriniKullanma;

public class C03_Corolla extends C02_Toyota {

    C03_Corolla(){
        System.out.println("Corolla constructor çalıştı");
    }

    String model = "Corolla";
    String sanzuman ="vvti";
    String lastik = "Pirelli Turkiye";


    String aku = "Inci";
    String renk = "Renk Belirtilmedi";
    String yakitTuru = "Yakit türü belirtilmedi";


    public static void main(String[] args) {

        C03_Corolla corollo1 = new C03_Corolla();
        System.out.println(corollo1.yakitTuru); // Yakıt türü belirtilmedi
        System.out.println(corollo1.renk); // Renk belirtilmedi
        System.out.println(corollo1.aku); // Inci
        System.out.println(corollo1.lastik); // Pirelli Turkiye
        System.out.println(corollo1.sanzuman); // vvti
        System.out.println(corollo1.model); //Corolla

        System.out.println(corollo1.guvenlik); // TG1023
        System.out.println(corollo1.motor); // Toyota motor
        System.out.println(corollo1.marka); // Toyota

        System.out.println(corollo1.kasa); // kasa secilmedi


    }





}
