/*
 * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.

 

Example 1:

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Explanation: 
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter.
Example 2:

Input: nums = [0,1,1]
Output: []
Explanation: The only possible triplet does not sum up to 0.
Example 3:

Input: nums = [0,0,0]
Output: [[0,0,0]]
Explanation: The only possible triplet sums up to 0.
 

Constraints:

3 <= nums.length <= 3000
-105 <= nums[i] <= 105
 */

import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> ans = new ArrayList<>();
        
        Arrays.sort(nums);
        
        int len = nums.length;
        
        for(int i=0; i<len; i++)
        {
            int first=i+1, last=len-1;
            
            while(first<last)
            {
                
                
                if(nums[first]+nums[last]==-nums[i])
                {
                    List<Integer> triplets = new ArrayList<>();
                    triplets.add(nums[i]);
                    triplets.add(nums[first]);
                    triplets.add(nums[last]);
                    ans.add(triplets);
                    
                    while(first+1<last && nums[first]==nums[first+1])
                        first++;
                    
                    while(last-1>first && nums[last]==nums[last-1])
                        last--;
                    
                    first++;
                    last--;
                }
                
                 else if(nums[first]+nums[last] < -nums[i]) 
                     first++;
                 else 
                     last--;
                
                
                
                
            }
            while(i+1<len && nums[i+1]==nums[i]) 
                    i++;
        }
        
        return ans;
    }
}