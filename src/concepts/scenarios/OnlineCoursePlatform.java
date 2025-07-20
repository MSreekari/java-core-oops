package concepts.scenarios;

class User{
    private String username;
    private String email;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        if(email == null){
            System.out.println("Email is null");
        }else{
            this.email = email;
        }
    }
}
class Instructor extends User{
    private int courseContent;

    public Instructor(String username, String email) {
        super(username, email);
    }
    public int getCourseContent() {
        return courseContent;
    }

    public boolean canCreateNewcourse(){
        return courseContent < 5;
    }

    public void setCourseContent(int courseContent) {
        if(getUsername() == null || getEmail() == null){
            System.out.println("Instructor: Username or email is null!");
        }else{
            this.courseContent = courseContent;
        }
    }
}
public class OnlineCoursePlatform {
    public static void main(String[] args) {
        Instructor instructor1 = new Instructor("Palak", "palak245@gmail.com");
        System.out.println("Instructor Name: " + instructor1.getUsername());
        System.out.println("Instructor Email: " + instructor1.getEmail());
        System.out.println("Instructor " + instructor1.getUsername() + " can create a new course: " + instructor1.canCreateNewcourse());
        instructor1.setCourseContent(3);
        System.out.println("Instructor " + instructor1.getUsername() + " course content is set to: " + instructor1.getCourseContent());
    }
}
