class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Stack<Integer> stack = new Stack<>();
        int n = temp.length;
        int[] ans = new int[n];
        for(int i = 0; i<n; i++){
            while(!stack.isEmpty() && temp[i] > temp[stack.peek()]){
                int preve = stack.pop();
                ans[preve] = i-preve;
            }
            stack.push(i);
        }
        return ans;
    }
}