import java.util.*;
public class Insertion
{
    public static void main(String args[])
    {
        int[] nums = {10,1,9,2,8,3,7,4,6,5};
        for(int i = 1; i < nums.length; i++)
        {
            int key = nums[i];
            int j = i-1;
            while(j >= 0 && nums[j] > key)
            {
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = key;
        }
        for(int x : nums)
        {
            System.out.print(x + " ");
        }
    }
}
