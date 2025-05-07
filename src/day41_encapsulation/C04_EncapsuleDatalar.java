package day41_encapsulation;

public class C04_EncapsuleDatalar {

    private int satisTutari ;
    // write ==> evet
    // read ==> hayır

    private int toplamSatisTutari ;
    // write ==> hayır
    // read ==> evet


    public int getToplamSatisTutari() {
        return toplamSatisTutari;
    }

    public void setSatisTutari(int satisTutari) {
        this.satisTutari = satisTutari;

        toplamSatisTutari += satisTutari;

    }
}
