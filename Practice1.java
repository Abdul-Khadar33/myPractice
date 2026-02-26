/*import java.util.*;
public class Practice1{
    public static int reverse(int nums[], int start, int end)
    {
        while(start <= end)
        {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int k = 1;
        reverse(arr, 0, n-1);
        reverse(arr, 0, k-1);
        reverse(arr,k, n-1);

        for(int x : arr)
        {
            System.out.print(x + " ");
        }
        sc.close();
    }
}*/

/*import java.util.*;
public class Practice1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n+1];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int num = sc.nextInt();
        int pos = sc.nextInt();

        for(int i = n; i >= pos; i--)
        {
            arr[i] = arr[i-1];
        }
        arr[pos-1] = num;

        for(int x : arr)
        {
            System.out.print(x + "  ");
        }
        sc.close();
    }
}*/

/*import java.util.*;
public class Practice1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n+1];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int mid = n/2;
        int element = sc.nextInt();
        for(int i = n; i >= mid; i--)
        {
            arr[i] = arr[i-1];
        }
        arr[mid] = element;
        for(int x : arr)
        {
            System.out.print(x + " ");
        }
        sc.close();
    }
}*/

/*import java.util.*;
public class Practice1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i = 1; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}*/

/*import java.util.*;
public class Practice1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < n-1; i++)
        {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}*/

/*import java.util.*;
public class Practice1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int pos = sc.nextInt();

        for(int i = 0; i < n; i++)
        {
            if(arr[i] != pos)
            {
                System.out.print(arr[i] + " ");
            }
        }
        sc.close();
    }
}*/

/*import java.util.*;
public class Practice1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int mid = n/2;
        for(int i = 0; i < n; i++)
        {
            if(i != mid)
            {
                System.out.print(arr[i] + " ");
            }
        }
        sc.close();
    }
}*/

/*import java.util.*;
public class Practice1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int del = sc.nextInt();
        for(int i = 0; i < n; i++)
        {
            if(arr[i] != del)
            {
                System.out.print(arr[i] + " ");
            }
        }
        sc.close();
    }
}*/

/*import java.util.*;
public class Practice1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int min= Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++)
        {
            if(arr[i] < min)
            {
                min = arr[i];
            }
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }
        System.out.print(min + " " + max);
        sc.close();
    }
}*/


/*import java.util.*;
public class Practice1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int expectedSum = (n+1) * (n+2) /2;
        int actualSum = 0;
        for(int i = 0; i < n; i++)
        {
            actualSum = actualSum + arr[i];
        }
        int diff = expectedSum - actualSum;

        System.out.println(diff);
        sc.close();
    }
}*/


/*import java.util.*;
public class Practice1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        LinkedHashMap <Integer,Integer> map = new LinkedHashMap<>();
        for(int i = 0; i < n; i++)
        {
            map.put(arr[i], map.getOrDefault(arr[i] , 0) +1);
        }

        for(int x : map.values())
        {
            System.out.print(x + " ");
        }
    }
}*/

/*import java.util.*;
public class Practice1
{
    public static boolean duplicate(int nums[])
    {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++)
        {
            if(set.contains(nums[i]))
            {
                return false;
            }
            set.add(nums[i]);
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(duplicate(arr));
        sc.close();
    }
}*/


/*import java.util.*;
public class Practice1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for(int a : arr)
        {
            if(a > max)
            {
                max = a;
            }
        }
        System.out.print("{ " + max + " }");
        sc.close();
    }
}*/


/*import java.util.*;
public class Practice1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n == 0)
        {
            return;
        }
        int arr[] = new int[n];
        for(int i = 0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        if(n == 1)
        {
            System.out.println(arr[0]);
        }
        for(int i = 1; i < n-1; i++)
        {
            if(arr[i] < arr[i-1] && arr[i] < arr[i+1])
            {
                System.out.println(arr[i]);
                break;
            }
        }
        sc.close();
    }
}*/

/*import java.util.*;
public class Practice1
{
    public static boolean isPrime(int n)
    {
        if(n <=1)
        {
            return false;
        }
        for(int i = 2; i < n; i++)
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

import java.util.*;
public class Practice1
{
    public static boolean isprime(int n)
    {
        if(n <= 1)
        {
            return false;
        }
        for(int i = 2; i< n; i++)
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
        int num = 2;
        while(count < 10)
        {
            if(isprime(num))
            {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
        sc.close();
    }
}