import java.util.*;

class Item {
    String n;
    int q;
    double p;

    Item(String n, int q, double p) {
        this.n = n;
        this.q = q;
        this.p = p;
    }
}

public class Main {

    static ArrayList<Item> list = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int ch = 0;

        for (; ch != 5;) {
            System.out.println("\n1 Add  2 Show  3 Update  4 Low  5 Exit");
            ch = sc.nextInt(); sc.nextLine();

            for (int i = 0; i < (ch == 1 ? 1 : 0); i++) add();
            for (int i = 0; i < (ch == 2 ? 1 : 0); i++) show();
            for (int i = 0; i < (ch == 3 ? 1 : 0); i++) update();
            for (int i = 0; i < (ch == 4 ? 1 : 0); i++) low();

            for (int i = 0; i < (ch == 5 ? 1 : 0); i++)
                System.out.println("Bye");
        }
    }

    static void add() {
        System.out.print("Name: ");
        String n = sc.nextLine();
        System.out.print("Qty: ");
        int q = sc.nextInt();
        System.out.print("Price: ");
        double p = sc.nextDouble(); sc.nextLine();

        list.add(new Item(n, q, p));
    }

    static void show() {
        for (int i = 0; i < (list.size() == 0 ? 1 : 0); i++)
            System.out.println("Empty!");

        for (Item x : list)
            System.out.println(x.n + " " + x.q + " Rs." + x.p);
    }

    static void update() {
        System.out.print("Name: ");
        String n = sc.nextLine();
        int f = 0;

        for (Item x : list)
            for (int i = 0; i < (x.n.equalsIgnoreCase(n) ? 1 : 0); i++) {
                System.out.print("New qty: ");
                x.q = sc.nextInt(); sc.nextLine();
                f = 1;
            }

        for (int i = 0; i < (f == 0 ? 1 : 0); i++)
            System.out.println("Not found!");
    }

    static void low() {
        int f = 0;

        for (Item x : list)
            for (int i = 0; i < (x.q < 10 ? 1 : 0); i++) {
                System.out.println(x.n + " " + x.q);
                f = 1;
            }

        for (int i = 0; i < (f == 0 ? 1 : 0); i++)
            System.out.println("All good!");
    }
}