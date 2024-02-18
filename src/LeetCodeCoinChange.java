import java.util.*;

public class LeetCodeCoinChange {

    public static int coinChange(int[] coins, int amount) {
        if (amount <= 0) {
            return  0;
        } else {

            Arrays.sort(coins);
            int cointCount = 0;
            boolean isAvailable = false;
            for(int i =coins.length-1; i >=0; i--) {
                int coinv = amount%coins[i];
                cointCount = amount/coins[i];
                int val = coinCount(coinv,coins);
                if (val != -1) {
                    cointCount += val;
                    isAvailable = true;
                    break;
                }
            }
            if (isAvailable) {
                return cointCount;
            }
            return -1;

        }






    }

    public static int coinCount(int amount,int coins[]) {
        int coinsCount = 0;
        int coinAmount = amount;
        for(int i= coins.length-1;i >= 0; i--) {
            int coin = coins[i];
            int x = coinAmount%coin;
            if(x != coinAmount) {
                coinsCount += coinAmount / coin;
            }
            if(x == 0) {
                coinAmount = 0;
                break;
            } else {
                coinAmount = x;
            }
        }
        if (coinAmount != 0) {
            return -1;
        } else {
            return coinsCount;
        }
    }

   public static int coinChange1(int[] coins, int amount) {

        // Check edge case
        if (amount < 1) return 0;

        // Create DP array
        int[] minCoinsDP = new int[amount + 1];

        for (int i = 1; i <= amount; i++) {

            minCoinsDP[i] = Integer.MAX_VALUE;

            // Try each coin
            for (int coin : coins) {
                if (coin <= i && minCoinsDP[i - coin] != Integer.MAX_VALUE)
                    minCoinsDP[i] = Math.min(minCoinsDP[i], 1 + minCoinsDP[i - coin]);
            }
        }

        return minCoinsDP[amount] == Integer.MAX_VALUE ? -1 : minCoinsDP[amount];
    }


    public static void main(String[] args) {
        int y[] = new int[]{186,419,83,408};
        System.out.println(coinChange(y,6249));
    }
}
