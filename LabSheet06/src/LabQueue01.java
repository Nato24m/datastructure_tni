public class LabQueue01 {

    public static void main(String[] args) {

        QueueLinkedList q = new QueueLinkedList();
        for (int i = 101; i <= 105; i++) {
            q.enqueue(i);
            System.out.println("Enqueue: " + i);
        }
        System.out.print("Queue => [");
        QueueLinkedList temp = new QueueLinkedList();

        while (!q.isEmpty()) {
            int number = q.dequeue();
            System.out.print(number);
            temp.enqueue(number);
            if (!q.isEmpty()) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        while (!temp.isEmpty()) {
            q.enqueue(temp.dequeue());
        }

        System.out.println();

        while (!q.isEmpty()) {

            System.out.println("Calling number: " + q.peek());
            System.out.println("Providing service number: " + q.dequeue());
            System.out.println();
        }

        System.out.println("Queue => []");
    }
}