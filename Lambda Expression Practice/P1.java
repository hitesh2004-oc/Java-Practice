package PracticeOfLambdaExp;

//...........[Easy Question]...........//
//(1) Find Length of Name ..//

interface I1 {
 void printStringLength(String s);
}
public class P1 {
 public static void main(String[] args) {

     I1 i1 = s -> 
     System.out.println("Name length:- " + s.length());

     // Calling the abstract method
     i1.printStringLength("Hitesh");
   }
}
