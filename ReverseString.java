/*import java.util.Scanner;

public class ReverseString
{
    public static char reverseString(char[] s)
    {
        int l = s.length;
        char result[] = new char[l];
        int left = 0;
        int right = s.length -1;
        while(left < right)
        {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
        return result[l];
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name : ");
        String name = sc.nextLine();
        System.out.println("Reverse of above name is : " + reverseString(name));
    }
}*/