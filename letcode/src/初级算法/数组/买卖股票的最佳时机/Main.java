package 初级算法.数组.买卖股票的最佳时机;

/**
 * int maxProfit(int[] prices);
 *
 * 题目分析：
 * 买股票获得最大利润，即在谷买入，在峰卖出，中间商赚差价。因此使用峰谷法即可实现。
 * 题目需要实现找到峰和谷
 * （1）找到峰
 * 遍历数组，若下一个价格比当前大，则继续；否则，则找到峰。
 * （2）找到谷
 * 遍历数组，若下一个价格比当前小，则继续；否则，则找到谷。
 */
public class Main {
    public static void main(String[] args) {

    }

    public int maxProfit(int[] prices) {
        int low = 0;    //谷标志
        int high = 0;  //峰标志
        int count = 0;  //利润
        int i = 0;

        //找峰找谷
        while(i < prices.length-1){
            while(i < prices.length-1 && prices[i] >= prices[i+1]){
                i++;
            }
            low = i;
            while(i < prices.length-1 && prices[i] <= prices[i+1]){
                i++;
            }
            high = i;
            //计算利润
            count += (prices[high] - prices[low]);
        }

        return count;
    }
}
