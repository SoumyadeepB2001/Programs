class MultipleExceptionExample{    
    public static void main(String args[]){    
        try{    
            int array[] = new int[5];    
            array[10] = 30/0;    
        }    
        catch(ArithmeticException | ArrayIndexOutOfBoundsException e){  
            System.out.println("Exception thrown: "+e);  
        }    
     }    
}  