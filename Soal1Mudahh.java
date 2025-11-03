package LatihanUKL2025;

import java.util.Scanner;

public class Soal1Mudahh {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        // Input data dari pengguna
        System.out.println("Masukkan berat paket (kg): ");
        double berat = input.nextDouble();

        System.out.println("Masukkan jarak tempuh (km): ");
        double jarak = input.nextDouble();

        System.out.println("Masukkan panjang paket (cm): ");
        double panjang = input.nextDouble();
        
        System.out.println("Masukkan lebar paket (cm): ");
        double lebar = input.nextDouble();

        System.out.println("Masukkan tinggi paket (cm): ");
        double tinggi = input.nextDouble();

        // Hitung volume
        double volume = panjang * lebar * tinggi;

        // Tentukan biaya berdasarkan jarak
        double biayaPerKg;
        if (jarak <= 10) {
            biayaPerKg = 4250;
        } else {
            biayaPerKg = 6000;
        }

        // Hitung biaya pengiriman berdasarkan berat
        double biayaTotal = berat * biayaPerKg;

        // Tambahkan biaya tambahan jika volume > 100 cm^3
        if (volume > 100) {
            biayaTotal += 50000;
        }
        
        //Tampilkan hasil 
        System.out.println("===RINCIAN BIAYA PENGIRIMAN ===");
        System.out.println("Berat paket : "+ berat + " kg");
        System.out.println("Jarak tempuh : "+ jarak + " km");
        System.out.println("Volume paket : "+ volume + " cm^3");
        System.out.println("Total biaya pengiriman : Rp " + biayaTotal);
        input.close();

    

        }

    }

