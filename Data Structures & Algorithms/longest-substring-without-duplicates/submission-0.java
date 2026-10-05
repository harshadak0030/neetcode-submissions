class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet <Character> set = new HashSet<> ();
        int i =0;
        int L =0;
        int maxlength=0;
        int currentlen;
        while(i<s.length()){
        
            if (set.contains(s.charAt(i))){
                while(set.contains(s.charAt(i))){
set.remove(s.charAt(L));
L++;
                }

            }
            
            set.add(s.charAt(i));
            
           currentlen = i-L+1;
           if(currentlen > maxlength){
            maxlength= currentlen;
           } 
            i++;
            
        }
        return maxlength;
    }
}
