import java.util.Scanner;

public class ElectronicsShop {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int budget = scan.nextInt();
        int n = scan.nextInt();
        int m = scan.nextInt();

        int[] keyboards_prices = new int[n];
        int[] drives_prices = new int[m];

        for (int i = 0; i < n; i++)
            keyboards_prices[i] = scan.nextInt();
        for (int i = 0; i < m; i++)
            drives_prices[i] = scan.nextInt();

        int[] total_prices = new int[n * m];
        
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                total_prices[count] = keyboards_prices[i] + drives_prices[j];
                count++;
                if (count == n * m)
                    break;
            }
        }


            int[] things_i_can_buy = new int[m * n];

            for (int i = 0; i < m * n; i++) {
                if (total_prices[i] <= budget)
                    things_i_can_buy[i] = total_prices[i];
                else
                    things_i_can_buy[i] = 0;
            }
            int min_price = min(things_i_can_buy);
            if(budget < min_price || min_price == 0) //There is nothing to buy or minimum price is more expensive than budget
            	System.out.println(-1);
            else
            	System.out.println(max(things_i_can_buy));
    }
    public static int min(int[] arr) {
        int min_num = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min_num)
                return min_num = arr[i];
        }
        return min_num;
    }

    public static int max(int[] arr) {
        int max_num = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max_num <= arr[i]) {
                max_num = arr[i];
            }
        }
        return max_num;
    }
}
