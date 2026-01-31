// Just printing output without steps

/*public class Bubble
{
    public static void main(String args[])
    {
        int[] nums = {6,5,2,8,9,4};
        int temp = 0;
        int size = nums.length;

        System.out.println("Before sorting");
        for(int i = 0; i< size; i++)
        {
            System.out.print(nums[i] + "   ");
        }


        for(int i = 0; i< size; i++)
        {
            for(int j = 0; j < size -i-1; j++)    // size -1 is enough.. but steps may increase... to decrease steps, use size-i-1;
            {
                if(nums[j] > nums[j+1])
                {
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }                       
        }


        System.out.println();
        System.out.println("After sorting");
        for(int num : nums)
        {
            System.out.print(num + "   ");
        }
    }
}*/


// To print step by step tranformation or procedure of bubble sort, see below

public class Bubble
{
    public static void main(String args[])
    {
        int[] nums = {6,5,2,8,9,4};
        int size = nums.length;
        int temp;

        System.out.println("Before sorting");
       
        for(int i = 0; i < size; i++)
        {
            System.out.print(nums[i] + "   ");
        }
        System.out.println();
        System.out.println("Sorting steps"); 
        for(int i = 0; i < size; i++)
        {
            for(int j = 0; j < size -i-1; j++)
            {
                if(nums[j] > nums[j+1])
                {
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
            for(int num : nums)
            {
                System.out.print(num + "   ");
            }
            System.out.println();
        }
    }
}