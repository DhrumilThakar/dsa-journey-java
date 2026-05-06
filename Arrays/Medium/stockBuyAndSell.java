/* You are given an array of prices where prices[i] is the price of a given stock on an ith day. You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock. Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.*/

public class stockBuyAndSell{
     public static int bestTime(int[] arr){
          int maxProfit =0;
          int buyTime = arr[0];

          for(int i =0;i<arr.length;i++){
               int cost = arr[i] -buyTime;
               maxProfit = Math.max(maxProfit, cost);
               buyTime = Math.min(buyTime, arr[i]);
          }
          return maxProfit;
     }
     public static void main(String[] args) {
          int[] arr = {7,6,4,3,1};
          System.out.println(bestTime(arr));
     }
}