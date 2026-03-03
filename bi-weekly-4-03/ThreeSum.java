import java.util.Arrays;

class ThreeSum {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length - 2; i++) {
            int low = i + 1;
            int high = nums.length - 1;
            while (low < high) {
                int sum = nums[i] + nums[low] + nums[high];
                if (sum < target) {
                    low++;
                } else if (sum > target) {
                    high--;
                } else {
                    return sum;
                }
                ans = (Math.abs(target - sum) < Math.abs(target - ans)) ? sum : ans;
            }
        }
        return ans;
    }
}
