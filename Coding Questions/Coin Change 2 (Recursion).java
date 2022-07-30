/*You are given an integer array coins representing coins of different denominations and an integer amount representing a total amount of money.

Return the number of combinations that make up that amount. If that amount of money cannot be made up by any combination of the coins, return 0.

You may assume that you have an infinite number of each kind of coin.

The answer is guaranteed to fit into a signed 32-bit integer. */

class Solution {
    int count=0;
    public int change(int amount, int[] coins) {
        int index=coins.length-1;

        find(coins, amount, index, 0);
        return count;
    }
    
    void find(int[]coins, int amount, int index, int sum)
    {
        if(sum==amount)
        {
            count++;
        }
        
        else if(sum>amount)
            return;
        
        else
        {
            //Picking up the element at this index
            //If we pick up the element at index i then we may or may not pick it up again at the next call because we can pick an element as many time as we want. Therefore index value will not change here
            find(coins, amount, index, sum+coins[index]);
            
            //Not picking up the value at this index
            //if index=0 then the recursion stops
            if(index!=0)
                find(coins, amount, index-1, sum);                
        }
    }

    
    public static void main(String[] args) {
        Solution ob = new Solution();
        int arr[]={3,5,7,8,9,10,11};
        System.out.println(ob.change(500,arr));
    }

}
