package day47_abstraction_abstractClass;

public abstract class C05_KuralciArabaClass {

    // araba class'ini inherit edecek child class'lar
    // (Yanii yeni araba uretecek markalar icin)
    // arabalarin MUTLAKA BULUNDURMASI gereken ozellikleri
    // bu class'da belirleyebiliriz

    public abstract void motor();
    public abstract void teker();
    public abstract void aku();


    // arabalarin bulundurmasi zorunlu olmayan
    // yani arabalarin tercihine birakilan ozellikleri
    // concrete method olarak olusturabiliriz

    public void klima(){

    }

    public void sunroof(){


    }

}
