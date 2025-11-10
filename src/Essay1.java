input java.text.DecimalFormat;

public class Salary {
    public static void main(String[] args) {
        // Data input
        double basicSalary = 7500000; // Gaji pokok per bulan
        int overtimeHour = 6; // Total jam lembur
        // Step 1 - Hitung tarif per jam
        double hourlyRate = basicSalary / 173; // Rumus  1/173 x gaji pokok

        // Step 2 - Hitung total uang lembur
        double firstHoursPay = 1 * 1,5 * hourlyRate; // 1 jam pertama = 1.5 kali
        double nextHoursPay = 5 * 2 * hourlyRate;   // 5 jam berikutnya = 2 kali
        double totalOvertimePay = firstHoursPay + nextHoursPay;
        
        // Step 3 - Hitung total gaji bulanan
        double totalSalary = basicSalary + totalOvertimePay;

        //Format angka agar lebih rapih
        DecimalFormat df = new DecimalFormat("#,###");

        //Output hasil
        System.out.println("===== Salary Calculating Result =====");
        System.out.println("Monthly Basic")
    }
}