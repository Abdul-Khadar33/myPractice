import java.util.Scanner;

public class ReverseVowelsExample {

    public static String reverseVowels(String s) {
        if (s == null || s.length() == 0)
            return s;

        String vowels = "aeiouAEIOU";
        char[] chars = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {

            while (start < end && !vowels.contains(chars[start] + "")) {
                start++;
            }

            while (start < end && !vowels.contains(chars[end] + "")) {
                end--;
            }

            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;

            start++;
            end--;
        }

        return new String(chars);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String result = reverseVowels(input);

        System.out.println("After reversing vowels: " + result);

        sc.close();
    }
}
