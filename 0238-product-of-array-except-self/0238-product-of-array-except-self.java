class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int n = nums.length;
        
        int[] output = new int[n];
        
        // Calculate the product of all elements to the left of each element
        int leftProduct = 1;
        
        for (int i = 0; i < n; i++) {
            
            output[i] = leftProduct;
            
            leftProduct *= nums[i];
            
        }
        
        // Calculate the product of all elements to the right of each element
        int rightProduct = 1;
        
        for (int i = n - 1; i >= 0; i--) {
            
            output[i] *= rightProduct;
            
            rightProduct *= nums[i];
            
        }
        
        return output;
    }
}