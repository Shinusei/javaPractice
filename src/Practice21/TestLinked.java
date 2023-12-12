package Practice21;

public class TestLinked {
    public static void main(String[] args){
        LinkedQueue l = new LinkedQueue();
        l.enqueue(1);
        l.enqueue(3);
        l.enqueue(2);
        System.out.println(l.dequeue());
        System.out.println(l.dequeue());
        System.out.println(l.isEmpty());
        System.out.println(l.dequeue());
        System.out.println(l.isEmpty());
    }
}
