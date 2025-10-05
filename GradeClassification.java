Public class GradeClassification {

    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printIn(x:"Masukan Nilai");
        Double nilai = scanner.nextDouble();

        if (nilai >= 80 && nilai <= 100) {
            System.out.printIn(x:"A");
        }else if(nilai >= 70 && nilai <= 80) {
            System.out.printIn(x:"B");
        }else if(nilai >= 60 && nilai <= 70) {
            System.out.printIn(x='C')
        }else if(nilai >= 50 && nilai <= 60) {
            System.out.printIn(x='D')
        }else if(nilai >= 0 && nilai <= 50) {
            System.out.printIn(x='F')
        }else{
            System.out.printIn(x:"Nilai yang dimasukan tidak valid");
        }
        scanner.close();
    }
}