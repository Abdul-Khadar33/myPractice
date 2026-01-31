public class BinarySearch
{
    public static void main(String args[])
    {
        int[] nums = {1,2,3,4,5,6,7,8,9,10,11};
        int target = 1;
        int result = BSearch(nums, target);

        if(result != -1)
        {
            System.out.println("Element found at index :" + result);
        }
        else
        {
            System.out.println("Element not found");
        }
    }
    public static int BSearch(int[] nums, int target)
    {
        
        int left = 0;
        int right = nums.length -1;

        while(left <= right)
        {
            int mid = (left + right) /2;

            if(nums[mid] == target)
            {
                return mid;
            }
            else if(target < mid)
            {
                right = mid -1;
            }
            else
            {
                left = mid + 1;
            }
        }
        
        return -1;
    }
}