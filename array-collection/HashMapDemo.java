import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> nilai = new HashMap<>();
        nilai.put("Ani", 85);
        nilai.put("Bambang", 90);

        System.out.println("Nilai Ani: " + nilai.get("Ani"));
    }
}
