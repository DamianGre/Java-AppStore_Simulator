import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Employees {
    String name;
    String projectCanWork;
    Boolean canBeHired = false;
    Boolean isHired = false;
    Boolean worksOnProject = false;
    Double dailySalary;
    Double projectSalary;
    Boolean isWorking;
    Project projectEmployerIsWorkingOn;
    Integer dayToCanBeFired = 5; // only after 5 days employer can be fired
    Integer workingOnProjectDays;
    Integer failureChanace;
    public Employees(String name, String projectCanWork ,Double dailySalary){
        this.name = name;
        this.projectCanWork = projectCanWork;
        this.dailySalary = dailySalary ;
    }


    public String toString(){
        return "Person's name: " + this.name + ". Known technologies: " + this.projectCanWork + ". Daily salary = " + this.dailySalary;
    }
}
