package day42_Inheritance;

public class C06_Child extends C05_Parent{

    int childInt = 67;
    String childString = "Java bir tane";

    public static void main(String[] args) {

    /*
        Chile class'da oluşturulan bir obje
        OTOMATİK olarak Parent class'daki TÜM ÖZELLİKLERE sahip olur.

        Bir obje'ye class'daki intance variable'lar
        ve değerlerinin bir kopyasınıb alıp yapıştırma görevi
        Constructor'dadir.

        Yani child class'daki objenin
        Parent class'daki özelliklere sahip olması için
        Child class constructor'ı ile birlikte
        Parent class constructor'ı da ÇALIŞMALIDIR.

        Bunu için Java
        extends keyword kullanan class'lardaki
        her constructor'ın ilk satırına
        gizli bir super() constructor call koymuştur


     */

        C06_Child child1 = new C06_Child();

        System.out.println(child1.childInt);
        System.out.println(child1.childString);
        System.out.println(child1.parentInt);
        System.out.println(child1.parentStr);




    }





}
