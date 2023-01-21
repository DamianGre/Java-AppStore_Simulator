import java.util.*;
import java.util.ArrayList;

public class Company {
    List<Employees> workers = new ArrayList<Employees>();

    Integer dayCounter = 1;
    String companyName;
    String companyOffice;
    String clientName;
    Double balance = 10000.00; //10k $ at start
    Integer workersNumber = 0;
    Integer clients = 0;
    Boolean isWeekend = false;
    Integer completedProjects = 0;

    public Company(String companyName){
        this.companyName = companyName;
    }

    public void acceptProject(Project project)
    {
        this.balance += project.valueOfProject;
    }

    public void projectsChooser(List<Project> projects, List<Project> myProjectsInWork, List<Employees> hiredEmployees){
        Scanner scanner7 = new Scanner(System.in);
        Integer proejctIndex;
        Integer takenProjectCounter = 0;

        for (Integer i = 0; i < projects.size(); i++) {
            if (projects.get(i).activeInWork == true || projects.get(i).completed == true) {
                continue;
            }
            System.out.println("Projekt indeks = " + i + " " + projects.get(i));
            takenProjectCounter++;
        }
        if(takenProjectCounter == 0){
            System.out.println("Nie ma w tym tygodniu do wzięcia żadnych nowych projektów.");
            return;
        }
        System.out.println("Podaj index PROJEKTU, który chcesz wziąć lub wpisz 999 aby wyjść: ");
        proejctIndex = scanner7.nextInt();

        if(proejctIndex == 999){
            return;
        }
        if (proejctIndex < 0 ||  proejctIndex > projects.size()) {
            System.out.println("Zła cyfra.");
            return;
        }
        if (proejctIndex >= 0 && proejctIndex < projects.size()) {
            if (projects.get(proejctIndex).activeInWork == true) {
                System.out.println("Projekt jest już wzięty");
                return;
            } else if (projects.get(proejctIndex).completed == true) {
                System.out.println("Projekt Zakończony.");
                return;
            } else {
                if(hiredEmployees.size() == 0){
                    System.out.println("\nNie masz żadnego pracownika, więc nie możesz wziąć żadnego projektu.\n");
                    return;
                }
                for (Employees employees : hiredEmployees) {
                    if (projects.get(proejctIndex).projectType.equals(employees.projectCanWork) && employees.worksOnProject == false) {
                        projects.get(proejctIndex).employersIsWorkOnProject = employees;
                        projects.get(proejctIndex).activeInWork = true;
                        employees.worksOnProject = true;
                        employees.projectEmployerIsWorkingOn = projects.get(proejctIndex);
                        myProjectsInWork.add(projects.get(proejctIndex));
                        System.out.println("Wzięty projekt: " + projects.get(proejctIndex));
                        return;
                    }
                }
                System.out.println("Nie masz odpowiedniej kadry by wziąć ten projekt.\n");
                return;
            }
        }
        System.out.println("ZŁE DANE.");
    }

    public void projectsPrinter(List<Project> myProjectsInWork){
        if(myProjectsInWork.size() == 0){
            System.out.println("Nie pracujesz nad żadnymi projektami.");
            return;
        }
        System.out.println("Pracujesz nad tymi projektami: ");
        for (Project projects : myProjectsInWork) {
            if(projects.completed == true){
                continue;
            }
            System.out.println(projects);
        }
    }

    public void employeeChooser(List<Employees> possibleEmployees,List<Employees> hiredEmployees){
        Integer empolyeesHiredCounter = 0;
        Scanner scanner8 = new Scanner(System.in);
        Integer employeeIndex;
        for (Integer i = 0; i < possibleEmployees.size(); i++) {
            if (possibleEmployees.get(i).isHired == true) {
                continue;
            }
            System.out.println("Pracownik indeks = " + i + " " + possibleEmployees.get(i));
            empolyeesHiredCounter++;
        }
        if(empolyeesHiredCounter == 0){
            System.out.println("Nie ma pracowników do zatrudnienia. Sprawdź w natępnym tygodniu.");
            return;
        }
        System.out.println("Podaj index pracownika, któego chcesz zatudnić lub wpisz 999 aby wyjść: ");
        employeeIndex = scanner8.nextInt();
        if(employeeIndex == 999){
            return;
        }
        if (employeeIndex < 0 ||  employeeIndex > possibleEmployees.size()) {
            System.out.println("Zła cyfra.");
            return;
        }
        if (employeeIndex >= 0 && employeeIndex < possibleEmployees.size()) {
            if (possibleEmployees.get(employeeIndex).isHired == true) {
                System.out.println("Pracownik jest już zatrudniony");
                return;
            }
            possibleEmployees.get(employeeIndex).isHired = true;
            hiredEmployees.add(possibleEmployees.get(employeeIndex));
            System.out.println("Zatrudniony pracownik: " + possibleEmployees.get(employeeIndex));
            return;
        }
            System.out.println("ZŁE DANE.");
    }
    public void employeePrinter(List<Employees> hiredEmployees){
        Integer doIHaveEmpolyers = 0;
        if(hiredEmployees.size() > 0) {
            for (Integer x = 0; x < hiredEmployees.size(); x++) {
                if (hiredEmployees.get(x).isHired == false) {
                    continue;
                }
                System.out.println("Employer id number is: " + x + ". " + hiredEmployees.get(x) + ", Work on:" + hiredEmployees.get(x).projectEmployerIsWorkingOn);
                doIHaveEmpolyers++;
            }
            if(doIHaveEmpolyers == 0){
                System.out.println("W tej chwili nie masz żadnych pracowników.");
            }
        }else{
            System.out.println("Nie masz pracowników.");
        }
    }
    public void empolyeeFired(List<Employees> hiredEmployees, List<Project> myProjectsInWork){
        Scanner scanner10 = new Scanner(System.in);

        Integer doIHaveEmpolyers = 0;
        Integer fireEmployerIndex = 0;
        if(hiredEmployees.size() > 0) {
            for (Integer x = 0; x < hiredEmployees.size(); x++) {
                if (hiredEmployees.get(x).isHired == false) {
                    continue;
                }
                System.out.println("Employer id number is: " + x + ". " + hiredEmployees.get(x));
                doIHaveEmpolyers++;
            }
            if (doIHaveEmpolyers == 0) {
                System.out.println("W tej chwili nie masz żadnych pracowników.");
                return;
            }
            System.out.println("Wpisz index pracownika do zwolnenia lub 999 aby wyjść.");
            fireEmployerIndex = scanner10.nextInt();
            if (fireEmployerIndex == 999) {
                return;
            }
            if (fireEmployerIndex < 0 || fireEmployerIndex > hiredEmployees.size()) {
                System.out.println("Zła cyfra.");
                return;
            }
            if (fireEmployerIndex >= 0 && fireEmployerIndex < hiredEmployees.size()) {
                for(Project projects : myProjectsInWork){
                        if(hiredEmployees.get(fireEmployerIndex) == projects.employersIsWorkOnProject){
                            projects.employersIsWorkOnProject = null;
                        }
                }
                hiredEmployees.get(fireEmployerIndex).isHired = false;
                System.out.println("Zwolniony pracownik: " + hiredEmployees.get(fireEmployerIndex));
                return;
            }
            if (hiredEmployees.get(fireEmployerIndex).isHired == false) {
                System.out.println("Pracownik jest już zwolniony");
            } else {
                System.out.println("Wpisałeś złe dane.");
            }
        }else{
            System.out.println("Nie masz pracowników.");
        }
    }
    public void friendChooser(List<Employees> friendEmployees,List<Employees> hiredEmployees) {
        Scanner scanner9 = new Scanner(System.in);
        Integer friendEmployeeIndex;
        for (Integer i = 0; i < friendEmployees.size(); i++) {
            if (friendEmployees.get(i).isHired == true) {
                continue;
            }
            System.out.println("Pracownik indeks = " + i + " " + friendEmployees.get(i));
        }
        System.out.println("Podaj index Przyjacieal pracownika, któego chcesz zatudnić lub wpisz 999 aby wyjść: ");
        friendEmployeeIndex = scanner9.nextInt();
        if (friendEmployeeIndex == 999) {
            return;
        }
        if (friendEmployeeIndex < 0 ||  friendEmployeeIndex > friendEmployees.size()) {
            System.out.println("Zła cyfra.");
            return;
        }
        if (friendEmployeeIndex >= 0 && friendEmployeeIndex < friendEmployees.size()) {
            if (friendEmployees.get(friendEmployeeIndex).isHired == true) {
                System.out.println("Przyjaciel pracownik jest już zatrudniony");
                return;
            }
            friendEmployees.get(friendEmployeeIndex).isHired = true;
            hiredEmployees.add(friendEmployees.get(friendEmployeeIndex));
            System.out.println("Zatrudniony Przyjaciel pracownik: " + friendEmployees.get(friendEmployeeIndex));
            return;
        }
        System.out.println("ZŁE DANE.");
    }

    public void menuBasic(){
        System.out.println("\nChoose Your action.\n" +
                "Enter '1' to check list of available work projects.\n" +
                "Enter '2' to check potential employees.\n" +
                "Enter '3' to check friends that can do projects by itself.\n" +
                "Enter '4' to check projects in progress.\n" +
                "Enter '5' print your employees.\n" +
                "Enter '6' to fire employees.\n" +
                "Enter '7' End day.\n" +
                "Enter '0' To end application!");
    }


    public String toString(){
        return "Company's name: " + this.companyName + " Company's balance: " + this.balance +
                " Numbers of company workers" + this.workersNumber + " Company clients numbers: " + this.clients;
    }
}
