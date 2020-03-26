import java.util.Scanner;
public class Interest {
    public static void main(String args[]) {
        Scanner userInput = new Scanner(System.in);
        float number1, number2, number3, number4, mind1, mind2, mind3, desired, result1, result2;
        
        System.out.println("Welcome to Intrest Calculator. To begin, input your initial deposit amount (principal sum) and click Enter.");
        number1 = userInput.nextFloat();
        System.out.println("Please input your interest rate in decimal form [eg. 0.02 instead of 2%.]");
        number2 = userInput.nextFloat();
        System.out.println("How many times per year is the interest compounded?");
        number3 = userInput.nextFloat();
        System.out.println("Over how many years will the interest be compounded?");
        number4 = userInput.nextFloat();
        
        mind1 = number2/number3 + 1;
        //System.out.println(mind1);
        mind2 = number3*number4;
        //System.out.println(mind2);
        mind3 = (float) Math.pow(mind1, mind2);
        //System.out.println(mind3);
        result1 = number1*mind3;
        result2 = result1-number1;
                
     do {  
            System.out.println("To obtain the total amount saved type 1, for interest only type 2");
            desired = userInput.nextFloat();
        if(desired==1)
        {
            //desired = userInput.nextFloat();
            System.out.printf("The total amount saved is %.2f %n", result1);
            System.out.println("Disclaimer: the actual amount saved may differ due to local tax laws");
            
        }
        else if(desired==2)
        {
            System.out.printf("The interest earned is %.2f %n", result2);
            System.out.println("Disclaimer: the actual amount saved may differ due to local tax laws");
        }
        else
        {
            desired = 3;
            System.out.println("Please input a valid operation");         
        }
        }while(desired==3);
    }    
    }
