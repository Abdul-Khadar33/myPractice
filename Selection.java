public class Selection
{
    public static void main(String args[])
    {
        int[] nums = {7,3,9,5,1,2,8,5};
        int size = nums.length;
        int temp = 0;
        int minIndex = 0;

        System.out.println("Before sorting");
        for(int num : nums)
        {
            System.out.print(num + "   ");
        }

        for(int i = 0; i < size -1; i++)
        {
            minIndex = i;
            for(int j = i+1; j < size; j++)
            {
                if(nums[j] < nums[minIndex])
                {
                    minIndex = j;
                }
            }
            temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;
        }


        System.out.println();
        System.out.println("After sorting");
        for(int num : nums)
        {
            System.out.print(num + "   ");
        }
    }
}