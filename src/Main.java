import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        String metin = "elma armut elma kirz armut elma";

        // 1. Metni boşluklardan kelimelere böl
        String[] kelimeler = metin.split(" ");

        // 2. Sayacı tutacak Map
        Map<String, Integer> sayac = new HashMap<>();

        // 3. Her kelimeyi dolaş
        for (String kelime : kelimeler) {
            if (sayac.containsKey(kelime)) {
                // varsa: mevcut sayıyı al, 1 ekle, geri koy
                sayac.put(kelime, sayac.get(kelime) + 1);
            } else {
                // yoksa: ilk kez görüyoruz, 1 yaz
                sayac.put(kelime, 1);
            }
        }

        // 4. Sonucu yazdır
        for (Map.Entry<String, Integer> entry : sayac.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
