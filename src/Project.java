import java.util.*;
import java.util.ArrayList;

public class Project {

    public enum ProjectType {
        Frontend,
        Backend,
        Database,
        Wordpress,
        Pretashop,

        Mobile;
    }
    String projectName;
    String clientCompanyName;

    Integer amtWorkDays;

    ProjectType projectType;
    ProjectType projectType2;
    ProjectType projectType3;
    Date finishDate;
    Double valueOfProject;
    Double deadLinePenalty;
    Integer paymentDays;
    Integer complexity; // 1=easy, 2=mid, 3=hard


    public Project(String projectName, ProjectType projectType, ProjectType projectType2, ProjectType projectType3,
                   String clientCompanyName, Integer amtWorkDays,
                   Double valueOfProject, Double deadLinePenalty,
                   Integer paymentDays, Integer complexity) {
        this.projectName = projectName;
        this.projectType = projectType;
        this.projectType2 = projectType2;
        this.projectType3 = projectType3;
        this.clientCompanyName = clientCompanyName;
        this.amtWorkDays = amtWorkDays;
        this.valueOfProject = valueOfProject;
        this.deadLinePenalty = deadLinePenalty;
        this.paymentDays = paymentDays;
        this.complexity = complexity;
    }

    public String toString () {
        return "Project info - Name: " + this.projectName +". Project type(1..3): " + this.projectType + ", " + this.projectType2 + ", " + this.projectType + " . Company name: " + this.clientCompanyName + ". Workd ays to complete: " + this.amtWorkDays +
                ". Project Finish date: " + this.finishDate + ". Project Value: " + this.valueOfProject + ". Deadline penalty: " + this.deadLinePenalty +
                ". Payment will be proceed after: " + this.paymentDays + " days. ";
    }
}

