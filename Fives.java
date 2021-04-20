//Connor Johnston

import java.util.Scanner;

public class Fives
{
    public static void main(String[] args)
    {
//Var.s
        int answer, count = 0, counter = 0, sumthin = 0, pre, x, y;
    //I know you asked us to start at 5, but I'm smug like that, I'm starting at 0.
        Scanner listen = new Scanner(System.in);
        
        System.out.println("Do you want the actual assignment? Again, 1 for yes, 0 for no" + '\n');
        answer = listen.nextInt();
        System.out.println('\n');

//Well just what in the world are you doing in here little, random while?
while(true){
        if (answer == 1){
            while (count != 505){
            
            
            System.out.print(count + " ");
            if (count >= 5 && count <= 100){
                System.out.print(" ");
            }
            if (count == 50 || count == 100 || count == 150 || count == 200 || count == 250 || count == 300 || count == 350 || count == 400 || count == 450 || count == 500){
            System.out.println('\n');
            if (count < 455){
                System.out.println("———————————————————————————————————————");
            }
            }
            
            count = count + 5;
            counter++;

            }
                System.exit(0);
        }
        else
        
       
        System.out.println("Go to line 60 and read, it will explain" + '\n' + "until then enjoy this:");
        
        if(sumthin == 1){
            System.exit(0);
        }
        
        try{Thread.sleep(4000);}catch(InterruptedException ex){Thread.currentThread().interrupt();}
        
        answer = 1;
        sumthin = 1;
}





//          The rest of the code is a proof of concept

/*
        else
        
        
        System.out.println("(Max count to amount is 2,000)" + '\n' + "1. Do you want a max using x amount of runs, counting by y amount" + '\n' + "2. Do you want to count up to x amount, counting by y amount");
        pre = listen.nextInt();
        
        System.out.println('\n');
        
        System.out.print("x = ");
        x = listen.nextInt();
        
        System.out.print("y = ");
        y = listen.nextInt();
        
        System.out.println('\n');


//Input
        while(count != x || count != 2000 || count != x * y)
        {
            if (pre == 2){
            
            
//I could make a loop that / y by 2 mulipy times to get the run time
//And do a lot of other things but currently I'm burnt out.
//The funny thing is that java is the only language that I that makes me
//Tried... java... like the coffee? Hmmmmmmmmm, interesting


            if (count == 50 || count == 100 || count == 150 || count == 200 || count == 250 || count == 300 || count == 350 || count == 400 || count == 450 || count == 500){
            System.out.println("Your on run " + counter + " of the loop." + '\n' + "That means the count (by 5's) is " + count);
            System.out.println("————————————————————————————————————");
            System.out.println('\n');
            }

            }
            count = count + 5;
            sumthin = count - 4;
            counter++;
            
        }
*/
    }
}