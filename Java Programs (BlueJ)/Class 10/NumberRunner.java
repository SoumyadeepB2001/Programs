public class NumberRunner {
     public static void main(String args[]){
          int y = 2;
          System.out.println(getAnswer(y));
     }
     
     public static int getAnswer(int y){
          int x = getX();
          return x + y;
     }
 
     public static int getX(){
          return 3;
     }
}