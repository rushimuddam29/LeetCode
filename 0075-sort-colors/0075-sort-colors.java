class Solution {
    public void sortColors(int[] n) {
        int low = 0;
        int mid = 0;
        int high = n.length-1;
        while(mid<=high){
            if (n[mid] == 0){
                int temp = n[low];
                n[low] = n[mid];
                n[mid] = temp;
                low++;
                mid++;
                
            }
            else if(n[mid]==1){
                mid++;
                }
            else{
                int temp = n[mid];
                n[mid] = n[high];
                n[high] = temp;
                high--;
            }
        }
    }
}



