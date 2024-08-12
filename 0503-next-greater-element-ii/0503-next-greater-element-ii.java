class Solution {
    public int[] nextGreaterElements(int[] nums){
        int arr[] = new int[nums.length];
        int da[] = new int[nums.length*2];
        for(int i = 0;i<nums.length;i++){
            da[i]=da[i+nums.length]=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            arr[i] = -1;
            for(int j=i+1;j<da.length;j++){
                if(nums[i]<da[j]){
                    arr[i]= da[j];
                    break;
                }
            }
        }
        return arr;
    }
}