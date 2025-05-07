package day43_constructorCall_ClassUyeleriniKullanma;

public class C08_Child extends C07_Parent{


    String str = "Child class";
    String t = "Hamza";
    String k = "Ahmet";

    public void method2(){
        System.out.println("Child method2");
    }
    public void method4(){
        System.out.println("Child method4");
    }

    public static void main(String[] args) {
        C08_Child obj = new C08_Child();
        obj.method1();
    }

    public void method1(){

        String str = "Child class method str";
        String t = "Cansu";
        String z = "Oguzhan";

        System.out.println(s); // Anıl
        System.out.println(str); // Child class method str

        // buradan class level'daki str'ı yazdırmak istersek
        System.out.println(this.str); // Child class

        // buradan parent class'daki str'ı yazdırmak istersek
        System.out.println(super.str); // Java candir






    }




}
