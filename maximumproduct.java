public class Main {
    public static void main(String[] args) {
        int[] nums = {2, 3, -2, 4};
        int maxProd = nums[0];  
        int result = maxProd;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > 0) {
                maxProd *= nums[i]; 
            } else {
                maxProd = nums[i];
            }
            result = Math.max(result, maxProd);  
        }

        System.out.println(result);  
    }
}
