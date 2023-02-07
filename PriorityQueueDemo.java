import java.util.PriorityQueue;

public class PriorityQueueDemo {

  public static void main(String[] args) {
    PriorityQueue<Integer> priorityQueueLowest = new PriorityQueue<>();
    priorityQueueLowest.add(1);
    priorityQueueLowest.add(2);
    priorityQueueLowest.offer(100);
    System.out.println(priorityQueueLowest);
    System.out.println(priorityQueueLowest.peek());
    System.out.println(priorityQueueLowest.peek());
    System.out.println(priorityQueueLowest);

    System.out.println(priorityQueueLowest.element());
    System.out.println(priorityQueueLowest);
    System.out.println(priorityQueueLowest.poll());
    System.out.println(priorityQueueLowest);


  }

}
