class Solution {
    public int removeElement(int[] nums, int val) {
        int k=0;
        int len = nums.length;
        for(int i=0;i< len;i++){
            if(val==nums[i]){
                for(int j=i;j<len-1;j++){
                    nums[j]=nums[j+1];
                }
                len--;
                k--;
                i--;
            }
            k++;
        }
        return k;
    }
}