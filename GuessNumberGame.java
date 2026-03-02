import java.util.*;

public class GuessNumberGame {

    static int pickedNumber = 37;  

    public static int guess(int num) {
        if (num > pickedNumber)
            return -1;
        else if (num < pickedNumber)
            return 1;
        else
            return 0;
    }

    public static int guessNumber(int n) {
        int low = 1;
        int high = n;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int result = guess(mid);

            if (result == 0)
                return mid;
            else if (result == -1)
                high = mid - 1;
            else
                low = mid + 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        int n = 100;  
        int result = guessNumber(n);

        System.out.println("Picked Number is: " + result);
    }
}
