
import java.util.ArrayList;
import java.util.Collections;

Public class Essay1 {
    String CourseName;
    int SKS;
    int Grade;
    int WeightedScore;

    public Essay1(String a, int b, int c, int d) {
        this.CourseName= a;
        this.SKS = b;
        this.Grade = c;
        this.WeightedScore = d;
    }
    Public static void main(String[] args) throws Exception {
        ArrayList<Essay1> Students = new ArrayList<Essay1>();

        Students.add(new Essay1("Algorithm", b: 3, c:"a", d: 12));
        Students.add(new Essay1("Data Structures", b: 2, c:"b", d:6));
        Students.add(new Essay1("Databases", b: 3, c:"b", d: 12));
        Students.add(new Essay1("Programming", b:2, c:"b", d: 4));

        System.out.println("CourseName\tSKS\tGrade\tWeightScore");
        System.out.println("-----------------------------------------");
        for (Essay1 x: Students) {
            System.out.println(x.CourseName+"\t" + x.SKS + "\t" + x.Grade + "\t" + x.WeightedScore);
        }
        System.out.println("-----------------------------------------");
        System.out.println("Total\t\t10");
    }
}