public class Main {
    public static void main(String[] args) {
        Fila<String> f = new Fila<>();
        f.enqueue("primeiro");
        f.enqueue("segundo");
        System.out.println(f);
        //f.dequeue();
        System.out.println(f.first());
    }
}
