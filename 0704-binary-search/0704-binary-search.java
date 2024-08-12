class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length-1;
        int left=0;
        int right=nums.length-1;
        //for(int i=0;i<n;i++)
        while(left<=right){
            int mid = left+(right-left)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                 left=mid+1;
            }
            else {
                 right=mid-1;
            }
        }
        return -1;
        
    }
}