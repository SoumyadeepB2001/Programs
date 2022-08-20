/*
 Given an integer array nums of unique elements, return all possible subsets (the power set).

The solution set must not contain duplicate subsets. Return the solution in any order.

 

Example 1:

Input: nums = [1,2,3]
Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
Example 2:

Input: nums = [0]
Output: [[],[0]]
 

Constraints:

1 <= nums.length <= 10
-10 <= nums[i] <= 10
All the numbers of nums are unique.
 */
import java.util.*;
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subSetList =new ArrayList<>();
        List<Integer> subSets = new ArrayList<>();
        int size=nums.length;
        
        findSubsets(0,nums,size,subSetList,subSets);
        return subSetList;
    
    }
    
    void findSubsets(int index, int[]nums, int size, List<List<Integer>> subSetList, List<Integer>subSets)
    {
        if(index==size)
        {
            subSetList.add(new ArrayList<>(subSets));
            return;
        }
        
        //Pick the element at this index
        subSets.add(nums[index]);
        findSubsets(index+1, nums, size, subSetList, subSets);
            
        //Pick the element at this index
        subSets.remove(subSets.size()-1);
        findSubsets(index+1, nums, size, subSetList, subSets);   
    }
}