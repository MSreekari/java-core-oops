package concepts.abstraction;

abstract class Course{
    private int completion;

    abstract void getContent();

    void calculateCompletion(int completion){
        switch (completion){
            case 100:
                System.out.println("Course is completed successfully");
                break;
            case 90, 80:
                System.out.println("Your very close to completion");
                break;
            case 70,60:
                System.out.println("Keep working");
                break;
            case 50:
                System.out.println("Your halfway there");
                break;
            case 40,30,20:
                System.out.println("Keep going");
                break;
            case 10:
                System.out.println("Consistency is the key");
                break;
        }
    }

    abstract void generateCertificate();
}
class JavaCourse extends Course{
    @Override
    void getContent() {
        System.out.println("Java Course");
    }

    @Override
    void generateCertificate() {
        System.out.println("Certificate generated for java course");
    }
}
class PythonCourse extends Course{
    @Override
    void getContent() {
        System.out.println("Python Course");
    }

    @Override
    void generateCertificate() {
        System.out.println("Certificate generated for python course");
    }
}
public class OnlineCoursePlatform {
    public static void main(String[] args) {
        JavaCourse javaCourse = new JavaCourse();
        PythonCourse pythonCourse = new PythonCourse();
        javaCourse.getContent();
        javaCourse.calculateCompletion(40);
        javaCourse.generateCertificate();
        System.out.println("------------------------------");
        pythonCourse.getContent();
        pythonCourse.calculateCompletion(60);
        pythonCourse.generateCertificate();
    }
}
