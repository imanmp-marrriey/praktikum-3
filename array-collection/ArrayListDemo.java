import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> daftar = new ArrayList<>();
        daftar.add("Ani");
        daftar.add("Bambang");
        daftar.add("Sinta");

        System.out.println("Nama pertama: " + daftar.get(0));
    }
}
