import java.util.*;
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        boolean freq[]=new boolean[nums.length];
        List<Integer> ds = new ArrayList<>();
        find(nums, ds, ans, freq);
        return ans;
    }
    
    public void find(int[] nums, List<Integer> permutation, List<List<Integer>> ans, boolean [] freq) {
        if(permutation.size()==nums.length)
        {
            ans.add(new ArrayList<>(permutation));
            return; 
        }
        
        for(int i=0;i<nums.length;i++)
        {
            if(!freq[i])
            {
                permutation.add(nums[i]);
                freq[i]=true;
                find(nums,  permutation,ans, freq);
                permutation.remove(permutation.size()-1);
                freq[i]=false;
            }
        }
        
    }
    public static void main(String[] args) {
        Solution ob=new Solution();
        int[]ar={1,2,3};
        System.out.println(ob.permute(ar));
    }
}