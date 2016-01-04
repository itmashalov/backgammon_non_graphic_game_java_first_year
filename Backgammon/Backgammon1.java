
/**
 * Write a description of class Backgammon1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Random;

public class Backgammon1
{
    // instance variables - replace the example below with your own
    private int x;
    private static int opt1;
    private static int i;
    private static int finish;
    private static int die1;
    private static int die2;
    private static int pl_2_kicked=0;
    private static String roll;
    
    
    static int a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,a13,a14,a15,a16,a17,a18,a19,a20,a21,a22,a23,a24;// these are the number of the checkers of every position
    static String[][] a = new String[24][2];
    /**
     * Constructor for objects of class Backgammon1
     */
    public Backgammon1()
    {
        // initialise instance variables
        x = 0;
        finish = 0;
        a1 = 2;//pl_1
        a2 = 0;
        a3 = 0;
        a4 = 0;
        a5 = 0;
        a6 = 5;//pl_2
        a7 = 0;
        a8 = 3;//pl_2
        a9 = 0;
        a10 = 0;
        a11 = 0;
        a12 = 5;//pl_1
        a13 = 5;//pl_2
        a14 = 0;
        a15 = 0;
        a16 = 0;
        a17= 3;//pl_1
        a18 = 0;
        a19 = 5;//pl_1
        a20 = 0;
        a21 = 0;
        a22 = 0;
        a23 = 0;
        a24 = 2;//pl_2
        
     }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
     public static void menu()
    {   
         System.out.print('\u000C');
         System.out.println("Press  1 to start a new game");
         opt1=Genio.getInteger();
         newGame();//Some ACTION!!!
         
          while(opt1!=1){
           
            System.out.print('\u000C');
            System.out.println("Invalid choice");
            System.out.println("Press 1 to start a new game");
            opt1=Genio.getInteger();
            
            if(opt1==1){
                 newGame();
            }
            
        }
        
    }
    
    
    public static void newGame()
    {   
        a1 = 2;//pl_1
        a2 = 0;
        a3 = 0;
        a4 = 0;
        a5 = 0;
        a6 = 5;//pl_2
        a7 = 0;
        a8 = 3;//pl_2
        a9 = 0;
        a10 = 0;
        a11 = 0;
        a12 = 5;//pl_1
        a13 = 5;//pl_2
        a14 = 0;
        a15 = 0;
        a16 = 0;
        a17= 3;//pl_1
        a18 = 0;
        a19 = 5;//pl_1
        a20 = 0;
        a21 = 0;
        a22 = 0;
        a23 = 0;
        a24 = 2;//pl_2
        
        
        a[0][0]=String.valueOf(a1);
        a[0][1]="pl_1";
        
        a[1][0]=String.valueOf(a2);
        a[1][1]="null";
        
        a[2][0]=String.valueOf(a3);
        a[2][1]="null";
        
        a[3][0]=String.valueOf(a4);
        a[3][1]="null";
        
        a[4][0]=String.valueOf(a5);
        a[4][1]="null";
        
        a[5][0]=String.valueOf(a6);
        a[5][1]="pl_2";
        
        a[6][0]=String.valueOf(a7);
        a[6][1]="null";
        
        a[7][0]=String.valueOf(a8);
        a[7][1]="pl_2";
        
        a[8][0]=String.valueOf(a9);
        a[8][1]="null";     
        
        a[9][0]=String.valueOf(a10);
        a[9][1]="null";
        
        a[10][0]=String.valueOf(a11);
        a[10][1]="null";
        
        a[11][0]=String.valueOf(a12);
        a[11][1]="pl_1";   
        
        a[12][0]=String.valueOf(a13);
        a[12][1]="pl_2";
        
        a[13][0]=String.valueOf(a14);
        a[13][1]="null";
        
        a[14][0]=String.valueOf(a15);
        a[14][1]="null";  
        
        a[15][0]=String.valueOf(a16);
        a[15][1]="null";
        
        a[16][0]=String.valueOf(a17);
        a[16][1]="pl_1";    
        
        a[17][0]=String.valueOf(a18);
        a[17][1]="null";
               
        a[18][0]=String.valueOf(a19);
        a[18][1]="pl_1";
        
        a[19][0]=String.valueOf(a20);
        a[19][1]="null";
        
        a[20][0]=String.valueOf(a21);
        a[20][1]="null";
        
        a[21][0]=String.valueOf(a22);
        a[21][1]="null";
        
        a[22][0]=String.valueOf(a23);
        a[22][1]="null";
        
        a[23][0]=String.valueOf(a24);
        a[23][1]="pl_2";
        
        drawBoard();    
        
        //player 1 start 
         player1Move();        
        //player 1 end 
        
        
        
        //player 2 start 
         player2Move();
        //player 2 end
    }
    
    public static void drawBoard()
    {   
         System.out.print('\u000C');
         System.out.println(" \n\n\n\n A13           A14         A15        A16         A17         A18     ||      A19           A20         A21        A22        A23         A24    ");
         System.out.println("  "+a[12][0]+"             "+a[13][0]+"           "+a[14][0]+"          "+a[15][0]+"           "+a[16][0]+"           "+a[17][0]+"      ||       "+a[18][0]+"             "+a[19][0]+"           "+a[20][0]+"          "+a[21][0]+"          "+a[22][0]+"           "+a[23][0]    );
         System.out.println("  "+a[12][1]+"          "+a[13][1]+"        "+a[14][1]+"       "+a[15][1]+"        "+a[16][1]+"        "+a[17][1]+"   ||       "+a[18][1]+"          "+a[19][1]+"        "+a[20][1]+"       "+a[21][1]+"       "+a[22][1]+"        "+a[23][1]    );
         System.out.println("                                                                      ||");   
         System.out.println("                                                                      ||player 1 hit checkers: "+pl_2_kicked);   
         System.out.println("                                                                      ||");   
         System.out.println("                                                                      ||");   
         System.out.println("                                                                      ||");   
         System.out.println("                                                                      ||");   
         System.out.println("                                                                      ||");   
         System.out.println(" A12           A11         A10        A9           A8          A7     ||       A6            A5          A4         A3         A2          A1    ");
         System.out.println("  "+a[11][0]+"             "+a[10][0]+"           "+a[9][0]+"         "+a[8][0]+"            "+a[7][0]+"           "+a[6][0]+"      ||       "+a[5][0]+"             "+a[4][0]+"           "+a[3][0]+"          "+a[2][0]+"          "+a[1][0]+"           "+a[0][0]    );
         System.out.println("  "+a[11][1]+"          "+a[10][1]+"        "+a[9][1]+"      "+a[8][1]+"         "+a[7][1]+"        "+a[6][1]+"   ||       "+a[5][1]+"          "+a[4][1]+"        "+a[3][1]+"       "+a[2][1]+"       "+a[1][1]+"        "+a[0][1]    );
               
    }
    
    public static int die1()
    {   
         Random generator1 = new Random();
         int die1 = generator1.nextInt(6) + 1;
         return die1;
    }
    
     public static int die2()
    {   
         Random generator2 = new Random();
         int die2 = generator2.nextInt(6) + 1;
         return die2;
    }
    
    public static void player1Move()
    {   
       System.out.println("\n\n-------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("\nPlayer 1 turn:");
        System.out.println("Press \"R\" to roll dice");
        roll=Genio.getString();
        while(!roll.equals("R") && !roll.equals("r")){
           
            System.out.print('\u000C');
            System.out.println("Press \"R\" to roll dice");
            
            roll=Genio.getString();
            
            
        }    
        System.out.print('\u000C');
        drawBoard(); 
        die1=die1();
        die2=die2();
        System.out.println("\nPlayer 1 turn:");
        System.out.println("\ndie1: " + die1 );
        System.out.println("die2: " + die2 );
        System.out.println("\nPlease choose number between 1 and 24 where you have checkers (for die1)");
        i=Genio.getInteger();
        
         while(i<0 || i >24 || a[i-1][1]!="pl_1" || (a[i-1+ die1][1]=="pl_2" && Integer.parseInt(a[i-1+ die1][0])>1) ){
           
            System.out.print('\u000C');
            drawBoard();
            System.out.println("\n\n\nInvalid choice");
            System.out.println("\nPlayer 1 turn:");
            System.out.println("die1: " + die1 );
            System.out.println("die2: " + die2 );
            System.out.println("\nPlease choose number between 1 and 24 where you have checkers (for die1)");
            i=Genio.getInteger();
        }    
        a[i-1][0]=String.valueOf(Integer.parseInt(a[i-1][0])-1);
        if( Integer.parseInt(a[i-1][0])==0){
        a[i-1][1]="null";    
            
        }    
        if(Integer.parseInt(a[i-1+ die1][0])==1){
            a[i-1+die1][0]=String.valueOf(Integer.parseInt(a[i-1+die1][0]));
            a[i-1+die1][1]="pl_1";
            pl_2_kicked= pl_2_kicked+1;
        }
        else{
            a[i-1+die1][0]=String.valueOf(Integer.parseInt(a[i-1+die1][0])+1);
            a[i-1+die1][1]="pl_1";
        }
        drawBoard(); 
        if(die1==die2){
            System.out.println("die1: " + die1 );
            System.out.println("die2: " + die2 );
            System.out.println("\nPlease choose number between 1 and 24 where you have checkers (for die1)");
            
            i=Genio.getInteger();
            
             while(i<0 || i >24 || a[i-1][1]!="pl_1" || (a[i-1+ die1][1]=="pl_2" && Integer.parseInt(a[i-1+ die1][0])>1) ){
               
                System.out.print('\u000C');
                drawBoard();
                System.out.println("\n\n\nInvalid choice");
                System.out.println("\nPlayer 1 turn:");
                System.out.println("die1: " + die1 );
                System.out.println("die2: " + die2 );
                System.out.println("\nPlease choose number between 1 and 24 where you have checkers (for die1)");
                i=Genio.getInteger();
            }    
            a[i-1][0]=String.valueOf(Integer.parseInt(a[i-1][0])-1);
            if( Integer.parseInt(a[i-1][0])==0){
            a[i-1][1]="null";    
                
            }    
            a[i-1+die1][0]=String.valueOf(Integer.parseInt(a[i-1+die1][0])+1);
            a[i-1+die1][1]="pl_1";
            drawBoard(); 
        }
        
        
        System.out.println("\n\n\ndie1: " + die1 );
        System.out.println("die2: " + die2 );
        System.out.println("\nPlease choose number between 1 and 24 where you have checkers (for die2)");
        i=Genio.getInteger();
        
         while(i<0 || i >24 || a[i-1][1]!="pl_1" || (a[i-1+ die2][1]=="pl_2" && Integer.parseInt(a[i-1+ die2][0])>1) ){
           
            System.out.print('\u000C');
            drawBoard();
            System.out.println("\n\n\nInvalid choice");
            System.out.println("\nPlayer 1 turn:");
            System.out.println("die1: " + die1 );
            System.out.println("die2: " + die2 );
            System.out.println("\nPlease choose number between 1 and 24 where you have checkers (for die2)");
            i=Genio.getInteger();
        }    
        a[i-1][0]=String.valueOf(Integer.parseInt(a[i-1][0])-1);
        if( Integer.parseInt(a[i-1][0])==0){
        a[i-1][1]="null";    
            
        }    
        a[i-1+die2][0]=String.valueOf(Integer.parseInt(a[i-1+die2][0])+1);
        a[i-1+die2][1]="pl_1";
        drawBoard(); 
        if(die1==die2){
            System.out.println("die1: " + die1 );
            System.out.println("die2: " + die2 );
            System.out.println("\nPlease choose number between 1 and 24 where you have checkers (for die2)");
            
            i=Genio.getInteger();
            
             while(i<0 || i >24 || a[i-1][1]!="pl_1" || (a[i-1+ die2][1]=="pl_2" && Integer.parseInt(a[i-1+ die2][0])>1) ){
               
                System.out.print('\u000C');
                drawBoard();
                System.out.println("\n\n\nInvalid choice");
                System.out.println("\nPlayer 1 turn:");
                System.out.println("die1: " + die1 );
                System.out.println("die2: " + die2 );
                System.out.println("\nPlease choose number between 1 and 24 where you have checkers (for die1)");
                i=Genio.getInteger();
            }    
            a[i-1][0]=String.valueOf(Integer.parseInt(a[i-1][0])-1);
            if( Integer.parseInt(a[i-1][0])==0){
            a[i-1][1]="null";    
                
            }    
            a[i-1+die2][0]=String.valueOf(Integer.parseInt(a[i-1+die1][0])+1);
            a[i-1+die2][1]="pl_1";
            drawBoard(); 
            
        }
        player2Move();   
    }
    
    public static void player2Move()
    {   
        System.out.println("\n\n-------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("\nPlayer 2 turn:");
        System.out.println("Press \"R\" to roll dice");
        if(pl_2_kicked<1){
        roll=Genio.getString();
        while(!roll.equals("R") && !roll.equals("r")){
           
            System.out.print('\u000C');
            System.out.println("Press \"R\" to roll dice");
            
            roll=Genio.getString();
            
            
        }    
        System.out.print('\u000C');
        drawBoard(); 
        die1=die1();
        die2=die2();
        System.out.println("\nPlayer 2 turn:");
        System.out.println("\ndie1: " + die1 );
        System.out.println("die2: " + die2 );
        System.out.println("\nPlease choose number between 1 and 24 where you have checkers (for die1)");
        i=Genio.getInteger();
       
             while(i<0 || i >24 || a[i-1][1]!="pl_2" || (a[i-1- die1][1]=="pl_1" && Integer.parseInt(a[(i-1) - (die1)][0])>1) ){
               
                System.out.print('\u000C');
                drawBoard();
                System.out.println("\n\n\nInvalid choice");
                System.out.println("\nPlayer 2 turn:");
                System.out.println("die1: " + die1 );
                System.out.println("die2: " + die2 );
                System.out.println("\nPlease choose number between 1 and 24 where you have checkers (for die1)");
                i=Genio.getInteger();
            }    
            a[i-1][0]=String.valueOf(Integer.parseInt(a[i-1][0])-1);
            if( Integer.parseInt(a[i-1][0])==0){
            a[i-1][1]="null";    
                
            }    
            a[i-1-die1][0]=String.valueOf(Integer.parseInt(a[i-1-die1][0])+1);
            a[i-1-die1][1]="pl_2";
            drawBoard(); 
            if(die1==die2){
                System.out.println("die1: " + die1 );
                System.out.println("die2: " + die2 );
                System.out.println("\nPlease choose number between 1 and 24 where you have checkers (for die1)");
                
                i=Genio.getInteger();
                
                 while(i<0 || i >24 || a[i-1][1]!="pl_2" || (a[i-1- die1][1]=="pl_1" && Integer.parseInt(a[i-1- die1][0])>1) ){
                   
                    System.out.print('\u000C');
                    drawBoard();
                    System.out.println("\n\n\nInvalid choice");
                    System.out.println("\nPlayer 2 turn:");
                    System.out.println("die1: " + die1 );
                    System.out.println("die2: " + die2 );
                    System.out.println("\nPlease choose number between 1 and 24 where you have checkers (for die1)");
                    i=Genio.getInteger();
                }    
                a[i-1][0]=String.valueOf(Integer.parseInt(a[i-1][0])-1);
                if( Integer.parseInt(a[i-1][0])==0){
                a[i-1][1]="null";    
                    
                }    
                a[i-1-die1][0]=String.valueOf(Integer.parseInt(a[i-1-die1][0])+1);
                a[i-1-die1][1]="pl_2";
                drawBoard(); 
            }
            
            
            System.out.println("\n\n\ndie1: " + die1 );
            System.out.println("die2: " + die2 );
            System.out.println("\nPlease choose number between 1 and 24 where you have checkers (for die2)");
            i=Genio.getInteger();
            
             while(i<0 || i >24 || a[i-1][1]!="pl_2" || (a[i-1- die2][1]=="pl_1" && Integer.parseInt(a[i-1- die2][0])>1) ){
               
                System.out.print('\u000C');
                drawBoard();
                System.out.println("\n\n\nInvalid choice");
                System.out.println("\nPlayer 2 turn:");
                System.out.println("die1: " + die1 );
                System.out.println("die2: " + die2 );
                System.out.println("\nPlease choose number between 1 and 24 where you have checkers (for die2)");
                i=Genio.getInteger();
            }    
            a[i-1][0]=String.valueOf(Integer.parseInt(a[i-1][0])-1);
            if( Integer.parseInt(a[i-1][0])==0){
            a[i-1][1]="null";    
                
            }    
            a[i-1-die2][0]=String.valueOf(Integer.parseInt(a[i-1-die2][0])+1);
            a[i-1-die2][1]="pl_2";
            drawBoard(); 
            if(die1==die2){
                System.out.println("die1: " + die1 );
                System.out.println("die2: " + die2 );
                System.out.println("\nPlease choose number between 1 and 24 where you have checkers (for die2)");
                
                i=Genio.getInteger();
                
                 while(i<0 || i >24 || a[i-1][1]!="pl_2" || (a[i-1- die2][1]=="pl_1" && Integer.parseInt(a[i-1- die2][0])>1) ){
                   
                    System.out.print('\u000C');
                    drawBoard();
                    System.out.println("\n\n\nInvalid choice");
                    System.out.println("\nPlayer 2 turn:");
                    System.out.println("die1: " + die1 );
                    System.out.println("die2: " + die2 );
                    System.out.println("\nPlease choose number between 1 and 24 where you have checkers (for die1)");
                    i=Genio.getInteger();
                }    
                a[i-1][0]=String.valueOf(Integer.parseInt(a[i-1][0])-1);
                if( Integer.parseInt(a[i-1][0])==0){
                a[i-1][1]="null";    
                    
                }    
                a[i-1-die2][0]=String.valueOf(Integer.parseInt(a[i-1-die1][0])+1);
                a[i-1-die2][1]="pl_2";
                drawBoard(); 
                
            }
            player1Move();
            
        }
    
   
        else{
                die1=die1();
                die2=die2();
                System.out.println("die1: " + die1 );
                System.out.println("die2: " + die2 );
                if( (Integer.parseInt(a[(24) - (die1)][0])<2) && pl_2_kicked >0 ){
                   a[(24) - (die1)][0]=  String.valueOf(Integer.parseInt(a[(24) - (die1)][0])+1);
                   a[(24) - (die1)][1]="pl_2";
                   pl_2_kicked=pl_2_kicked-1;
                }
                if( (Integer.parseInt(a[(24) - (die2)][0])<2) && pl_2_kicked >0 ){
                   a[(24) - (die2)][0]=  String.valueOf(Integer.parseInt(a[(24) - (die2)][0])+1);
                   a[(24) - (die2)][1]="pl_2";
                   pl_2_kicked=pl_2_kicked-1;
                }  
               
        }
        player1Move();
        
    }
}
