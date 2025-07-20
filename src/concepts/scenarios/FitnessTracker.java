package concepts.scenarios;

class UserProfile{
    private String name;
    private int age;
    private int dailyStepGoal;

    public UserProfile(String name, int age, int dailyStepGoal) {
        this.name = name;
        this.age = age;
        this.dailyStepGoal = dailyStepGoal;
    }

    public String getName() {
        return name;
    }

    public void getAge(int age) {
        if(age < 0){
            System.out.println("Invalid age");
        }else{
            this.age = age;
        }
    }

    public int getDailyStepGoal() {
        return dailyStepGoal;
    }
}
class FitnessStats extends UserProfile{
    private int stepsWalkedToday;

    public FitnessStats(String name, int age, int dailyStepGoal) {
        super(name, age, dailyStepGoal);
        this.stepsWalkedToday = 0;
    }

    public int getStepsWalkedToday() {
        return stepsWalkedToday;
    }

    public void setStepsWalkedToday(int stepsWalkedToday) {
        this.stepsWalkedToday = stepsWalkedToday;
    }

    public int stepsLeft(){
        return getDailyStepGoal() - getStepsWalkedToday();
    }
    public void checkGoalStats(){
        if(stepsWalkedToday >= getDailyStepGoal()){
            System.out.println("Goal achieved!");
        }else{
            System.out.println("Keep going! Only " + stepsLeft() + " steps left.");
        }
    }
}
public class FitnessTracker {
    public static void main(String[] args) {
        FitnessStats fitnessStats = new FitnessStats("Palak", 23, 15000);
        fitnessStats.checkGoalStats();
        fitnessStats.setStepsWalkedToday(1200);
        fitnessStats.checkGoalStats();
        fitnessStats.setStepsWalkedToday(15000);
        System.out.println("Total steps walked: " + fitnessStats.getStepsWalkedToday());
        fitnessStats.checkGoalStats();
    }
}
