package day55_maps;

import java.util.Map;
import java.util.TreeMap;

public class C04_MapMethodlari {
    public static void main(String[] args) {

        Map<String,Integer> harfler = new TreeMap<>();

        harfler.put("A",45);
        harfler.put("J",32);
        harfler.put("L",78);
        harfler.put("Z",12);
        harfler.put("B",66);
        harfler.put("G",24);

        System.out.println(harfler); // {A=45, B=66, G=24, J=32, L=78, Z=12}

        harfler.remove("A",45);
        System.out.println(harfler); //

        harfler.remove("J");
        System.out.println(harfler); //

        harfler.putIfAbsent("M",22);
        System.out.println();





    }
}
