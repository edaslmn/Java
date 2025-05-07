package day55_maps;

import java.util.Map;
import java.util.TreeMap;

public class C05_ComputeMethodlari {
    public static void main(String[] args) {

        Map<String,Integer> harfler = new TreeMap<>();

        harfler.put("A",45);
        harfler.put("J",32);
        harfler.put("L",78);
        harfler.put("Z",12);
        harfler.put("B",66);
        harfler.put("G",24);

        System.out.println(harfler); // {A=45, B=66, G=24, J=32, L=78, Z=12}

        // A nın değerini 2 katına çıkarın
        harfler.replace("A", 2*harfler.get("A"));
        System.out.println(harfler);

        // K nın değerini 2 katına çıkarın

        if (harfler.containsKey("K")){
            harfler.replace("K",2* harfler.get("K"));
        }
        System.out.println(harfler);

        // eger map'de L yoksa değeri 60 olacak şekilde ekleyin

       // harfler.putIfAbsent("L",60);

        if (!harfler.containsKey("L")){
            harfler.put("L",60);
        }
        System.out.println(harfler);

        // G nin değerini 10 artırın
        // görevde söylememiş

        if (harfler.containsKey("G")){

            harfler.replace("G",harfler.get("G")+10);
        }
        System.out.println(harfler); //

        // G nin değerini 10 artırın
        harfler.computeIfPresent("G", (k,v) -> v+10);
        System.out.println(harfler); // {A=90, B=66, G=44, J=32, L=78, Z=12}

        // H varsa değerini 5 azaltın
        harfler.computeIfPresent("H",(k,v) -> v-5);
        System.out.println(harfler); // işlem yapmıcak H yok

        // K yoksa değerini 10 artır

        // 1. yöntem
        //harfler.putIfAbsent("K",10);

        harfler.computeIfAbsent("K", v -> 10);
        System.out.println(harfler); // {A=90, B=66, G=44, J=32, K=10, L=78, Z=12}

        // A nın değerini 2 katının 4 fazlası yapın

        // risk almamak için A nın varlığını kontrol etmek daha iyi olacaktır ==> computeIfPresent
        harfler.computeIfPresent("A", (k,v) -> (v*2)+4);
        System.out.println(harfler);

        // ama bu şekilde de yapılabilir ==> compute
        harfler.compute("A", (k,v) -> (v*2)+4);
        System.out.println(harfler);

















    }
}
