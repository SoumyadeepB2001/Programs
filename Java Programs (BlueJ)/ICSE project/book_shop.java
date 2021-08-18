import java.util.*;
class book_shop
{
    public static void main(String args[])
    {
        
        String book[]= {"ENGLISH GRAMMAR","ENGLISH LITERATURE","BENGALI","HISTORY","GEOGRAPHY","MATHEMATICS","COMPUTER","PHYSICS","CHEMISTRY","BIOLOGY"};
        int bp[]={200,160,210,330,300,350,300,320,220,200};
        String stat[]={"PENCIL BOX","RULERS","PEN","PENCIL","ERASER","BOOK COVERS","STAPLER","MARKER","GLUE","NOTE BOOK"};
        int sp[]={90,20,10,2,3,40,40,25,10,80};
        Scanner sc = new Scanner(System.in);
        int c,q,t=0,cc,qq;
        char ch,ch1;
        System.out.println("\t\tONLINE BOOK SHOP");
        System.out.println("-----------------------------------------------");
        System.out.println("LIST OF BOOKS AVAILABLE");
        System.out.println("-----------------------------------------------");
        System.out.println("CODE\t\tBOOKS            \tPRICE");
        System.out.println("-----------------------------------------------");
        System.out.println(" 1\t\tENGLISH GRAMMAR    \t 200"); 
        System.out.println(" 2\t\tENGLISH LITERATURE \t 160");  
        System.out.println(" 3\t\tBENGALI            \t 210"); 
        System.out.println(" 4\t\tHISTORY            \t 330");  
        System.out.println(" 5\t\tGEOGRAPHY          \t 300"); 
        System.out.println(" 6\t\tMATHEMATICS        \t 350"); 
        System.out.println(" 7\t\tCOMPUTER           \t 300");  
        System.out.println(" 8\t\tPHYSICS            \t 320"); 
        System.out.println(" 9\t\tCHEMISTRY          \t 220");  
        System.out.println(" 10\t\tBIOLOGY           \t 200");  
        System.out.println("-----------------------------------------------");
        System.out.println("LIST OF STATIONERY ITEMS AVAILABLE");
        System.out.println("-----------------------------------------------");
        System.out.println("CODE\t\tSTATIONARY       \tPRICE");
        System.out.println("-----------------------------------------------");
        System.out.println(" 1\t\tPENCIL BOX         \t 90"); 
        System.out.println(" 2\t\tRULERS             \t 20");  
        System.out.println(" 3\t\tPEN                \t 10"); 
        System.out.println(" 4\t\tPENCIL             \t 2");  
        System.out.println(" 5\t\tERASER             \t 3"); 
        System.out.println(" 6\t\tBOOK COVERS        \t 40");  
        System.out.println(" 7\t\tSTAPLER            \t 40"); 
        System.out.println(" 8\t\tMARKER             \t 25");
        System.out.println(" 9\t\tGLUE               \t 10"); 
        System.out.println(" 10\t\tNOTE BOOK          \t 80");
        System.out.println("-----------------------------------------------");
        do
        {
            System.out.println("ENTER CODE OF THE BOOK TO BE BOUGHT");
            c=sc.nextInt();
            System.out.println("ENTER QUANTITY OF THE BOOK TO BE BOUGHT");
            q=sc.nextInt();
            t=t+bp[c-1]*q;
            System.out.println("DO YOU WANT TO BUY ANY MORE BOOKS?");
            System.out.println("PRESS: Y TO BUY MORE BOOKS OR ANY OTHER KEY TO EXIT");
            ch1=sc.next().charAt(0);
        }
        while(ch1=='Y'||ch1=='y');
        do
        {
            System.out.println("ENTER CODE OF THE STATIONERY ITEM TO BE BOUGHT");
            cc=sc.nextInt();
            System.out.println("ENTER QUANTITY OF THE STATIONERY ITEM TO BE BOUGHT");
            qq=sc.nextInt();
            t=t+sp[cc-1]*qq;
            System.out.println("DO YOU WANT TO BUY ANY MORE STATIONERY?");
            System.out.println("PRESS: Y TO BUY MORE STATIONERY ITEMS OR ANY OTHER KEY TO EXIT");
            ch=sc.next().charAt(0); 
        }
        while(ch=='Y'||ch=='y');
            
        System.out.println("-----------------------------------------------");
        System.out.println("TOTAL AMOUNT = "+t);
        System.out.println("THANK YOU");
        System.out.println("-----------------------------------------------");
    }
}

            