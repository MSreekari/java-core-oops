package concepts.classes_and_objects;

class Marks{
    int subject1;
    int subject2;
    int subject3;

    public Marks(int subject1, int subject2, int subject3) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }
    public double calculateAverage() {
        return (this.subject1 + this.subject2 + this.subject3) / 3.0;
    }
}
class Student{
    String name;
    int rollNo;
    Marks[] marks;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = new Marks[3];
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setMarks(Marks[] marks) {
        this.marks = marks;
    }

    public void displayResult(){
        for(int i = 0; i < marks.length; i++){
            if(marks[i] != null){
                System.out.println("Name: " + name);
                System.out.println("Roll No: " + rollNo);
                System.out.println("Subject1: " + marks[i].subject1);
                System.out.println("Subject2: " + marks[i].subject2);
                System.out.println("Subject3: " + marks[i].subject3);
                System.out.println("Average: " + marks[i].calculateAverage());
                if(marks[i].calculateAverage() >= 40){
                    System.out.println("Passed");
                }else{
                    System.out.println("Failed");
                }
                System.out.println("---------------");
            }
        }
    }
}
public class StudentGradeTracker {
    public static void main(String[] args) {
        Student student1 = new Student("Jack", 1);
        Marks[] jackMarks = new Marks[3];
        jackMarks[0] = new Marks(88, 75, 92);
        student1.setMarks(jackMarks);
        student1.displayResult();
        Student student2 = new Student("Payal", 2);
        Marks[] payalMarks = new Marks[3];
        payalMarks[0] = new Marks(78, 89, 90);
        student2.setMarks(payalMarks);
        student2.displayResult();
        Student student3 = new Student("Goyal", 3);
        Marks[] goyalMarks = new Marks[3];
        goyalMarks[0] = new Marks(95, 91, 93);
        student3.setMarks(goyalMarks);
        student3.displayResult();
    }
}
