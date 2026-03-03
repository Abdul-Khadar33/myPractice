import java.util.*;

public class LongestPalindrome {

    public static int longestPalindrome(String s) {
        int oddCount = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            if (map.get(ch) % 2 == 1) {
                oddCount++;
            } else {
                oddCount--;
            }
        }

        if (oddCount > 1) {
            return s.length() - oddCount + 1;
        }

        return s.length();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = sc.nextLine();

        int result = longestPalindrome(input);

        System.out.println("Length of Longest Palindrome: " + result);
    }
}
