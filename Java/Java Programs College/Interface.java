interface Volume  
 {
  final static float pi = 3.14F;
  float calculate (float x , float y, float z);
 }

class Cuboid implements Volume      
 {
  public float calculate (float x, float y, float z)
  {
   return(x*y*z);
  }
}

 class Sphere implements Volume     
 {
  public float calculate (float x, float y, float z)
  {
   return((4/3)*pi*x*y*z);
  }  
 }
 class Interface
 {
  public static void main(String args[ ])
  {
    Cuboid cb = new Cuboid();
    Sphere sp = new Sphere();
               
    System.out.println("Volume of Cuboid = "+ cb.calculate(10.5f,20.1f,10.4f)); 

    System.out.println("Volume of Sphere = "+ sp.calculate(10.4f,10.4f,10.4f));
   }
  }
    
  