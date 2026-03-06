import java.util.*;

public class TwoArraysIntersection {

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> intersect = new HashSet<>();

        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }

        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i])) {
                intersect.add(nums2[i]);
            }
        }

        int[] result = new int[intersect.size()];
        int i = 0;

        for (Integer num : intersect) {
            result[i++] = num;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int[] nums1 = new int[n1];
        for(int i = 0; i < n1; i++){
            nums1[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int[] nums2 = new int[n2];
        for(int i = 0; i < n2; i++){
            nums2[i] = sc.nextInt();
        }

        int[] result = intersection(nums1, nums2);

        for(int x : result){
            System.out.print(x + " ");
        }
    }
}
