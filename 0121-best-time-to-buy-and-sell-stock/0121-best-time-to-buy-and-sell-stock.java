class Solution {
    public int maxProfit(int[] n) {
        int min = n[0];
        int max = 0;
        for(int  i = 0;i<n.length;i++){
            min = Math.min(min,n[i]);
            if(n[i]-min>max){
                max = n[i]-min;
            }
        }
        return max;
    }
}