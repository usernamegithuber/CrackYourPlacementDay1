package CrackYourPlacementDay1;

public class FindTheDuplicateNumber {
    static class Solution {
        public int findDuplicate(int[] nums) {
            int slow = nums[0];
            int fast = nums[0];
            do {
                slow = nums[slow];
                fast = nums[nums[fast]];
            } while (slow != fast);

            fast = nums[0];
            while (slow != fast) {
                slow = nums[slow];
                fast = nums[fast];
            }
            return slow;
        }
    }

    public static void main(String[] args) {
        // Sample test to demonstrate the usage
        Solution solution = new Solution();
        int[] nums = {1, 3, 4, 2, 2};
        int duplicate = solution.findDuplicate(nums);
        System.out.println("The duplicate number is: " + duplicate);  // Output should be 2
    }
}
