import java.util.Stack;

public class EndowmentStore {
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

    public static void main(String[] args) throws Exception {
        Stack<EndowmentStore> storeStack = new Stack<>();

        // Tambahkan data ke stack
        storeStack.push(new EndowmentStore("bags", 2, 100000, 200000));
        storeStack.push(new EndowmentStore("hat", 1, 20000, 40000));
        storeStack.push(new EndowmentStore("shoes", 1, 150000, 150000));

        // Tampilkan semua data yang ada di stack (tanpa menghapus)
        System.out.println("Data di dalam Stack (urutan dimasukkan):");
        System.out.println("Item\tQty\tPrice\tSubtotal");
        System.out.println("===================================");
        for (EndowmentStore x : storeStack) {
            System.out.println(x.item + "\t" + x.qty + "\t" + x.price + "\t" + x.subtotal);
        }
        System.out.println("===================================");
        System.out.println("Total\t\t\t390000\n");

        // Tampilkan proses LIFO (menghapus item dari stack)
        System.out.println("Proses LIFO (pop dari stack):");
        System.out.println("-----------------------------------");
        while (!storeStack.isEmpty()) {
            EndowmentStore popped = storeStack.pop();
            System.out.println("Pop: " + popped.item + " (Qty: " + popped.qty + ", Price: " + popped.price + ")");
        }

        // Cek apakah stack sudah kosong
        System.out.println("-----------------------------------");
        System.out.println("Apakah stack kosong? " + storeStack.isEmpty());
    }
}
