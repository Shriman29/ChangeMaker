package Tasks;

import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Change {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Choose your currency");
        System.out.println("1.British Pound \n2.US Dollar \n3.Indian Rupees \n4.Norwegian Krone \n5.Exit");
        int a=s.nextInt();
            if (a == 1) {
                Map<Integer, Integer> avlCoins1 = new HashMap<>();
                int[] den = {50, 20, 10, 5, 2, 1};
                System.out.println("Enter the change");
                int change = s.nextInt();
                avlCoins1.put(50, 10);
                avlCoins1.put(20, 5);
                avlCoins1.put(10, 4);
                avlCoins1.put(5, 2);
                avlCoins1.put(2, 10);
                avlCoins1.put(1, 20);
                List<Integer> coins = makeChange(change, den, avlCoins1);
                System.out.println("Minimum coins for change is "+coins.size());
                System.out.println(coins);
                if(coins.isEmpty()){
                    System.out.println("Coins not available");
                }
            } else if (a == 2) {
                Map<Integer, Integer> avlCoins2 = new HashMap<>();
                int[] den = {25, 10, 5, 1};
                System.out.println("Enter the change");
                int change = s.nextInt();
                avlCoins2.put(25, 5);
                avlCoins2.put(10, 4);
                avlCoins2.put(5, 2);
                //availableCoins.put(2, 10);
                avlCoins2.put(1, 20);
                List<Integer> coins = makeChange(change, den, avlCoins2);
                System.out.println("Minimum coins for change is "+coins.size());
                System.out.println(coins);
                if(coins.isEmpty()){
                    System.out.println("Coins not available");
                }
            } else if (a == 3) {
                Map<Integer, Integer> avlCoins3 = new HashMap<>();
                int[] den = {50, 20, 10, 2, 1};
                System.out.println("Enter the change");
                int change = s.nextInt();
                avlCoins3.put(50, 10);
                avlCoins3.put(20, 5);
                avlCoins3.put(10, 4);
                avlCoins3.put(5, 2);
                avlCoins3.put(2, 10);
                avlCoins3.put(1, 20);
                List<Integer> coins = makeChange(change, den, avlCoins3);
                System.out.println("Minimum coins for change is "+coins.size());
                System.out.println(coins);
                if(coins.isEmpty()){
                    System.out.println("Coins not available");
                }
            } else if (a == 4) {
                Map<Integer, Integer> avlCoins4 = new HashMap<>();
                int[] den = {20, 10, 5, 1};
                System.out.println("Enter the change");
                int change = s.nextInt();
                //availableCoins.put(50, 10);
                avlCoins4.put(20, 5);
                avlCoins4.put(10, 4);
                avlCoins4.put(5, 2);
                //availableCoins.put(2, 10);
                avlCoins4.put(1, 20);
                List<Integer> coins = makeChange(change, den, avlCoins4);
                System.out.println("Minimum coins for change is "+coins.size());
                System.out.println(coins);
                if(coins.isEmpty()){
                    System.out.println("Coins not available");
                }
            } else {
                System.exit(0);
            }
        }
    public static List<Integer> makeChange(int change,int[] den,Map<Integer,Integer> availableCoins) {
        List<Integer> coins = new ArrayList<>();
        for (int denomination : den) {
            while (change >= denomination && availableCoins.get(denomination) > 0) {
                change -= denomination;
                int newCount = availableCoins.get(denomination) - 1;
                availableCoins.put(denomination, newCount);
                coins.add(denomination);
            }
        }
        int sum = 0;
        for (int coin : coins) {
            sum += coin;
        }
        if (change != sum) {
            coins.removeAll(coins);
        }
            return coins;
    }
}
