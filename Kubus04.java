import java.util.Scanner;
public class Kubus04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan sisi kubus: ");
        double sisi = sc.nextDouble();
        
        System.out.println("Volume Kubus: " + hitungVolume(sisi));
        System.out.println("Luas Permukaan Kubus: " + hitungLuasPermukaan(sisi));

    }

    public static double hitungVolume(double sisi) {
        double volume = sisi * sisi * sisi;
        return volume;
    }

    public static double hitungLuasPermukaan(double sisi) {
        double luasPermukaan = 6 * sisi * sisi;
        return luasPermukaan;
    }
}    