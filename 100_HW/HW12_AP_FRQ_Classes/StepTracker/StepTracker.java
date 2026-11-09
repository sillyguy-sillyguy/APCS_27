public class StepTracker{
    int steps;
    int activeDays;
    double averageSteps;

    public Steptracker(){

    }
    public StepTracker(int steps){
        this.steps = steps;
        activeDays = (int)(steps/10000);
        averageSteps = steps/activeDays;
        return;
    }
    public int activeDays(){
        return activeDays;
    }
    public double averageSteps(){
        return averageSteps;
    }
    public void addDailySteps(int steps){
        this.steps += steps;
        activeDays += (int)(steps/10000);
        averageSteps = this.steps/activeDays;
        return;
    }
}