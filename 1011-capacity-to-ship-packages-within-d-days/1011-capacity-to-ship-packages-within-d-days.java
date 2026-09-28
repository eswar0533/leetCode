class Solution {
    int max(int arr[]){
        int max = -1;
        for(int i = 0; i<arr.length; i++){
            max = Math.max(arr[i],max);
        }
        return max;
    }
    int sum(int arr[]){
        int s = 0;
        for(int i = 0; i<arr.length; i++){
            s+= arr[i];
        }
        return s;
    }
    public int shipWithinDays(int[] weights, int days) {
        int low = max(weights);

        int high =sum(weights);

        while(low <= high){
            int minDay = 1;
            int mid = (low+high)/2;
            int curw = 0;
            for(int weight : weights){
                if(curw+weight > mid){
                    minDay++;
                    curw = weight;
                }else{
                    curw+=weight;
                }
            }
            if(minDay > days){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return low;
    }
}