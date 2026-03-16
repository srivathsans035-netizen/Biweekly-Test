class KthLargestElement {
    public int findKthLargest(int[] nums, int k) {
        insertionSort(nums);
        return nums[nums.length - k];
    }

    private void insertionSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int key = nums[i];
            int j = i - 1;
            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = key;
        }
    }
}
