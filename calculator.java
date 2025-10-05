package com.algoritma2;
Amport java.util.Scanner;

public class CalorisCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kalkulator Kalori");

        System.out.println("Berapa lama berlari");
        Double lamaBerlari_menit = scanner.nextDouble();

        System.out.println("Berapa lama push up");
        Double lamaPushup_menit = scanner.nextDouble();

        System.out.println("Berapa lama plank");
        Double lamaPlank_menit = scanner.nextDouble();

        Double kaloriTerbakarBerlari = lamaßerlari_menit*(60/5);
        Double kaloriTerbakarPushup = lamaPushup_menit*(200/30);
        Double kaloriTerbakarPlank = lamaPlank_menit*(5/1);

        System.out.println("Hasil Kalkulator Kalori");
        System.out.printIn("kaloriTerbakarBerlari:%.2f" ,kaloriTerbakarßerlari);
        System.out.printIn("kaloriTerbakarPushup:%.2f" ,kaloriTerbakarPushup);
        System.out.printIn("kaloriTerbakarPlank: %.2f" ,kaloriTerbakarPlank);

        scanner.close();
    }
}