class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length < 1) return 0;
        TreeSet<Integer> set = new TreeSet<>();
        for(int num : nums){
            set.add(num);
        }
        int[] arr = new int[set.size()];
        int j = 0;
        for(int num : set){
            arr[j++] = num;
        }
        int cnt = 1;
        int max = 1;
        for(int i =1; i<set.size();i++ ) {
            if(arr[i] == arr[i-1]+1){
                cnt++;
            }else{
                cnt = 1;
            }
            max = Math.max(cnt,max);
        }
        return Math.max(cnt,max);
    }
}