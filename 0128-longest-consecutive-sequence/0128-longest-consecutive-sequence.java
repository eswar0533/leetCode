class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length < 1) return 0;
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int max = 0;
        for(int num : set){

            if(!set.contains(num-1)){
                int current = num;
                int cnt = 1;
            
            while(set.contains(current + 1)){
                current++;
                cnt++;
                
            }
            max = Math.max(cnt,max);
            
           }
        }
        return max;
    }
}