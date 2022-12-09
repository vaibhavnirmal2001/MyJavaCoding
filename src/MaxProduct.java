import java.util.Arrays;

public class MaxProduct {
    public static int maxProduct(int[] nums) {
        Arrays.sort(nums);
        return (nums[nums.length-1]-1)*(nums[nums.length-2]-1);
    }

    public static void main(String[] args) {
        System.out.println(maxProduct(new int[]{3,4,5,2}));
    }
}
