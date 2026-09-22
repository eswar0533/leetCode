class Solution {
    public String predictPartyVictory(String senate) {
        int n = senate.length();
        ArrayDeque<Integer> rq = new ArrayDeque<>();
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        for(int i = 0; i<n; i++){
            char temp = senate.charAt(i);
            if(temp == 'R'){
                rq.offer(i);
            }else{
                dq.offer(i);
            }
        }
        while(!rq.isEmpty() && !dq.isEmpty()){
            if(rq.peek() < dq.peek()){
                dq.poll();
                rq.offer(rq.poll()+n);
            }
            else{
                rq.poll();
                dq.offer(dq.poll()+n);
            }
        }
        if(dq.isEmpty()){
            return "Radiant";
        }else{
        return "Dire";
        }
    }
}