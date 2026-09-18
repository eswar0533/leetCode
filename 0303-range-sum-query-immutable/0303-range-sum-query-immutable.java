class NumArray {

    int[] num;
    public NumArray(int[] nums) {
        int n = nums.length;
         num = new int[nums.length+1];
        for(int i = 0; i<n; i++){
            num[i+1] = num[i]+nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        return num[right+1]-num[left];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */