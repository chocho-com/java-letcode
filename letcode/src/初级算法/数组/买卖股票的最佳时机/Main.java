package 初级算法.数组.买卖股票的最佳时机;

public class Main {
    public static void main(String[] args) {

    }

    public int maxProfit(int[] prices) {
        int low = 0;    //高价标志
        int hight = 0;  //低价标志
        int status = 0; //0-卖出状态,1-买入状态
        int count = 0;

        //在未来最低的价格买入，在未来最高的价格卖出
        //求较大数，较小数
        for(int i = 1; i < prices.length; i++){
            //找小数
            if(status == 0){
                if(prices[i] < prices[hight]){
                    low = i;
                    status = 1;
                }
            }else{
                if(prices[i] > prices[low]){
                    hight = i;
                    count += (prices[hight]-prices[low]);
                    status = 0;
                }
            }
        }

        return count;
    }
}
