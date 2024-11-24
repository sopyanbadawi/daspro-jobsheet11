import java.util.Scanner;

public class Kafe04 {
    
    static Scanner sc = new Scanner(System.in);
    
    public static void Menu(String namaPelanggan, boolean isMember) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");
        
        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }
        
        System.out.println("==== MENU RESTO KAFE ====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("=========================");
        System.out.println("Silahkan pilih menu yang Anda inginkan.");
    }
    
    public static int hitungTotalHarga04(int pilihanMenu, int banyakItem) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        return hargaItems[pilihanMenu - 1] * banyakItem;
    }
    
    public static double hitungDiskon(double totalHarga, String kodePromo) {
        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            System.out.println("Mendapatkan diskon 50%");
            return totalHarga * 0.5; 
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            System.out.println("Mendapatkan diskon 30%");
            return totalHarga * 0.3; 
        } else {
            System.out.println("Kode diskon invalid");
            return 0;   
        }
    }
    
    public static void main(String[] args) {
        int pilihanMenu, banyakItem;
        double totalSeluruh = 0;
        Menu("Andi", true);
        
        while (true) {
            System.out.print("\nMasukkan nomor menu yang ingin Anda Pesan: ");
            pilihanMenu = sc.nextInt();
            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            banyakItem = sc.nextInt();
            sc.nextLine();
            
            double totalHarga = hitungTotalHarga04(pilihanMenu, banyakItem);
            totalSeluruh += totalHarga; 

            System.out.print("Ada menu tambahan (Y/N): ");
            String konfirmasi = sc.nextLine();
            if (konfirmasi.equalsIgnoreCase("N")) {
                break; 
            }
        }
        
        System.out.print("Masukkan kode Promo untuk total pesanan Anda (atau tekan Enter jika tidak ada): ");
        String kodePromo = sc.nextLine();
    
        double diskon = hitungDiskon(totalSeluruh, kodePromo);
        double totalAkhir = totalSeluruh - diskon;

        System.out.println("======================================================");
        System.out.println("Total harga untuk semua pesanan Anda: Rp " + totalSeluruh);
        System.out.println("Total setelah diskon: Rp " + totalAkhir);
        System.out.println("======================================================");
    }
}