abstract class Marks{
    public abstract double getPercentage();
}

class A extends Marks{
    private double subject1;
    private double subject2;
    private double subject3;

    public A(double subject1, double subject2, double subject3){
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }

    public double getPercentage(){
        double totalMarks = subject1 + subject2 + subject3;
        return (totalMarks/300)*100;
    }
}

class B extends Marks {
    private double subject1;
    private double subject2;
    private double subject3;
    private double subject4;

    public B(double subject1, double subject2, double subject3, double subject4) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
        this.subject4 = subject4;
    }

    public double getPercentage() {
        double totalMarks = subject1 + subject2 + subject3 + subject4;
        return (totalMarks / 400) * 100;
    }
}

public class PercentageCalculator {
    public static void main(String[] args) {
        A studentA = new A(85, 90, 92);
        B studentB = new B(78, 88, 92, 85);

        double percentageA = studentA.getPercentage();
        double percentageB = studentB.getPercentage();

        System.out.println("Percentage of Student A: " + percentageA + "%");
        System.out.println("Percentage of Student B: " + percentageB + "%");

    }
}