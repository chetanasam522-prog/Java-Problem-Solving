/** ========== Function And Method ==========
 
 # Function (Deffination):- Its the perticular block or code to perform the perticular function.
 # Method (Deffination):- A method in Java is a collection of statements that performs a particular operation and is executed when it is called.
   Syntax :-
   return type name(){
    // body
    return statement;
   }

 Ex= To print hello word
     public class javaBasics{
     public static void print HelloWord(){
       System.out.println("Hello Word");
       return 5;

     }
       public static void main(String args[]){
        print HelloWord();
       }
     }
------------------------------------------------------------------------------------------------------------------------------------------------------------
 # Syntax With Parameter :-
   Parameter :- A parameter is a variable that is used to receive values when a method is called.
 . General Syntax:-
     returnType methodName(dataType parameterName) {
    // method body
}
 
 . Syntax With Multiple Parameters:-
    returnType methodName(dataType param1, dataType param2) {
    // method body
} 

 Ex=  import java.util.*;
    public class Basics{
    public static void CalculateSum(int num1,int num2){
     int sum = num1 + num2;
      System.out.println("Sum is = "+sum);
    }
      public static void main(String args[]){
        Scanner Sc = new Scanner(System.in);
         // Take input form user
        int a= Sc.nextInt();
      int b= Sc.nextInt();
       CalculateSum(a,b);
      }
    }

-----------------------------------------------------------------------------------------------------------------------------------------------------------
    
 # Parameters:-
  1. Formal Parameter(Normal Parameter):-
  
 */
