import java.util.*;
public class BubbleSort
{
    public static void main(String args[])
    {
        int[] nums = {1,8,9,7,6,4,34,10,86,5};
        for(int i = 0; i < nums.length; i++)
        {
            for(int j = 0; j < nums.length-1-i; j++)
            {
                if(nums[j] > nums[j+1])
                {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        for(int x : nums)
        {
            System.out.print(x + "  ");
        }
    }
}
