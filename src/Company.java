import java.util.*;
import java.util.ArrayList;

public class Company {
    List<Employees> workers = new ArrayList<Employees>();

    Integer dayCounter;
    String companyName;
    String companyOffice;
    String clientName;
    Double balance = 10000.00; //10k $ at start
    Integer workersNumber = 0;
    Integer clients = 0;

    public Company(String companyName){
        this.companyName = companyName;
    }

    public void acceptProject(Project project)
    {
        this.balance += project.valueOfProject;
    }


    public String toString(){
        return "Company's name: " + this.companyName + " Company's balance: " + this.balance +
                " Numbers of company workers" + this.workersNumber + " Company clients numbers: " + this.clients;
    }
}
