package CrackYourPlacementDay1;

public class RemoveDuplicates {
    static class Solution {
        public int removeDuplicates(int[] nums) {
            if (nums.length == 0) return 0;
            int ind = 1;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] != nums[i - 1]) {
                    nums[ind] = nums[i];
                    ind++;
                }
            }
            return ind;
        }

        public static void main(String[] args) {
            Solution solution = new Solution();
            int[] nums = {1, 1, 2, 2, 3, 3, 4, 5};
            int length = solution.removeDuplicates(nums);
            System.out.println("Length after removing duplicates: " + length); // Output should be 5
            System.out.print("Array after removing duplicates: ");
            for (int i = 0; i < length; i++) {
                System.out.print(nums[i] + " "); // Output should be 1 2 3 4 5
            }
        }
    }
}
