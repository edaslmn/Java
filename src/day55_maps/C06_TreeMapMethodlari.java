package day55_maps;

import java.util.Map;
import java.util.TreeMap;

public class C06_TreeMapMethodlari {
    public static void main(String[] args) {

        Map<String,Integer> harfler = new TreeMap<>();

        harfler.put("A",45);
        harfler.put("J",32);
        harfler.put("L",78);
        harfler.put("Z",12);
        harfler.put("B",66);
        harfler.put("G",24);

        // data türü Map seçildiği için harfler mapi tüm mapler ile aynı özellikleri taşır.
        // ama biz child clssların daha fazla ve daha güncel methodlara sahip olabileceğini biliyoruz.

        TreeMap<String,Integer> harfler1 = new TreeMap<>();

        harfler1.put("A",45);
        harfler1.put("J",32);
        harfler1.put("L",78);
        harfler1.put("Z",12);
        harfler1.put("B",66);
        harfler1.put("G",24);

        // eger data türünü de treemap seçersek
        // TreeMap lere özel pek çok methodun var olduğunu görürüz








    }
}
