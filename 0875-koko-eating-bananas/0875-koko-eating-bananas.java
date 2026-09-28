class Solution {
    public int minEatingSpeed(int[] piles, int h) {
     int n = piles.length;
     int high = Arrays.stream(piles).max().getAsInt();
     int low = 1;
     while(low <= high){
        int mid = low+(high-low)/2;
        long k = 0;
        for(int pile : piles){
            k += (pile+mid-1)/mid;

        }
        if(k > h){
            low = mid+1;
        }else{
            high = mid-1;
        }

     }
     return low;

    }
}