import java.util.Scanner;

public class TaskQueue {
    public static void main(String[] args) {
        QueueOfTasks queue = new QueueOfTasks();
        Scanner scan = new Scanner(System.in);
        String line = null;
        System.out.println(
                "Enter tasks in the form 'op arg1 arg2'\n" +
                        "where op is + - * / and args are doubles\n" +
                        "Enter 'q' to stop reading");
        while (!(line = scan.nextLine()).startsWith("q")) {
            String[] arr = line.split(" ");
            double a = Double.parseDouble(arr[1]);
            double b = Double.parseDouble(arr[2]);
            Task op = Task.getInstance(arr[0], a, b);
            queue.enqueue(op);
        }
        while (!queue.empty()) {
            Task op = queue.dequeue();
            System.out.println(op.execute());
        }
    }
}