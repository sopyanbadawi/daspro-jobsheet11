import java.util.Scanner;

public class KafeBuMariana04 {
    static String[] menu = {"Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan"};
    static int[][] dataPenjualan = new int[menu.length][7];
    static Scanner sc = new Scanner(System.in);

    public static void inputPenjualan() {
        for (int i = 0; i < menu.length; i++) {
            System.out.println("Masukkan penjualan untuk " + menu[i] + " (7 hari):");
            for (int j = 0; j < 7; j++) {
                System.out.print("Hari " + (j + 1) + ": ");
                dataPenjualan[i][j] = sc.nextInt();
            }
        }
        return;
    }

    public static void dataPenjualan() {
        System.out.println("\nData Penjualan Seluruh Menu:");
        for (int i = 0; i < menu.length; i++) {
            System.out.print(menu[i] + ": ");
            for (int j = 0; j < 7; j++) {
                System.out.print(dataPenjualan[i][j]);
                if (j < 6) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }

    public static void menuTertinggi() {
        int maxPembelian = 0;
        String maxMenu = "";
        int totalTerjual;
        for (int i = 0; i < menu.length; i++) {
            totalTerjual = 0;
            for (int j = 0; j < 7; j++) {
                totalTerjual += dataPenjualan[i][j];
            }
            if (totalTerjual > maxPembelian) {
                maxPembelian = totalTerjual;
                maxMenu = menu[i];
            }
        }
        System.out.println("\nMenu dengan penjualan tertinggi: " + maxMenu + " dengan total penjualan " + maxPembelian);
    }

    public static void avgPenjualan() {
        System.out.println("\nRata-rata Penjualan per Menu:");
        int totalTerjual;
        for (int i = 0; i < menu.length; i++) {
            totalTerjual = 0;
            for (int j = 0; j < 7; j++) {
                totalTerjual += dataPenjualan[i][j];
            }
            System.out.println(menu[i] + ": " + (double) totalTerjual / 7);
        }
    }

    public static void main(String[] args) {
        int choice;
        
        do {
            System.out.println("\n=== Kafe Bu Mariana ===");
            System.out.println("1. Input data penjualan");
            System.out.println("2. Tampilkan Semua Data Penjualan");
            System.out.println("3. Tampilkan menu dengan Penjualan tertinggi");
            System.out.println("4. Tampilkan rata-rata penjualan per Menu");
            System.out.println("5. Keluar");
            System.out.print("Pilih opsi (1-5): ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    inputPenjualan();
                    break;
                case 2:
                    dataPenjualan();
                    break;
                case 3:
                    menuTertinggi();
                    break;
                case 4:
                    avgPenjualan();
                    break;
                case 5:
                    System.out.println("Terima kasih! Sampai jumpa.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (choice != 5);
        
        sc.close();
    }
}