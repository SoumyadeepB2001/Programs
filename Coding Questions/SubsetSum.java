//Given a list arr of N integers, print sums of all subsets in it.
import java.io.*;
import java.util.*;

class SubsetSum
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);

            System.out.println("Enter length of array");
            int N=sc.nextInt();
			ArrayList<Integer> arr = new ArrayList<>();
			for(int i = 0; i < N ; i++){
			    arr.add(sc.nextInt());
			}
            Solution ob = new Solution();
         
            ArrayList<Integer> ans = ob.subsetSums(arr,N);
            //Collections.sort(ans);
            for(int sum : ans){
                System.out.print(sum+" ");
            }
            System.out.println();
         sc.close();
    }
}


class Solution{
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        ArrayList<Integer> sumSubset = new ArrayList<>();
        func(0,0,arr,N,sumSubset);
        Collections.sort(sumSubset);
        return sumSubset;
    }
    void func(int index, int sum, ArrayList<Integer> arr, int N, ArrayList<Integer> sumSubset)
    {
        if(index==N)
        {
            sumSubset.add(sum);
            return;
        }
        //pick the element at this index
        func(index+1,sum+arr.get(index),arr,N,sumSubset);
        
        //Do not pick the element
        func(index+1,sum,arr,N,sumSubset);
    }
}