//samiullah:
//roll no 62:
import java.util.*;
public class task4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks Matric: ");
        int matric =sc.nextInt();
        System.out.print("Enter the marks Inter: ");
        int inter =sc.nextInt();
        System.out.print("Enter the test score: ");
        int test=sc.nextInt();
        double matricMarks =  (matric/850.0)*100;
        double totalMatricMarks=matricMarks*0.1;
        double interMarks = (inter/1100.0)*100;
        double totalMarksInter = interMarks*0.2;
        double testMarks = test*0.7;
        double p = totalMarksInter+totalMatricMarks+testMarks;
        System.out.println("Total percentage: "+p);
    }
}
