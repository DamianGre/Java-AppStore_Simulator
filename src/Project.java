import java.util.*;

public class Project {

    enum ProjectType {
        FrontEnd,
        Backend,
        DataBase,
        WordPress,
        PretaShop
    }
    enum ComplexityLevel {
        Easy,
        Medium,
        Hard,
    }

    String projectName;
    String clientCompanyName;
    Integer daysToCompleteProject;
    Date finishDate;
    Double valueOfProject;
    Double deadLinePenalty;
    Integer dayPaymentDate;
    ProjectType projectType;
    ComplexityLevel complexityLevel;

    public Project(String projectName, String clientCompanyName, Integer daysToCompleteProject, Date finishDate,
                   Double valueOfProject, Double deadLinePenalty, Integer dayPaymentDate, ProjectType projectType,
                   ComplexityLevel complexityLevel){
        this.projectName = projectName;
        this.clientCompanyName = clientCompanyName;
        this.daysToCompleteProject = daysToCompleteProject;
        this.finishDate = finishDate;
        this.valueOfProject = valueOfProject;
        this.deadLinePenalty = deadLinePenalty;
        this.dayPaymentDate = dayPaymentDate;
        this.projectType = projectType;
        this.complexityLevel = complexityLevel;

    }
}
