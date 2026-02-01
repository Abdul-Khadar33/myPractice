public class Quick
{
    public static void main(String args[])
    {
        int[] nums = {9,8,7,6,5,4,3,2,1,0};
        QuickSort(nums, 0, nums.length-1);
        for(int num : nums)
        {
            System.out.print(num + "   ");
        }
    }

    public static void QuickSort(int[] nums, int low, int high)
    {
        if(low < high)
        {
            int pi = Partition(nums, low, high);
            QuickSort(nums, low, pi-1 );
            QuickSort(nums, pi+1 ,high) ;
        }
    }
    private static int Partition(int[] nums, int low, int high)
    {
        int pivot = nums[high];
        int i = low - 1;

        for(int j = low; j < high; j++)
        {
            if(nums[j] < pivot)
            {
                i++;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        int temp = nums[i+1];
        nums[i+1] = nums[high];
        nums[high] = temp;
        return i + 1;
    }
}