/*14.Make your 10th and 12th marksheets on your own. “BE CREATIVE”
All marks in your marksheets has to be in form of variables.*/
package printdata1;

//class name
public class PrintMarkSheet10th {
    //main method
    public static void main(String args[])
    {
        /* display all variable*/
        String name= "Divya Patel";
        int m1 = 45;
        int m2 = 40;
        int m3 = 50;
        int m4 = 35;
        int t1 = 100;
        int r1 = 16;
        int t2 = ((m1*2)+(m2*2)+(m3*2)+(m4*2));
        int t3 = (t1*8);
        //int per = (t2)

        System.out.println("        Gujarat Secondary and Higher Secondary Education Board          "); //Printing statement
        System.out.println("Student name: "+name);
        System.out.println("Roll No:      "+r1);
        System.out.println("----------------------------------------");
        System.out.println("Subject      Total Marks  Obtained Marks");
        System.out.println("----------------------------------------");
        System.out.println("Hindi            "+t1+"            "+m1);
        System.out.println("Gujarati         "+t1+"            "+m4);
        System.out.println("English          "+t1+"            "+m3);
        System.out.println("Social Science   "+t1+"            "+m2);
        System.out.println("Mathematics      "+t1+"            "+m1);
        System.out.println("Sanskrit         "+t1+"            "+m2);
        System.out.println("Computer         "+t1+"            "+m3);
        System.out.println("Computer Practical"+t1+"           "+m4);
        System.out.println("----------------------------------------");
        System.out.println("Total            "+t3+"            "+t2);
        //System.out.println("Pert");






    }

}
