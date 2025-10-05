package m.algoritma2;
import java.util.Scanner;

public class findLargeNumber {
    public static void main(String[] args) {
    System.out.println(x:"Temukan angka terbesar");
    Scanner input = new Scanner(System.in);

    System.out.println(x: "Masukkan bilangan bulat a");
    int a = input.nextInt();
    System.out.println(x: "Masukkan bilangan bulat b");
    int b = input.nextInt();
    System.out.println(x: "Masukkan bilangan bulat c");
    int c = input.nextInt();

    int angka Terbesar;
    if(a>b && a>=c){
        angka Terbesar = a;
        System.out.println("Angka terbesar adalah a="+ angka Terbesar);
    }else if(b>=a && b>=c){
        angkaTerbesar = b;
        System.out.println("Angka terbesar adalah b="+ angka Terbesar);
    }else{
        angkaTerbesar = c;
        System.out.println("Angka terbesar adalah co" angkaTerbesar);
        input.close();
    }
}
}