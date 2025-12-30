import java.util.*;
public class three_conditionalstatements_ifelse_switch_break {
    public static void main(String[] args) {


        //if else statements
        //example (1) - 
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt(); 
        if(age>18){
            System.out.println("Adult");

        }else{
            System.out.println("Not adult");
        }

        /* modulo operator - gives remainder (%) 
        example - check if entered number is odd or even x%2 */

        //else if statement
        //example (2)
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if(num1>num2){
            System.out.println("Number 1 is greater");
        }
        else if(num1==num2){
            System.out.println("Both are equal");
        }
        else{
            System.out.println("Number 2 is greater");
        }


        //switch statement
        int num3 = sc.nextInt();
        switch (num3) {
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Bonjour");
                break;
            default:
                System.out.println("Invalid Number");
                break;
        }





    }

    
}
