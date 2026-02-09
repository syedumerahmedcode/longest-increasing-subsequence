
import java.util.ArrayList;

public class BetterSolution {

    public int lengthOfLIS(int[] nums) {
        /**
         * Solved using Patience sort
         */
        ArrayList<Integer> sub = new ArrayList<>();

        sub.add(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            // whether the given num is greater than the last number in the subsequence
            if (nums[i] > sub.get(sub.size() - 1)) {
                // if yes, append it.
                sub.add(nums[i]);
            } else {
                // do a binary search
                int j = binarySearch(sub, nums[i]);
                sub.set(j, nums[i]);
            }
        }
        return sub.size();
    }
    
    private int binarySearch(ArrayList<Integer> sub, int num) {
        int left = 0;
        int right = sub.size() - 1;
        
        while (left < right) {
            int mid = (left + right) / 2;
            if (sub.get(mid) == num) {
                return mid;
            }
            if (sub.get(mid) < num) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left; 
    }

}
