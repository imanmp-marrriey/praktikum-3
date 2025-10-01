public class ThrowThrowsDemo {
    public static void main(String[] args) {
        try {
            cekUmur(15); // coba ganti ke 20
        } catch (Exception e) {
            System.out.println("Terjadi error: " + e.getMessage());
        }
    }

    static void cekUmur(int umur) throws Exception {
        if (umur < 17) {
            throw new Exception("Umur belum cukup!");
        } else {
            System.out.println("Umur valid");
        }
    }
}
