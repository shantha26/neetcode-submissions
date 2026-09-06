class Solution {
    public int rob(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int n = nums.length;
        int[] arr = new int[n+1];
        arr[0] = 0;
        arr[1] = nums[0];
        for(int i = 2; i <= n; i++) {
            arr[i] = Math.max(arr[i-1], arr[i-2]+nums[i-1]);
        }
        return arr[n];
    }
}
