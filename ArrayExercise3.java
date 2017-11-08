
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/*****************************************************************
*Programmer:        Erika Tvaskis
*Class:             CS30S Section 007
*Assignment:        Array Exercises One Program 3
*Description:       Gets x amount of random numbers and used them in calculations            
*Input:             How many random numbers you want and their maximum                                                     
*Output:            Sum, Average, Maximum Value, and Minimum Value                          
******************************************************************/

public class ArrayExercise3 
{   
    static int MAX = 10;
    
    public static void main(String[] args) 
    { //begin main
    
//DECLARE VARIABLES
    
    Random r = new Random();                    //Create new random object
    Scanner Scanner = new Scanner(System.in);   //Declaring Scanner
    int[] list;                                 //Declaring and Allocating new array
            
    int RandomNumber = 0;   //Declaring RandomNumber as int
    int Counter;            //Counter for loops
    int Sum = 0;            //Declaring Sum as int
    int MaxValue = 0;       //Declaring MaxValue as int
    int MinValue = 100;     //Declaring MinValue as int       
    int a;                  //Declaring a as int
    int MAXRAND;            //Declaring MAXRAND as int
    int NumbersUsed = 0;    //Declaring NumbersUsed as int
    
    double Average = 0;     //Declaring Average as double
    
    String ContinueOrStop;  //Declaring ContinueOrStop as String
    String EntireLoopOrNot; //Declaring EntireLoopOrNot as String
        
//BANNER

    ProgramInfo Banner = new ProgramInfo("Array Exercises One", " Program 3"); 
    //Object that prints banner
    ProgramInfo EndOfProgram = new ProgramInfo();
    System.out.println(Banner.toString());  
    //Prints banner

//SCANNER TO SET MAX FOR ARRAY AND RANDOM NUMBERS
//USING TRY CATCH TO ELIMINATE ERRORS

    System.out.println("Enter how many numbers you want to load");    
    //Prints this
    
    try {   
        //Try
        MAX = Integer.parseInt(Scanner.nextLine());
        //Setting MAX to entered number
    }   //Closing bracket for try statement
    catch (NumberFormatException e) {                             
        //Catch number format exception
        System.out.println("Error, please enter a numeric value");                             
        //Prints this
        System.out.println("The Error: " + e); 
        //Prints error
        return; 
        //Stops the program if catch statement catches error
    }   //Closing bracket for catch statement 
    
    list = new int[MAX];
    //Making MAX be the number of ints array has
    System.out.println("Enter largest possible generated number");
    //Prints this
    
    try {   
        //Try
        MAXRAND = Integer.parseInt(Scanner.nextLine());
        //Setting MAXRAND to enetered number
    }   //Closing bracket for try statement
    catch (NumberFormatException e) {                             
        //Catch number format exception
        System.out.println("Error, please enter a numeric value");                             
        //Prints this
        System.out.println("The Error: " + e); 
        //Prints error
        return; 
        //Stops the program if catch statement catches error
    }   //Closing bracket for catch statement 
    
//LOOPS    
     
    Counter = 0;				//Prime conrol variable
    a = 0;                                      //Prime conrol variable
    
    for(int i = 0; i < MAX;i++) {               
    //For loop               
        while (a == 0) {                        
        //While loop
            System.out.println("Enter 1 if you want the entire loop loaded, or anyhting else if not");
            //Prints this
            EntireLoopOrNot = Scanner.nextLine();
            //Reads entered string
                if (EntireLoopOrNot.equals("1")) {   
                //If enetered 1
                    a = 2;  //Sets a to two
                }           //Closing bracket for if statement
                else {      //Else
                    a = 1;  //Sets a to one
                }   //Closing bracket for else statement
        }   //Closing bracket for while loop
     	RandomNumber = r.nextInt(MAXRAND);
        //Generates random number and assigns to RandomNumber variable
        //MAXRAND is the maximum the random number can be
     	list[i] = RandomNumber;
        //RandomNumber = element number i of the array (list)
     	Counter++;
    }   //End loop
    
    for(int i = 0; i < Counter; i++){
    //For loop
        System.out.println((i + 1) + ": = " + list[i]);
        //Prints this
        Sum = Sum + list[i];
        //Sum = (itself) + RandomNumber (based on iteration number)
        Average = (double) Sum/(i+1);
        //Average = Sum divided by i + 1
        //Making answer a double
        Average = Math.round(Average * 100.0) / 100.0;
        //Rounding to two decimal places
        NumbersUsed = i + 1;
        //NumbersUsed in calculations equals i + 1
            if (list[i] > MaxValue) {   //If RandomNumber is greater than MaxValue
                MaxValue = list[i];     //MaxValue = that RandomNumber
            }                           //Closing bracket for if statement
            if (list[i] < MinValue) {   //If RandomNumber is less than MinValue
                MinValue = list[i];     //MinValue = that RandomValue
            }                           //Closing bracket for if statement
            if (a == 1) {               //If a = 1
                
                System.out.println("Click enter to continue , type 0 to stop");
                //Prints this
                ContinueOrStop = Scanner.nextLine();
                //ContinueOrStop equals typed in string
                if (ContinueOrStop.equals("0")) {
                //If ContinueOrStop equals "0"
                    i = Counter;
                    //i = Counter
                }   //Closing bracket for if statement (if ContinueOrStop equals "0")
            }   //Closing bracket for if statement (if a equals 1)
    }   //End for loop (for(int i = 0; i < Counter; i++))
   
//PRINTING

    System.out.println("");
    System.out.println("***********************");
    System.out.println("Numbers used: " + NumbersUsed);
    System.out.println("Sum: " + Sum);
    System.out.println("Average: " + Average);
    System.out.println("Maximum Value: " + MaxValue);
    System.out.println("Minimum Value: " + MinValue);
    System.out.println("***********************");
    //Prints
    
//CLOSING MESSAGE
	   
    System.out.println("End of processing");
    //Prints
    
} //End main
    
} //End public class
    