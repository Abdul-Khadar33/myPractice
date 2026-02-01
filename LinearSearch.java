public class LinearSearch
{
    public static void main(String args[])
    {
        int[] nums = { 5,7,9,11,13};
        int target = 5;

        int result = Lsearch( nums, target);
        if(result != -1)
        {
            System.out.println("Element found at index : " + result);
        }
        else{
            System.out.println("Element not found");
        }

    }

    public static int Lsearch(int[] nums, int target)
    {
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == target)
            {
                return i;
            }
        }
        return -1;
    }
}