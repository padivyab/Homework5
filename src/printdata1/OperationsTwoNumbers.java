/*9.Write a Java program to print the result of the following operations.*/
package printdata1;

//class name
public class OperationsTwoNumbers {

    //main method
    public static void main(String args[])
    {
        int a= -5 + 8 * 6;  //Declare int is a datatype and a is variable name which store value.
        System.out.println("Expected Output : "+a);  //Printing statement which print following operation of three numbers.

        int b= (55 + 9) % 9;  //Declare int is a datatype and b is variable name which store value.
        System.out.println("Expected Output : "+b);  //Printing statement which print following operation of three numbers.

        int c= 20 + -3*5 / 8; //Declare int is a datatype and c is variable name which store value.
        System.out.println("Expected Output: "+c);  //Printing statement which print following operation of four numbers.

        int d= 5 + 15 / 3 * 2 - 8 % 3;  //Declare int is a datatype and d is variable name which store value.
        System.out.println("Expected Output: "+d);  //Printing statement which print following operation of six numbers.

    }
}
