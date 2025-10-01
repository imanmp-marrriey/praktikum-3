import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        try {
            System.out.print("Masukkan angka pembagi: ");
            int pembagi = input.nextInt();
            int hasil = 100 / pembagi;
            System.out.println("Hasil = " + hasil);
        } catch (ArithmeticException e) {
            System.out.println("Error: tidak bisa bagi nol");
        } finally {
            System.out.println("Selesai dijalankan");
        }
        
        input.close();
    }
}
