class Solution {

    public String encode(List<String> strs) {
       
        StringBuilder sb = new StringBuilder();
        for(String s : strs){
            sb.append(s.length());
            sb.append("#");
            sb.append(s);
        }
    return sb.toString();
    }

    public List<String> decode(String str) {
         List<String> ans = new ArrayList<>();
         int i =0;
         while(i < str.length()){
            String num="";
        while(str.charAt(i) != '#'){
             num = num + str.charAt(i);
            
            i++;
        }
        i++;
        
    int length = Integer.parseInt(num);
    String word = str.substring(i, i+length);
    ans.add(word);
    i= i+ length;
         }
    return ans;
    }

}
