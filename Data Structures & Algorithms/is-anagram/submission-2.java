class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character,Integer> letters1 = new HashMap<>();
        char[] st=s.toCharArray();
        char[] ts=t.toCharArray();
        for( char c : st){
            if (letters1.containsKey(c)){
                letters1.put(c,letters1.get(c)+1);
            }
            else{
                letters1.put(c,1);
            }
        }
        HashMap<Character,Integer> letters2 = new HashMap<>();
        for(char c : ts){
            if (letters2.containsKey(c)){
                letters2.put(c,letters2.get(c)+1);
            }
            else{
                letters2.put(c,1);
            }
        }
        for (char c : st){
            if(!letters2.containsKey(c)||!letters1.get(c).equals(letters2.get(c))){
                return false;
            }
        }
        return true;

    }
}
