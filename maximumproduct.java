public class Main {
    public static void main(String[] args) {
        int[] nums = {2, 3, -2, 4};
        
        int maxProd = nums[0], minProd = nums[0], result = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                int temp = maxProd;
                maxProd = minProd;
                minProd = temp;
            }
            maxProd = Math.max(nums[i], maxProd * nums[i]);
            minProd = Math.min(nums[i], minProd * nums[i]);
            result = Math.max(result, maxProd);
        }
        
        System.out.println(result);
    }
}
