import java.util.*;
class SportsQuiz
{
   public static void main(String args [])
   {
    int n,score=0, ans,c=0;
    
    double b;
    Scanner sc =new Scanner(System.in);
    System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
    System.out.println("* Welcome to the Sports quiz designed & edited by Soumyadeep Banerjee                                   *");
    System.out.println("* This quiz consists of 5 simple questions on Sports & each question gives you 4 choices to answer from *");
    System.out.println("* Each question carries 5 points and for each wrong answer 2 marks will be deducted                     *");
    System.out.println("* So lets see how much can you score                                                                    *");
    System.out.println("* Enter 1 to take the quiz on Football                                                                  *");
    System.out.println("* Enter 2 to take the quiz on Cricket                                                                   *"); 
    System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
    n=sc.nextInt();
    System.out.println();
    
    switch(n)
    {
    case 1:
    
    System.out.println("Question 1");
    System.out.println("Which player has the highest number of goals in men's International association football?");
    System.out.println("1. Pele");
    System.out.println("2. Gerd Muller");
    System.out.println("3. Cristiano Ronaldo");
    System.out.println("4. Josef Bican");
    ans=sc.nextInt();
    if(ans!=3)
    {
    System.out.println("Sorry Wrong Answer");
    score-=2;
    }
    if(ans==3)
    {
    System.out.println("That's The Right Answer");
    score+=5;
    c++;
      }
    System.out.println("Your Score ="+score);
    System.out.println("Correct answers given = "+c);
    System.out.println("---------------------------------------------------------------------------------------------------");
    
    System.out.println("Question 2");
    System.out.println("Which is the homeground of Manchester United?");
    System.out.println("1. City of Manchester Stadium");
    System.out.println("2. Old Trafford");
    System.out.println("3. Stamford Bridge");
    System.out.println("4. King Power Stadium");
    ans=sc.nextInt();
    if(ans!=2)
    {
    System.out.println("Sorry Wrong Answer");
    score-=2;
     }
    if(ans==2)
    {
    System.out.println("That's The Right Answer");
    score+=5;
    c++;
      }
      System.out.println("Your Score ="+score);
      System.out.println("Correct answers given = "+c);
    System.out.println("---------------------------------------------------------------------------------------------------");
    
    System.out.println("Question 3");
    System.out.println("Which is the largest football stadium in Europe in terms of capacity?");
    System.out.println("1. Estadio Santiago Bernabeu");
    System.out.println("2. Stamford Bridge");
    System.out.println("3. Camp Nou");
    System.out.println("4. Old Trafford");
    ans=sc.nextInt();
    if(ans!=3)
    {
    System.out.println("Sorry Wrong Answer");
    score-=2;
     }
    if(ans==3)
    {
    System.out.println("That's The Right Answer");
    score+=5;
    c++;
      }
      System.out.println("Your Score ="+score);
      System.out.println("Correct answers given = "+c);
    System.out.println("---------------------------------------------------------------------------------------------------");
    
    System.out.println("Question 4");
    System.out.println("Who is the current President Of FIFA?");
    System.out.println("1. Michel Platini");
    System.out.println("2. Florentino Perez");
    System.out.println("3. Sepp Blatter");
    System.out.println("4. Gianni Infantino");
    ans=sc.nextInt();
    if(ans!=4)
    {
    System.out.println("Sorry Wrong Answer");
    score-=2;
     }
    if(ans==4)
    {
    System.out.println("That's The Right Answer");
    score+=5;
    c++;
      }
      System.out.println("Your Score ="+score);
      System.out.println("Correct answers given = "+c);
    System.out.println("---------------------------------------------------------------------------------------------------");
    
    System.out.println("Question 5");
    System.out.println("Who has scored highest number of goals as a goalkeeper?");
    System.out.println("1. Rogerio Ceni");
    System.out.println("2. Ivanovich Yashin");
    System.out.println("3. Gianluigi Buffon");
    System.out.println("4. Edwin van der Sar");
    ans=sc.nextInt();
    if(ans!=1)
    {
    System.out.println("Sorry Wrong Answer");
    score-=2;
     }
    if(ans==1)
    {
    System.out.println("That's The Right Answer");
    score+=5;
    c++;
      }
      System.out.println("Your Score ="+score);
     System.out.println("Correct answers given = "+c);
    System.out.println("---------------------------------------------------------------------------------------------------");
    break;
    
    
    
    case 2:

    System.out.println("Question 1");
    System.out.println("Who has won the ICC Player of the Year Award 2016?"); 
    System.out.println("1. Virat Kohli");
    System.out.println("2. AB de Villiers");
    System.out.println("3. Ravichandran Ashwin");
    System.out.println("4. Steven Smith");
    ans=sc.nextInt();
    if(ans!=3)
    {
    System.out.println("Sorry Wrong Answer");
    score-=2;
     }
    if(ans==3)
    {
    System.out.println("That's The Right Answer");
    score+=5;
    c++;
    }
    System.out.println("Your Score ="+score);
      System.out.println("Correct answers given = "+c);
    System.out.println("---------------------------------------------------------------------------------------------------");
    
    
    System.out.println("Question 2");
    System.out.println("Which player is considered as the God of Offside?");
    System.out.println("1. Sachin Tendulkar");
    System.out.println("2. Sourav Ganguly");
    System.out.println("3. Garry Sobers");
    System.out.println("4. Viv Richards");
    ans=sc.nextInt();
    if(ans!=2)
    {
    System.out.println("Sorry Wrong Answer");
    score-=2;
     }
    if(ans==2)
    {
    System.out.println("That's The Right Answer");
    score+=5;
    c++;
      }
      System.out.println("Your Score ="+score);
      System.out.println("Correct answers given = "+c);
      System.out.println("---------------------------------------------------------------------------------------------------");
      
      
      
    System.out.println("Question 3");
    System.out.println("Where did Sachin Tendulkar score his 100th century for India?");
    System.out.println("1. Wankhede Stadium");
    System.out.println("2. Adelaide Oval");
    System.out.println("3. Eden Gardens");
    System.out.println("4. Shere Bangla Stadium");
    ans=sc.nextInt();
    if(ans!=4)
    {
    System.out.println("Sorry Wrong Answer");
    score-=2;
     }
    if(ans==4)
    {
    System.out.println("That's The Right Answer");
    score+=5;
    c++;
      }
      System.out.println("Your Score ="+score);
      System.out.println("Correct answers given = "+c);
      System.out.println("---------------------------------------------------------------------------------------------------");
      
      
      System.out.println("Question 4");
    System.out.println("How many times did India play the ICC World Cup Final?");
    System.out.println("1. Once");
    System.out.println("2. Twice");
    System.out.println("3. Thrice");
    System.out.println("4. Four times");
    ans=sc.nextInt();
    if(ans!=3)
    {
    System.out.println("Sorry Wrong Answer");
    score-=2;
     }
    if(ans==3)
    {
    System.out.println("That's The Right Answer");
    score+=5;
    c++;
      }
      System.out.println("Your Score ="+score);
      System.out.println("Correct answers given = "+c);
      System.out.println("---------------------------------------------------------------------------------------------------");
      
      
       System.out.println("Question 5");
    System.out.println("Who was the first player to run out the non striking batsman before bowling his delivery?");
    System.out.println("1. Mohinder Amarnath");
    System.out.println("2. Kapil Dev");
    System.out.println("3. Vinoo Mankad");
    System.out.println("4. Mohammad Kaif");
    ans=sc.nextInt();
    if(ans!=3)
    {
    System.out.println("Sorry Wrong Answer");
    score-=2;
     }
    if(ans==3)
    {
    System.out.println("That's The Right Answer");
    score+=5;
    c++;
      }
      System.out.println("Your Score ="+score);
      System.out.println("Correct answers given = "+c);
      System.out.println("---------------------------------------------------------------------------------------------------");
      break;
      default:
      System.out.println("Wrong Input");
      System.out.println("---------------------------------------------------------------------------------------------------");
    }

      
     
    System.out.println ("YOUR RESULT");
    System.out.println("SCORE = "+score);
    if(score>=-10 && score<=0)
    {
        System.out.println("GRADE = VERY POOR");
        }
        if(score>0 && score<=10)
        {
        System.out.println("GRADE = AVERAGE");
        }
        if(score>10 && score<=20)
        {
        System.out.println("GRADE = GOOD");
        if(score>20 && score<=25)
         {
          System.out.println("GRADE = EXCELLENT");
        }
        }
    }
   }
 

