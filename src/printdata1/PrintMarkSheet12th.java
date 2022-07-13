package printdata1;

public class PrintMarkSheet12th {
    public static void main(String args[])
    {
        String name= "Divya Patel";
        int m1 = 45;
        int m2 = 67;
        int m3 = 50;
        int m4 = 55;
        int t1 = 100;
        int r1 = 16;
        int t2 = ((m1*2)+(m2*2)+(m3*2)+(m4*2));
        int t3 = (t1*7);
        //int per = (t2)

        System.out.println("        Gujarat Secondary and Higher Secondary Education Board          "); //Printing statement
        System.out.println("Student name: "+name);
        System.out.println("Roll No:      "+r1);
        System.out.println("-------------------------------------------------------");
        System.out.println("Subject            Total Marks           Obtained Marks");
        System.out.println("-------------------------------------------------------");
        System.out.println("Economics            "+t1+"               "+m1);
        System.out.println("Gujarati             "+t1+"               "+m4);
        System.out.println("English              "+t1+"               "+m3);
        System.out.println("Statistics           "+t1+"               "+m2);
        System.out.println("Accounting           "+t1+"               "+m2);
        System.out.println("Computer Theory      "+t1+"               "+m3);
        System.out.println("Computer Practical   "+t1+"               "+m4);
        System.out.println("-------------------------------------------------------");
        System.out.println("Total                "+t3+"               "+t2);

    }
}
