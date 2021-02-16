package e011.inheritance;

public class Student extends Person {
    public static void main(String[] args) {
        

    }
    private int[] testScores ;

    public Student(String firstName, String lastName, int identification, int[] testScores) {
        super(firstName, lastName, identification);
        this.testScores = testScores;
    }

    public char calculate() {
        testScores  = Student.this.testScores;
        int s = 0;
        int k = 0;
        int a;
        char c;
        for (int i = 0; i < testScores.length; i++) {
            s = s + testScores[i];
            k = k + 1;
        }
        a = s / k;
        if (90 <= a && a <= 100) {
            c = 'O';
        } else if (80 <= a && a < 90) {
            c = 'E';
        } else if (70 <= a && a < 80) {
            c = 'A';
        } else if (55 <= a && a < 70) {
            c = 'P';
        } else if (40 <= a && a < 55) {
            c = 'D';
        } else {
            c = 'D';
        }
        return c;

    }


}
