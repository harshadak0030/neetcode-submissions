class Solution {
    public int trap(int[] height) {
        int l=0;
        int r=height.length -1;
        int leftmax;
        int rightmax;
        int water =0;
        int totalwater=0;
        leftmax= 0;
        rightmax= 0;
while(l<r){
if(height[l] < height[r]){

    if(height[l] > leftmax){
        leftmax= height[l];
        l++;
    }else{
        water = leftmax- height[l];
        totalwater+= water;
        l++;
    }
}

else if(height[r] > rightmax){
    rightmax=height[r];
    r--;
} else{
    water = rightmax - height[r];
    totalwater+= water;
    r--;
}
}
 return totalwater;
    }

}
    
