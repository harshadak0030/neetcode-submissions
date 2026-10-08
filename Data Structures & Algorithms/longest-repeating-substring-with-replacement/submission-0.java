class Solution {
    public int characterReplacement(String s, int k) {
        int maxwindow=0;
        int currentwindow;
        int maxfreq=0;
int l=0;
int r =0;
int[] count = new int[26]; 
        currentwindow = r-l+1;


while(r <s.length()){
    count[s.charAt(r) -'A']++;
    currentwindow = r-l+1;
maxfreq = Math.max(maxfreq,count[s.charAt(r)- 'A']);
int replacementneeded;
replacementneeded = currentwindow - maxfreq;

if (replacementneeded<= k){

} 
while (replacementneeded > k){
count[s.charAt (l)- 'A']--;
l++;
currentwindow = r-l+1;
replacementneeded = currentwindow - maxfreq;

}
if (currentwindow> maxwindow){
    maxwindow = currentwindow;
   
}
 r++;
}
return maxwindow;

    }
}
