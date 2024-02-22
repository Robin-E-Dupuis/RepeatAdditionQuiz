
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Robin dupuis
 */
public class RepeatAdditionQuiz {
    public static void main(String[] args) {
        ArrayList<Integer>answer= new ArrayList<Integer>();
         ArrayList<Integer>user= new ArrayList<Integer>();
        answer.add(14);
       Scanner input = new Scanner(System.in);
       int guess=0;
       do{
           System.out.println("What is 5+9 : ");
           guess=input.nextInt();
          
           if(guess!=answer.get(0)){
               System.out.println("Wrong answer Try Again");
           }
           if(user.contains(guess)){
               System.out.println("You already entered "+guess+" enter something else please.");
           }
           else{
               user.add(guess);
           }
       }while(guess!=answer.get(0));
        System.out.println("You got it!");
        
    }
}
