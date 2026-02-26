public class fibonacci
{
    public static int Fibonacci(int num)
    {
        if(num == 0 || num == 1 || num ==2)
        {
            return 1;
        }
        int fib = Fibonacci(num-1) + Fibonacci(num-2);
        return fib;
    }
    public static void main(String args[])
    {
        int num = 7;
        System.out.println(Fibonacci(num));
    }
}
/* 
public static int Fibonacci(int n) {

    if (n <= 1)
        return n;

    int a = 0, b = 1;

    for (int i = 2; i <= n; i++) {
        int c = a + b;
        a = b;
        b = c;
    }

    return b;
}
*/