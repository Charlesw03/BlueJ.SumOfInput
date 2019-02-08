/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner; 
public class Main {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
       int userN ; 
       int sum = 0;
       
       System.out.println("Input a number");
        userN = in.nextInt();
       for( int i = 0; i <= userN; i++){
           sum += i;
        } 
        
       
       System.out.println("the sum is " + sum);
    }
}
