class Solution {
    static int maxSubArray(int[] nums) 
	{
       int max=Integer.MIN_VALUE;
       int curSum=0;
       int min=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            curSum=curSum+nums[i];
            if(nums[i]>min)
                min=nums[i];
            if(curSum>max)
                max=curSum;
            if(curSum<0)
                curSum=0;            
        }
        if(max>0)
            return max;
        else
            return min;
        
    }
	public static void main(String[] args) {
		int a1[]={-1,5,-8,5,2,1,-9};
		int a2[]={1,2,3,4,5,6};
		int a3[]={-1,-2,-3,-4,-5};
		System.out.println(maxSubArray(a1));
		System.out.println(maxSubArray(a2));
		System.out.println(maxSubArray(a3));
	}
}