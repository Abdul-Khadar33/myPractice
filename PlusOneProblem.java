import java.util.*;
public class PlusOneProblem
{
    public static int[] plusOne(int[] nums)
    {
        for(int i = nums.length-1; i >= 0; i--)
        {
            if(nums[i] < 9)
            {
                nums[i]++;
                return nums;
            }
            nums[i] = 0;
        }
        int newNums[] = new int[nums.length+1];
        newNums[0] = 1;
        return newNums;
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
        System.out.println(Arrays.toString(plusOne(arr)));
    }
}
