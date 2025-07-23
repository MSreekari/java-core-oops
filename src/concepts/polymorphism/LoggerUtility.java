package concepts.polymorphism;

class Log{
    private String message;
    private int level;
    private String moduleName;

    public Log(String message, int level, String moduleName){
        this.message = message;
        this.level = level;
        this.moduleName = moduleName;
    }

    public String getMessage() {
        return message;
    }

    public int getLevel(int level){
        return  level;
    }

    public String getModuleName(){
        return moduleName;
    }

    public void log(String message){
        System.out.println("THe message is: " + message);
        System.out.println();
    }

    public void log(String message, int level){
        System.out.println("The message is: " + message);
        System.out.println("The level is: " + level);
        System.out.println();
    }

    public void log(String message, int level, String moduleName){
        System.out.println("The message is: " + message);
        System.out.println("The level is: " + level);
        System.out.println("The moduleName is: " + moduleName);
    }
}
public class LoggerUtility {
    public static void main(String[] args) {
        Log log1 = new Log("Message1", 4, "module1");
        log1.log("Message1");
        log1.log("Message1", 4);
        log1.log("Message1", 4, "module1");
    }
}
