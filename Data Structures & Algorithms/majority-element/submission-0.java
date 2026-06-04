class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }
            else{
                map.put(i,1);
            }
        }int res=0;
        int n=nums.length;
        for(int key : map.keySet()){
            if(map.get(key)>(n/2))
            return key;
        }
        return -1;
    }
}