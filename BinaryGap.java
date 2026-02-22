import java.util.*;

public class Main {

    public static int binaryGap(int n) {

        int i = 0;       
        int cnt = 0;     
        int idx = 0;     
        int gap = 0;    
        while (n != 0) {

            if ((n & 1) == 1) {   

                if (cnt != 0) {   
                    gap = Math.max(gap, i - idx);
                }

                idx = i;   
                cnt++;    
            }

            n = n >> 1;  
            i++;         
        }

        return gap;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.print(binaryGap(n));

        sc.close();
    }
}
