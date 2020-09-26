
/*
*  I want to find the most profit made from buying and selling a stock.
*   - Profit is the difference between selling price and buying price.
*   - I want to achieve at least a linear time complexity.
* */

import java.util.*;

public class MaximumProfit {

    // add to LinkedList to optimize dynamic size and ease of insertion/deletion
    // order the list
    // find difference between last index and first index
    // return the difference ie. the profit
    static int getMaxProfit(int[] stockPrices) {

        if (stockPrices.length < 2) {
            throw new IllegalArgumentException("Getting a profit requires at least 2 prices");
        }

        int minPrice = stockPrices[0]; // calculate the first instance of a minimum price
        int maxProfit = stockPrices[1] - stockPrices[0]; //calculate the first possible profit

        for (int i = 1; i < stockPrices.length; i++) {

            int currentPrice = stockPrices[i];

            int potentialProfit = currentPrice - minPrice;

            maxProfit = Math.max(maxProfit, potentialProfit); // returns greater of the 2 numbers

            minPrice = Math.min(minPrice, currentPrice); // returns minimum of the 2 numbers

        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] stockPrices1 = new int[] {10, 7, 5, 8, 11, 9};
        int[] stockPrices2 = new int[] {10, 7, 5, 8, 11, 9, 50, 30, 2, 44};

        System.out.println(getMaxProfit(stockPrices1));
        getMaxProfit(stockPrices2);
    }
}

//        List<Integer> set = new LinkedList<>();
//        for (int p : prices) {
//            set.add(p); //add prices to the List
//        }
//        Collections.sort(set); //time complexity of O(n) as Collections.sort, when applied to a randomly ordered array, will operate with same efficiency as mergesort.
//        int last = set.get(set.size()-1);
//        int first = set.get(0);
//        System.out.println(last - first); //get profit