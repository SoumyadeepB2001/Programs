import java.util.*;
 class Main {
   static List multi_dimensional() {
      ArrayList<ArrayList<Integer> > x = new ArrayList<ArrayList<Integer> >();
      x.add(new ArrayList<Integer>());  //Inner List 1
      x.add(new ArrayList<Integer>());  //Inner List 2
      x.get(0).add(0, 45);
      x.get(0).add(1, 466);
      x.get(1).add(0,12);
      x.get(0).add(2, 255);
      x.get(1).add(1,145);
      x.add(new ArrayList<Integer>());  //Inner List 3
      x.get(2).add(0,14);
    
      return x;
   }
   public static void main(String args[]) {
      System.out.println("The multidimensional arraylist is :");
      System.out.println(multi_dimensional());
   }
}