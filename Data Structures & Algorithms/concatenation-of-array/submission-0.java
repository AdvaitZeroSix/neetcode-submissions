class Solution {
    public int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int ans[] = new int[len*2];
        int count=0,c=0;
        while(count<2){
            for(int i : nums){
                ans[c]=i;
                c++;
            }
            count++;
        }
        return ans;
    }
}