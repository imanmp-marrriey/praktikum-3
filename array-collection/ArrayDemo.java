public class ArrayDemo {
    public static void main(String[] args) {
        // cara 1: langsung isi
        String[] nama = {"Andi", "Budi", "Citra"};
        System.out.println("Mahasiswa 1: " + nama[0]);

        // cara 2: buat array kosong dulu
        int[] nilai = new int[3];
        nilai[0] = 80;
        nilai[1] = 75;
        nilai[2] = 90;
        System.out.println("Nilai ke-3: " + nilai[2]);
    }
}
