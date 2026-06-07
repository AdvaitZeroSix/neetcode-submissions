class Solution {
    public void merge(int[] nums,int si,int mi,int ei){
        int[] temp= new int[ei-si+1];
        int i = si;
        int  j = mi+1;
        int k = 0;
        while (i <= mi && j <= ei){
            if(nums[i]<=nums[j]){
                temp[k++]=nums[i++];
            }
            else{
                temp[k++]=nums[j++];
            }
        }
        while(i<=mi){
            temp[k++]=nums[i++];
        }
        while(j<=ei){
            temp[k++]=nums[j++];
        }
        for (int p = 0; p < temp.length; p++) {
            nums[si + p] = temp[p];
        }
    }
    public void mergesort(int[] nums,int si,int ei){
            if(si>=ei){
                return;
            }
            int mi=si+(ei-si)/2;
            mergesort(nums,si,mi);
            mergesort(nums,mi+1,ei);
            merge(nums,si,mi,ei);
    }
    public int[] sortArray(int[] nums) {
        int si=0;
        int ei=nums.length-1;
        mergesort(nums,si,ei);
        return nums;
    }
}