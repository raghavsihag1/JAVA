import java.util.*;

public class two_inputoutput_variables {
    public static void main(String[] args) {
        //output
        //println takes you to new line but print doesnt
        //or simply use \n
        //print is a function

        System.out.println("Hello World, today will learn about Input output and vairables");
        //is same as
        System.out.print("Hello World, today will learn about Input output and vairables\n");
        //\n can be used in between sentences as many times we need

        //variables in JAVA
        //Declaration of variables
        String s = "Raghav Sihag";
        int a = 10;
        
        /*Data types in JAVA
        Java is a typed language which means datatypes should be declared first
        -> Primitive-basic data types
        ->NonPrimitive-customizable data types */

        //Primitive Data Types
        /* (for 64bit systems)
        1)byte - takes 1byte
        2)short
        3)char - take 2bytes
        4)boolean - takes 1byte
        5)int - takes 4bytes
        6)long - takes 8bytes
        7)float - takes 4bytes
        8)double - takes 8bytes 
        */

        //NonPrimitive Data Types
        /*
        1)String
        2)Array
        3)Class
        4)Object
        5)Interface
         */

        //example
 
        int x = 10;
        int y = 20;
        int sum = x+y;

        System.out.println(sum);

        //priorites left to write in JAVA
        // (* / %) > ( + - )


        //inputs in JAVA
        //import java.util.*

        Scanner sc = new Scanner(System.in);
        String name = sc.next(); //single word will be taken during print
        //for taking whole line use sc.nextLine()
        //nextInt()
        //nextFloat()
        System.out.println(name);




    }
}
