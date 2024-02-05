import java.util.*;

class Item {
    int weight;
    int value;

    public Item(int weight, int value) {
        this.weight = weight;
        this.value = value;
    }
}
public class zero_one {

    public static int zeroOneKnapsack(int W, List<Item> items) {
        int n = items.size();
        int[][] dp = new int[n + 1][W + 1];
 
        for (int i = 1; i <= n; i++) {
            for (int w = 0; w <= W; w++) {
                if (items.get(i - 1).weight <= w) {
  dp[i][w] = Math.max(dp[i - 1][w], items.get(i - 1).value + dp[i - 1][w - items.get(i - 1).weight]);
                } else {
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }

        return dp[n][W];
    }
    public static void main(String[] args) {
        int maxWeight = 50;
        List<Item> items = new ArrayList<>();
        items.add(new Item(10, 60));
        items.add(new Item(20, 100));
        items.add(new Item(30, 120));

        int maxValue = zeroOneKnapsack(maxWeight, items);

        System.out.println("Maximum value that can be obtained: " + maxValue);
    }
}
