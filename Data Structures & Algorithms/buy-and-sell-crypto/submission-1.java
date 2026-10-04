class Solution {
    public int maxProfit(int[] prices) {
    int minPrice = prices[0];
int Maxprofit=0;
    int profit ;
    
    for(int i =1;i< prices.length;i++){
        profit = prices[i] - minPrice ;
        if (profit > Maxprofit){
            Maxprofit = profit;
        }
        if (prices[i]<minPrice){
            minPrice =prices[i];

        }
        
    }
    return Maxprofit;
    }
}
