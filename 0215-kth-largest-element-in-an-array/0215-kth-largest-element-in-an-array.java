class Solution {
    public int findKthLargest(int[] nums, int k) {
        int target = nums.length - k;
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int pivot = nums[high];

            int lt = low;
            int i = low;
            int gt = high;

            while (i <= gt) {

                if (nums[i] < pivot) {
                    swap(nums, lt, i);
                    lt++;
                    i++;
                } 
                else if (nums[i] > pivot) {
                    swap(nums, i, gt);
                    gt--;
                } 
                else {
                    i++;
                }
            }

            // [low ... lt-1]     < pivot
            // [lt ... gt]        == pivot
            // [gt+1 ... high]    > pivot

            if (target < lt) {
                high = lt - 1;
            } 
            else if (target > gt) {
                low = gt + 1;
            } 
            else {
                return pivot;
            }
        }

        return -1;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}