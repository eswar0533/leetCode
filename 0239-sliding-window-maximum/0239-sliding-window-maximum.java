class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
         int n = nums.length;
        // int max = nums[0];
        ArrayList<Integer> li = new ArrayList<>();

    //     for(int i=0; i<=n-k; i++){

    //         for(int j = i; j<i+k; j++){
    //             max = Math.max(max,nums[j]);
    //         }

    //         li.add(max);
    //     }
       int[] ans = new int[n - k + 1];
    //     int i = 0;
    //     for(int ele : li){
    //         ans[i++] = ele;
    //     }
    // return ans;
    Deque<Integer> q = new ArrayDeque<>();
    ArrayList<Integer> list = new ArrayList<>();
    int index = 0;
    for(int i = 0; i<n; i++){
        if(!q.isEmpty() && q.peekFirst() <= i-k){
            q.pollFirst();
        }
        while(!q.isEmpty() && nums[q.peekLast()] <= nums[i]){
            q.pollLast();
        }
        q.offerLast(i);
        if(i >= k-1){
            ans[index++] = nums[q.peekFirst()];
        }
    }
      return ans;  
    }
}