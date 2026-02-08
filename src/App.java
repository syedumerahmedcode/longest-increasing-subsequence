public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        /**
         * Given an integer array nums, return the length of the longest strictly increasing subsequence.
        
        
        
        Example 1:
        
        Input: nums = [10,9,2,5,3,7,101,18]
        Output: 4
        Explanation: The longest increasing subsequence is [2,3,7,101], therefore the length is 4.
        Example 2:
        
        Input: nums = [0,1,0,3,2,3]
        Output: 4
        Example 3:
        
        Input: nums = [7,7,7,7,7,7,7]
        Output: 1
         */
        int[] nums = { 10, 9, 2, 5, 3, 7, 101, 18 };
        Solution solution = new Solution();
        int result = solution.lengthOfLIS(nums);
        System.out.println("The longest increasing subsequence for the input given above is: "+result);
    }
}
