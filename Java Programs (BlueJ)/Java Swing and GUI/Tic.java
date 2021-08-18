import java.util.*;
class Tic
{
    char A[]=new char[9]; 
    int c,i;
    Tic()
    {
        for(i=0;i<9;i++)
            A[i]=' ';
        c=0;
    }
    int output(int a)
    {
        if(c%2!=0)
        {
            A[a-1]='X';
        }
        else
        {
            A[a-1]='O';
        }
        System.out.println(A[0]+"  |  "+A[1]+"  |  "+A[2]);
        System.out.println("___|_____|___");
        System.out.println(A[3]+"  |  "+A[4]+"  |  "+A[5]);
        System.out.println("___|_____|___");
        System.out.println(A[6]+"  |  "+A[7]+"  |  "+A[8]);
        c++;
        return c;   
    }
    void input()
    {
        int a,b;
        Scanner sc = new Scanner(System.in);
        String p1="",p2="";
        System.out.println("Player 1 Enter your name");
        p1=sc.nextLine();
        System.out.println("Player 2 Enter your name");
        p2=sc.nextLine();
        System.out.println(p1+" is 'X' and " +p2+" is 'O'");
        for(i=1;i<=9;i++)
        {
            if(i%2!=0)
            {
                System.out.println(p1+" enter the position:");
                a=sc.nextInt();
            }
            else
            {
            System.out.println(p2+" enter the position:");
            a=sc.nextInt();
            }
            b=output(a);
        
            if((A[0]=='X'&&A[1]=='X'&&A[2]=='X')||(A[3]=='X' && A[4]=='X'&&A[5]=='X')||(A[6]=='X'&&A[7]=='X'&&A[8]=='X')||(A[0]=='X'&&A[3]=='X'&&A[6]=='X')||(A[1]=='X'&&A[4]=='X'&&A[7]=='X')||(A[2]=='X'&&A[5]=='X'&&A[8]=='X')||(A[0]=='X'&&A[4]=='X'&&A[8]=='X')||(A[2]=='X'&&A[4]=='X'&&A[6]=='X'))
                {System.out.println(p1+" Wins");
                break;
            }
            else if((A[0]=='O'&&A[1]=='O'&&A[2]=='O')||(A[3]=='O' && A[4]=='O'&&A[5]=='O')||(A[6]=='O'&&A[7]=='O'&&A[8]=='O')||(A[0]=='O'&&A[3]=='O'&&A[6]=='O')||(A[1]=='O'&&A[4]=='O'&&A[7]=='O')||(A[2]=='O'&&A[5]=='O'&&A[8]=='O')||(A[0]=='O'&&A[4]=='O'&&A[8]=='O')||(A[2]=='O'&&A[4]=='O'&&A[6]=='O'))     
               { System.out.println(p2+" Wins");
                break;
            }
                else if(b==9)
                {System.out.println("Tie");
                break;
            }
        }
    }
    public static void main(String args[])
    {
        Tic ob = new Tic();
        ob.input();
    }}
                
                
            
            
            