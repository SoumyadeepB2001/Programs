//https://leetcode.com/problems/pascals-triangle/
class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        int sum;
    List<List<Integer>> x= new ArrayList<List<Integer>>();
    x.add(new ArrayList<Integer>());  //Inner List 1
    
    x.get(0).add(0,1); //First Row
        if(numRows==1)
            return x;
        x.add(new ArrayList<Integer>());  //Inner List 2
    x.get(1).add(0,1); //Second Row
    x.get(1).add(1,1); //Second Row
        if(numRows==2)
            return x;

        
 for(int i=2;i<numRows;i++) //Start from third row (index 2) as first 2 rows have been stored already
 {
     
     x.add(new ArrayList<Integer>()); //Inner list at index i
     x.get(i).add(0,1);
     
     for(int j=1;j<i;j++)
     {
         
         sum=x.get(i-1).get(j)+x.get(i-1).get(j-1);
         x.get(i).add(j,sum);
     }
     x.get(i).add(i,1);
 }
            
        
        
        return x;
    }
}