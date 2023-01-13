import java.util.*;
import java.util.ArrayList;

public class Project {
    String projectType;
    String projectName;
    String clientCompanyName;

    Employees employersIsWorkOnProject;
    Integer amtWorkDays;

    Boolean activeInWork = false;
    Boolean completed = false;
    Date finishDate;
    Double valueOfProject;
    Double deadLinePenalty;
    Integer paymentDays;
    Integer complexity; // 1=easy, 2=mid, 3=hard


    public Project(String projectName, String projectType,
                   String clientCompanyName, Integer amtWorkDays,
                   Double valueOfProject, Integer complexity) {
        this.projectName = projectName;
        this.clientCompanyName = clientCompanyName;
        this.amtWorkDays = amtWorkDays;
        this.valueOfProject = valueOfProject;
        this.projectType = projectType;
        this.complexity = complexity;
    }

    public void listRandomizer(List<Project> projects){

    }

    public String toString () {
        return "Project info - Name: " + this.projectName +". Project type(1..3): " + this.projectType + " . Company name: " + this.clientCompanyName + ". Work days to complete: " + this.amtWorkDays +
                ". Project Finish date: " + this.finishDate + ". Project Value: " + this.valueOfProject + ". Deadline penalty: " + this.deadLinePenalty +
                ". Payment will be proceed after: " + this.paymentDays + " days. ";
    }
}

