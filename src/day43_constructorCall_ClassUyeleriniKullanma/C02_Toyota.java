package day43_constructorCall_ClassUyeleriniKullanma;

public class C02_Toyota extends C01_Car{


    /*
        1-  child class'lar başlangıç itibariyle
            parent class'daki tüm özelliklere sahiptir

        2-  child class'lar
            parent class'daki özellikleri
            kendilerine uyarlayabilir.
            daha spesifik hala getirebilirler

        3-  child class paret class'da olmayan
            ama tüm child class objelerinde ortak olarak bulunan
            yeni özellikler ekleyebilir.

     */

    C02_Toyota(){
        System.out.println("Toyota constructor calıştı");
    }

    String marka = "Toyota";
    String motor = "Toyota Motor";

    String lastik = "Pirelli";
    String guvenlik = "TG1023";





}
