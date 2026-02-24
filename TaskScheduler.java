import java.util.Arrays;
import java.util.Scanner;

public class TaskScheduler {

    public static int leastInterval(char[] tasks, int n) {

        int[] frequency = new int[26];

        for (char task : tasks) {
            frequency[task - 'A']++;
        }

        Arrays.sort(frequency);

        int maxFreq = frequency[25];
        int chunks = maxFreq - 1;
        int idleSlots = chunks * n;

        for (int i = 24; i >= 0; i--) {
            idleSlots -= Math.min(chunks, frequency[i]);
        }

        if (idleSlots > 0) {
            return tasks.length + idleSlots;
        } else {
            return tasks.length;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter tasks (like AAABBB): ");
        String input = sc.nextLine().toUpperCase();

        char[] tasks = input.toCharArray();

        System.out.println("Enter cooling time (n): ");
        int n = sc.nextInt();

        int result = leastInterval(tasks, n);

        System.out.println("Minimum intervals needed: " + result);

        sc.close();
    }
}
