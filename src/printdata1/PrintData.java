/*12.Write a Java program to compute the specified expressions and print the
        output.
        Test Data: ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) */
package printdata1;

//class name
public class PrintData {
    //main method
    public static void main(String args[])
    {
        double d = 25.5d;
        double d1= 3.5d;
        //double d2= 3.5d;
        //double d3= 3.5d;
        double d4= 40.5d;
        double d5= 4.5d;
        double d6= (((d * d1 - d1 * d1) / (d4 - d5)));
        System.out.println("Expected output:\n "+ d6);

        //System.out.println("Expected Result: "+((d * d1 - d1 * d1) / (d4 - d5)));

    }
}
