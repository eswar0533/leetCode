class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] diff = new int[n+1];
        for(int[] booking : bookings){
            int start = booking[0];
            int end = booking[1];
            int seats = booking[2];
            diff[start-1] += seats;
            diff[end] -= seats;
        }
        int sum = 0;
        int[] ans = new int[n];
        for(int i =0; i<n; i++){
            sum+=diff[i];

            ans[i] = sum;
        }
        return ans;
    }
}