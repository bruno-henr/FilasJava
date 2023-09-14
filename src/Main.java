public class Main {
    public static void main(String[] args) {
        Fila f = new Fila();
        f.enqueue(new No("primeiro"));
        f.enqueue(new No("segundo"));
        System.out.println(f);
        //f.dequeue();
        System.out.println(f.first());
    }
}
