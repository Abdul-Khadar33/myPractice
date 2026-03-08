/*import java.util.*;
public class Practice3
{
    public static boolean isPrime(int n)
    {
        if(n <= 1)
        {
            return false;
        }
        for(int i = 2; i*i <= n; i++)
        {
            if(n % i == 0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPrime(n));
        sc.close();
    }
}*/
/*
import java.util.*;
public class Practice3
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String reversed = "";
        for(int i = s1.length()-1; i >= 0; i--)
        {
            reversed = reversed + s1.charAt(i);
        }
        System.out.println(reversed);
        sc.close();
    }
}*/
/*
import java.util.*;
public class Practice3
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int orginal = num;
        int sum = 0;

        while(num > 0)
        {
            int digit = num % 10;
            sum = sum + digit * digit * digit;
            num = num / 10;
        }
        System.out.println(orginal);
        System.out.println(sum);
        if(sum == orginal)
        {
            System.out.println("Its armStrong Number");
        }
        else
            System.out.println("Not armStrong number");
        sc.close();
    }
}*/


/*import java.util.*;
public class Practice3
{
    public static boolean isPrime(int n)
    {
        if(n <= 1)
        {
            return false;
        }
        for(int i = 2; i*i <= n; i++)
        {
            if(n % i == 0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int limit = sc.nextInt();
        int num = 1;
        while(count < limit)
        {
            if(isPrime(num))
            {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
        sc.close();
    }
}*/

/*import java.util.*;
public class Practice3
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        boolean isPalindrome = true;
        for(int i = 0; i < s1.length()/2; i++)
        {
            if(s1.charAt(i) != s1.charAt(s1.length() -i-1))
            {
                isPalindrome = false;
            }
        }
        if(isPalindrome)
        {
            System.out.println("It is palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
        sc.close();
    }
}*/

/*public class Practice3
{
    public static void main(String args[])
    {
        String s1 = "1";
        int num = Integer.parseInt(s1);
        int orginal = num;
        int sum = 0;
        while(num > 0)
        {
            int digit = num % 10;
            sum = sum + digit * digit * digit;
            num /= 10;
        }
        System.out.println(sum);
        System.out.println(orginal);
        if(sum == orginal)
        {
            System.out.println("ArmStrong");
        }
        else{
            System.out.println("Not");
        }
    }
}*/

/*import java.util.*;
public class Practice3
{
    public static boolean isPrime(int n)
    {
        if(n <= 1)
        {
            return false;
        }
        for(int i = 2; i*i <= n; i++)
        {
            if(n % i == 0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num = 1;
        int limit = sc.nextInt();
        int count = 0;
        while(num < limit)
        {
            if(isPrime(num))
            {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
        System.out.println(count);
        sc.close();
    }
}*/

/*import java.util.*;
public class Practice3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String vowels = "aeiouAEIOU";
        int cCount = 0;
        int vCount = 0;
        for(int i = 0; i < s1.length(); i++)
        {
            char ch = s1.charAt(i);
            if(vowels.indexOf(ch) != -1)
            {
                vCount++;
            }
            else if(Character.isLetter(ch))
            {
                cCount++;
            }
        }
        System.out.println(vCount + "  " + cCount);
        sc.close();
    }
}*/

/*import java.util.*;
public class Practice3
{
    public static int factorial(int n)
    {
        int fact = 1;
        for(int i = 1; i <= n; i++)
        {
            fact = fact * i;
        }
        return fact;

    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int orginal = n;
        int fact = 0;
        while(n > 0)
        {
            int digit = n % 10;
            fact = fact + factorial(digit);
            n /= 10;
        }
        System.out.println(fact);
        System.out.println(orginal);
        if(fact == orginal)
        {
            System.out.println("Strong");
        }
        else
            System.out.println("Not");
        sc.close();
    }
}*/

/*import java.util.*;
public class Practice3
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        char[] ch = s1.toCharArray();
        char c[] = s2.toCharArray();

        Arrays.sort(ch);
        Arrays.sort(c);

        for(int i =0; i < ch.length; i++)
        {
            if(ch[i] == c[i])
            {
                System.out.println("Anagram");
            }
            else
                System.out.println("Not");
        }
        sc.close();
    }
}*/

