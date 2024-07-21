package CrackYourPlacementDay1;

public class SortColors {
    static class Solution {
        public void sortColors(int[] nums) {
            int low = 0;
            int high = nums.length - 1;
            int mid = 0;
            while (mid <= high) {
                if (nums[mid] == 0) {
                    swap(nums, low, mid);
                    low++;
                    mid++;
                } else if (nums[mid] == 1) {
                    mid++;
                } else {
                    swap(nums, mid, high);
                    high--;
                }
            }
        }

        private void swap(int[] nums, int a, int b) {
            int temp = nums[a];
            nums[a] = nums[b];
            nums[b] = temp;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {2, 0, 2, 1, 1, 0};
        solution.sortColors(nums);
        for (int num : nums) {
            System.out.print(num + " ");  // Output should be 0 0 1 1 2 2
        }
    }
}
