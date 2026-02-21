import java.util.*;

public class PrimeNumberBits {

    public static int countPrimeSetBits(int left, int right) {

        HashSet<Integer> primeSet = new HashSet<>(
                Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19)
        );

        int count = 0;

        for (int i = left; i <= right; i++) {

            int setBits = Integer.bitCount(i);  // count number of 1s in binary

            if (primeSet.contains(setBits)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int left = sc.nextInt();
        int right = sc.nextInt();

        System.out.print(countPrimeSetBits(left, right));

        sc.close();
    }
}
