import java.util.*;
import java.util.ArrayList;

public class Project {



    public enum ProjectType {
        FRONTEND,
        BACKEND,
        DATABASE,
        WORDPRESS,
        PRETASHOP;
    }
    public enum ComplexityLevel {
        Easy,
        Medium,
        Hard;
    }

    String projectName;
    String clientCompanyName;
    private static final Integer FrontEndDaysToCompleteProjectEasy = 2;
    private static final Integer FrontEndDaysToCompleteProjectMedium = 3;
    private static final Integer FrontEndDaysToCompleteProjectHard = 5;

    private static final Integer BackEndDaysToCompleteProjectEasy = 3;
    private static final Integer BackEndDaysToCompleteProjectMedium = 4;
    private static final Integer BackEndDaysToCompleteProjectHard = 6;

    private static final Integer DataBaseDaysToCompleteProjectEasy = 3;
    private static final Integer DataBaseDaysToCompleteProjectMedium = 4;
    private static final Integer DataBaseDaysToCompleteProjectHard = 5;

    private static final Integer WordPressDaysToCompleteProjectEasy = 2;
    private static final Integer WordPressDaysToCompleteProjectMedium = 3;
    private static final Integer WordPressDaysToCompleteProjectHard = 4;

    private static final Integer PretaShopDaysToCompleteProjectEasy = 1;
    private static final Integer PretaShopDaysToCompleteProjectMedium = 2;
    private static final Integer PretaShopDaysToCompleteProjectHard = 3;

    Integer daysToCompleteProject;
    Date finishDate;
    Double valueOfProject;
    Double deadLinePenalty;
    Integer paymentDays;
    ProjectType projectType;
    ComplexityLevel complexityLevel;

    public Project(String projectName, String clientCompanyName,
                   Double valueOfProject, Double deadLinePenalty, Integer paymentDays, ProjectType projectType,
                   ComplexityLevel complexityLevel){

        this.projectName = projectName;
        this.clientCompanyName = clientCompanyName;

        switch(projectType){
            case FRONTEND -> {
                if(complexityLevel == Project.ComplexityLevel.Easy)this.daysToCompleteProject = FrontEndDaysToCompleteProjectEasy;
                else if(complexityLevel == ComplexityLevel.Medium)this.daysToCompleteProject = FrontEndDaysToCompleteProjectMedium;
                else if(complexityLevel == ComplexityLevel.Hard) this.daysToCompleteProject = FrontEndDaysToCompleteProjectHard;}

            case BACKEND -> {
                if(complexityLevel == Project.ComplexityLevel.Easy)this.daysToCompleteProject = BackEndDaysToCompleteProjectEasy;
                else if(complexityLevel == ComplexityLevel.Medium)this.daysToCompleteProject = BackEndDaysToCompleteProjectMedium;
                else if(complexityLevel == ComplexityLevel.Hard) this.daysToCompleteProject = BackEndDaysToCompleteProjectHard;}

            case DATABASE -> {
                if(complexityLevel == Project.ComplexityLevel.Easy)this.daysToCompleteProject = DataBaseDaysToCompleteProjectEasy;
                else if(complexityLevel == ComplexityLevel.Medium)this.daysToCompleteProject = DataBaseDaysToCompleteProjectMedium;
                else if(complexityLevel == ComplexityLevel.Hard) this.daysToCompleteProject = DataBaseDaysToCompleteProjectHard;}

            case WORDPRESS -> {
                if(complexityLevel == Project.ComplexityLevel.Easy)this.daysToCompleteProject = WordPressDaysToCompleteProjectEasy;
                else if(complexityLevel == ComplexityLevel.Medium)this.daysToCompleteProject = WordPressDaysToCompleteProjectMedium;
                else if(complexityLevel == ComplexityLevel.Hard) this.daysToCompleteProject = WordPressDaysToCompleteProjectHard;}

            case PRETASHOP ->  {
                if(complexityLevel == Project.ComplexityLevel.Easy)this.daysToCompleteProject = PretaShopDaysToCompleteProjectEasy;
                else if(complexityLevel == ComplexityLevel.Medium)this.daysToCompleteProject = PretaShopDaysToCompleteProjectMedium;
                else if(complexityLevel == ComplexityLevel.Hard) this.daysToCompleteProject = PretaShopDaysToCompleteProjectHard;}
        }

        this.valueOfProject = valueOfProject;
        this.deadLinePenalty = deadLinePenalty;
        this.paymentDays = paymentDays;
        this.projectType = projectType;
        this.complexityLevel = complexityLevel;
    }

    public String toString(){
        return "Project name: " + this.projectName + " Client company name: " + this.clientCompanyName + " Number of days to complete: "+ this.daysToCompleteProject +
                " Project Finish date: " + this.finishDate + " Project Value: " + this.valueOfProject + " Deadline penalty: " + this.deadLinePenalty +
                " Payment will be proceed after: " + this.paymentDays +" days. " + " Project type: " + this.projectType + " Project complexity level: " + this.complexityLevel;
    }
}
