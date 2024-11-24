public class PengunjungCafe04 {

    public static void daftarPengunjung(Object... namaPengunjung) {
        System.out.println("Daftar Nama Pengunjung: ");
        //for (int i = 0; i < namaPengunjung.length; i++) {
        //    System.out.println("- " + namaPengunjung[i]);
        //}
        for (Object nama : namaPengunjung) {
            System.out.println("- " + nama);
        }
    }
    public static void main(String[] args) {
    daftarPengunjung("Ali", 25, "Budi", 30, "Citra", 26);

    }    
}