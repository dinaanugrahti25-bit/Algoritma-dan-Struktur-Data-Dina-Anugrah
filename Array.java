import java.util.ArrayList;
import java.util.Collections;

Public class EndowmentStore {
    String item;
    int qty;
    int price;
    int subtotal;

    public EndowmentStore(String a, int b, int c, int d) {
        this.item = a;
        this.qty = b;
        this.price = c;
        this.subtotal = d;
    }
    Public static void main(String[] args) throws Exception {
        ArrayList<EndowmentStore>Students = new ArrayList<EndowmentStore>();

        Students.add(new EndowmentStore("Bagpack", 2, 200000, 300000));
        Students.add(new EndowmentStore("Hoodie", 1, 300000, 400000, 50000));
        System.out.println("Item\tQty\tPrice\tSubtotal");
        System.out.println("-----------------------------------------");
        for (EndowmentStore x: Students) {
            System.out.println(x.item+"\t" + x.qty + "\t" + x.price + "\t" + x.subtotal);
        }
        System.out.println("-----------------------------------------");
        System.out.println("Total\t\t450000");
    }
}