/*
 Given an integer array nums that may contain duplicates, return all possible subsets (the power set).

The solution set must not contain duplicate subsets. Return the solution in any order.

 

Example 1:

Input: nums = [1,2,2]
Output: [[],[1],[1,2],[1,2,2],[2],[2,2]]
Example 2:

Input: nums = [0]
Output: [[],[0]]
 

Constraints:

1 <= nums.length <= 10
-10 <= nums[i] <= 10
 */

import java.util.*;
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ansList = new ArrayList<>();
        findSubsets(0,nums,new ArrayList<>(),ansList);
        return ansList;
    }
    
    public void findSubsets(int index, int[]nums, List<Integer> subsets, List<List<Integer>> ansList)
    {
        ansList.add(new ArrayList<>(subsets));
        
        for(int i=index;i<nums.length;i++)
        {
            if(i!=index && nums[i]==nums[i-1])
                continue;
            
            subsets.add(nums[i]);
            findSubsets(i+1, nums, subsets, ansList);
            subsets.remove(subsets.size()-1);
        }
    }
}
