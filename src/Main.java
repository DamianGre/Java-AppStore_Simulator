import javax.swing.text.StyledEditorKit;
import java.sql.SQLOutput;
import java.util.*;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);
        Scanner scanner4 = new Scanner(System.in);
        Scanner scanner5 = new Scanner(System.in);


        ListAdder listAdder = new ListAdder();

        Boolean menuIsActive = true;
        Boolean newDay = false;
        Boolean firstDay = true;
        Boolean employerSuffler = true;
        Boolean projectSuffler = true;
        Boolean friendMondayShuffle =true;
        Boolean endDay = false;
        Boolean nextDayIsMonday = false;
        Integer moduloMonday = 1;
        Integer listsSortingNumber = 0;
        Integer friendListsSortingNumber = 0;
        Integer listsSortingNumberProject = 0;
        Integer firendSkills = 0;
        Boolean moduloMondayShuffle = true;
        Integer moduloSaturday = 0;
        Integer moduloSunday = 0;
        Integer empolyer1 = 0, empolyer2 = 0, empolyer3 = 0, empolyer4 = 0, empolyer5 = 0;


        List<Project> myProjectsInWork = new ArrayList<Project>();
        List<Employees> hiredEmployees = new ArrayList<Employees>();

        List<Project> projectsTier1_1 = new ArrayList<Project>();
        List<Project> projectsTier1_2 = new ArrayList<Project>();
        List<Project> projectsTier1_3 = new ArrayList<Project>();
        List<Project> projectsTier2_1 = new ArrayList<Project>();
        List<Project> projectsTier2_2 = new ArrayList<Project>();
        List<Project> projectsTier2_3 = new ArrayList<Project>();
        List<Project> projectsTier3_1 = new ArrayList<Project>();
        List<Project> projectsTier3_2 = new ArrayList<Project>();

        listAdder.possibleProjectAdderTier1_1(projectsTier1_1);
        listAdder.possibleProjectAdderTier1_2(projectsTier1_2);
        listAdder.possibleProjectAdderTier1_3(projectsTier1_3);
        listAdder.possibleProjectAdderTier2_1(projectsTier2_1);
        listAdder.possibleProjectAdderTier2_2(projectsTier2_2);
        listAdder.possibleProjectAdderTier2_3(projectsTier2_3);
        listAdder.possibleProjectAdderTier3_1(projectsTier3_1);
        listAdder.possibleProjectAdderTier3_2(projectsTier3_2);


        List<Employees> friendEmployees1 = new ArrayList<Employees>();
        List<Employees> friendEmployees2 = new ArrayList<Employees>();
        List<Employees> friendEmployees3 = new ArrayList<Employees>();

        listAdder.friendEmployesAdder(friendEmployees1, friendEmployees2, friendEmployees3);

        List<Employees> possibleEmployees1_1 = new ArrayList<Employees>();
        List<Employees> possibleEmployees1_2 = new ArrayList<Employees>();
        List<Employees> possibleEmployees1_3 = new ArrayList<Employees>();
        List<Employees> possibleEmployees1_4 = new ArrayList<Employees>();
        List<Employees> possibleEmployees1_5 = new ArrayList<Employees>();
        List<Employees> possibleEmployees1_6 = new ArrayList<Employees>();

        listAdder.possibleEmployesAdder1_1(possibleEmployees1_1);
        listAdder.possibleEmployesAdder1_2(possibleEmployees1_2);
        listAdder.possibleEmployesAdder1_3(possibleEmployees1_3);
        listAdder.possibleEmployesAdder1_4(possibleEmployees1_4);
        listAdder.possibleEmployesAdder1_5(possibleEmployees1_5);
        listAdder.possibleEmployesAdder1_6(possibleEmployees1_6);

        Company damianGre = new Company("DamianGre");

        System.out.println(damianGre.balance);

        do {
            if (newDay == true) {
                System.out.println("\nNEW DAY!");
                System.out.println("\nYour balance is: " + damianGre.balance);
                newDay = false;
            }

            if (damianGre.dayCounter == 1 && firstDay == true) {
                System.out.println("\nFirst Day of Your Company.");
                System.out.println("\nYour balance is: " + damianGre.balance);
                Integer randomListsSortingNumber = random.nextInt(9) + 1; //number from 0 to 9
                listsSortingNumber = randomListsSortingNumber;
            }


            if (damianGre.dayCounter == 6 ) {
                    System.out.println("It's weekend(Saturday). You can't hire people and take new projects.");
                    damianGre.isWeekend = true;
            }
            if(moduloSaturday > 1) {
                if (damianGre.dayCounter % moduloSaturday == 0 && moduloSaturday > 1) {
                    System.out.println("It's weekend(Saturday). You can't hire people and take new projects.");
                    damianGre.isWeekend = true;
                }
            }
            if (damianGre.dayCounter == 7 ) {
                    System.out.println("It's weekend(Sunday). You can't hire people and take new projects.");
                    damianGre.isWeekend = true;
                    nextDayIsMonday = true;
            }
            if(moduloSunday > 1) {
                if (damianGre.dayCounter % moduloSunday == 0 && moduloSunday > 1) {
                    System.out.println("It's weekend(Sunday). You can't hire people and take new projects.");
                    damianGre.isWeekend = true;
                    nextDayIsMonday = true;
                }
            }
            if (damianGre.dayCounter == moduloMonday) {
                if (moduloMonday != 1) {
                    System.out.println("It's Monday, new projects and employers are avaiable.");
                    Integer randomListsSortingNumber = random.nextInt(9) + 1; //number from 0 to 9
                    listsSortingNumber = randomListsSortingNumber;
                    moduloMondayShuffle = true;
                    friendMondayShuffle = true;
                    projectSuffler=true;
                    endDay = false;
                    damianGre.isWeekend = false;
                }
            }
            // Every 30 days is chance to get robbed
            if (damianGre.dayCounter % 30 == 0) {
                Integer robbery = random.nextInt(100) + 1; // 10% chance to get robbed
                if (robbery <= 10) //10% to get robbed
                {
                    System.out.println("\nROBBERY! JAROSŁAW K. HAS STEAL YOUR MONEY!\n");
                    damianGre.balance = damianGre.balance - (damianGre.balance * 0.10);
                }
            }
            do {
                damianGre.menuBasic();
                Integer menuChoose = scanner1.nextInt();

                switch (menuChoose) {
                    case 1: {
                        if ((moduloMondayShuffle == true) && (damianGre.isWeekend == false && projectSuffler == true)) {
                            System.out.println("Projkety do wyboru");
                            projectSuffler = false;

                            Integer randomListsSortingNumberProject = random.nextInt(8) + 1; //number from 1 to 6
                            listsSortingNumberProject = randomListsSortingNumberProject;

                            switch (listsSortingNumberProject) {
                                case 1: {
                                    damianGre.projectsChooser(projectsTier1_1, myProjectsInWork, hiredEmployees);
                                }
                                break;
                                case 2: {
                                    damianGre.projectsChooser(projectsTier1_2, myProjectsInWork, hiredEmployees);
                                }
                                break;
                                case 3: {
                                    damianGre.projectsChooser(projectsTier1_3, myProjectsInWork, hiredEmployees);
                                }
                                break;
                                case 4: {
                                    damianGre.projectsChooser(projectsTier2_1, myProjectsInWork, hiredEmployees);
                                }
                                break;
                                case 5: {
                                    damianGre.projectsChooser(projectsTier2_2, myProjectsInWork, hiredEmployees);
                                   }
                                break;
                                case 6: {
                                    damianGre.projectsChooser(projectsTier2_3, myProjectsInWork, hiredEmployees);
                                }
                                break;
                                case 7: {
                                    damianGre.projectsChooser(projectsTier3_1, myProjectsInWork, hiredEmployees);
                                }
                                break;
                                case 8: {
                                    damianGre.projectsChooser(projectsTier3_2, myProjectsInWork, hiredEmployees);
                                }
                                break;
                            }
                        }else{
                            if(damianGre.isWeekend == true){
                                System.out.println("Jest weekend nie możesz nikogo zatrudniać ani brać nowych projetków.");
                            }else {
                                switch (listsSortingNumberProject) {
                                    case 1: {
                                        damianGre.projectsChooser(projectsTier1_1, myProjectsInWork, hiredEmployees);
                                    }
                                    break;
                                    case 2: {
                                        damianGre.projectsChooser(projectsTier1_2, myProjectsInWork, hiredEmployees);
                                    }
                                    break;
                                    case 3: {
                                        damianGre.projectsChooser(projectsTier1_3, myProjectsInWork, hiredEmployees);
                                    }
                                    break;
                                    case 4: {
                                        damianGre.projectsChooser(projectsTier2_1, myProjectsInWork, hiredEmployees);
                                    }
                                    break;
                                    case 5: {
                                        damianGre.projectsChooser(projectsTier2_2, myProjectsInWork, hiredEmployees);
                                    }
                                    break;
                                    case 6: {
                                        damianGre.projectsChooser(projectsTier2_3, myProjectsInWork, hiredEmployees);
                                    }
                                    break;
                                    case 7: {
                                        damianGre.projectsChooser(projectsTier3_1, myProjectsInWork, hiredEmployees);
                                    }
                                    break;
                                    case 8: {
                                        damianGre.projectsChooser(projectsTier3_2, myProjectsInWork, hiredEmployees);
                                    }
                                    break;
                                }
                            }
                        }
                    }
                    break;
                    case 2: {
                        if ((moduloMondayShuffle == true) && (damianGre.isWeekend == false && employerSuffler == true)) {
                            System.out.println("Oto lista osób do zatrudnienia w tym tygodniu:");
                            employerSuffler = false;

                            Integer randomListsSortingNumber = random.nextInt(6) + 1; //number from 1 to 6
                            listsSortingNumber = randomListsSortingNumber;

                            switch (listsSortingNumber) {
                                case 1: {
                                    damianGre.employeeChooser(possibleEmployees1_1,hiredEmployees);
                                }break;
                                case 2: {
                                    damianGre.employeeChooser(possibleEmployees1_2,hiredEmployees);
                                }break;
                                case 3: {
                                    damianGre.employeeChooser(possibleEmployees1_3,hiredEmployees);
                                }break;
                                case 4: {
                                    damianGre.employeeChooser(possibleEmployees1_4, hiredEmployees);
                                }break;
                                case 5: {
                                    damianGre.employeeChooser(possibleEmployees1_5, hiredEmployees);
                                }break;
                                case 6: {
                                    damianGre.employeeChooser(possibleEmployees1_6, hiredEmployees);
                                } break;
                                default: {
                                    System.out.println("Błąd.");
                                }
                                break;
                            }
                        }else{
                            if(damianGre.isWeekend == true){
                                System.out.println("Jest weekend nie możesz nikogo zatrudniać ani brać nowych projetków.");
                            }else {
                                System.out.println("Oto lista osób do zatrudnienia w tym tygodniu");

                                switch (listsSortingNumber) {
                                    case 1: {
                                        damianGre.employeeChooser(possibleEmployees1_1, hiredEmployees);
                                    }
                                    break;
                                    case 2: {
                                        damianGre.employeeChooser(possibleEmployees1_2, hiredEmployees);
                                    }
                                    break;
                                    case 3: {
                                        damianGre.employeeChooser(possibleEmployees1_3, hiredEmployees);
                                    }
                                    break;
                                    case 4: {
                                        damianGre.employeeChooser(possibleEmployees1_4, hiredEmployees);
                                    }
                                    break;
                                    case 5: {
                                        damianGre.employeeChooser(possibleEmployees1_5, hiredEmployees);
                                    }
                                    break;
                                    case 6: {
                                        damianGre.employeeChooser(possibleEmployees1_6, hiredEmployees);
                                    }
                                    break;
                                    default: {
                                        System.out.println("Błąd.");
                                    }
                                    break;
                                }
                            }
                        }
                    }
                    break;
                    case 3: {
                        if ((moduloMondayShuffle == true) && (damianGre.isWeekend == false && friendMondayShuffle == true)) {
                            System.out.println("Oto lista przyiaciół do zatrudnienia w tym tygodniu");
                            friendMondayShuffle = false;

                            Integer randomListsSortingNumber = random.nextInt(3) + 1; //number from 1 to 3
                            friendListsSortingNumber = randomListsSortingNumber;

                            switch (friendListsSortingNumber) {
                                case 1: {
                                    damianGre.friendChooser(friendEmployees1, hiredEmployees);
                                }break;
                                case 2: {
                                    damianGre.friendChooser(friendEmployees2, hiredEmployees);
                                }break;
                                case 3: {
                                    damianGre.friendChooser(friendEmployees3, hiredEmployees);
                                }break;
                            }
                            break;
                        }else{
                            if(damianGre.isWeekend == true){
                                System.out.println("Jest weekend nie możesz nikogo zatrudniać ani brać nowych projetków.");
                            }else {
                                System.out.println("Oto lista osób do zatrudnienia w tym tygodniu");
                                switch (friendListsSortingNumber) {
                                    case 1: {
                                        damianGre.friendChooser(friendEmployees1, hiredEmployees);
                                    }
                                    break;
                                    case 2: {
                                        damianGre.friendChooser(friendEmployees2, hiredEmployees);
                                    }
                                    break;
                                    case 3: {
                                        damianGre.friendChooser(friendEmployees3, hiredEmployees);
                                    }
                                    break;
                                }
                                break;
                            }
                        }
                    }
                    break;
                    case 4: {
                        damianGre.projectsPrinter(myProjectsInWork);
                    }break;
                    case 5: {
                        damianGre.employeePrinter(hiredEmployees);
                    }break;
                    case 6: {
                        damianGre.empolyeeFired(hiredEmployees, myProjectsInWork);
                    }
                    break;
                    case 7: {

                        for(Project projects : myProjectsInWork){
                            if(damianGre.isWeekend == false){
                                if(projects.employersIsWorkOnProject == null){
                                    continue;
                                }else{
                                    projects.amtWorkDays--;
                                }
                            }
                            if(projects.amtWorkDays<0)
                            {
                                continue;
                            }
                            if(projects.amtWorkDays == 0){
                                System.out.println("\nZAKOŃCZENIE Projektu: " + projects + " . Kwota: " + projects.valueOfProject + " Została wypłącona.\n");
                                damianGre.balance += projects.valueOfProject;
                                projects.completed = true;
                                damianGre.completedProjects++;
                                projects.employersIsWorkOnProject.worksOnProject = false;
                                projects.employersIsWorkOnProject = null;
                                projects.amtWorkDays--;
                                continue;
                            }
                        }
                        if(damianGre.completedProjects == 5){
                            System.out.println("WYGRAŁEŚ GRE!");
                            break;
                        }

                        endDay = true;
                        for (Employees employees : hiredEmployees) {
                            if (employees.dayToCanBeFired == 0) {
                                continue;
                            }
                            employees.dayToCanBeFired--;
                        }
                        for (Employees employees : hiredEmployees) {
                            if(employees.isHired == true) {
                                damianGre.balance -= employees.dailySalary;
                                System.out.println("Your salary system has paid: " + employees.dailySalary + " To: " + employees);
                            }
                        }
                        if(damianGre.balance <= 0){
                            System.out.println("TO KONIEC GRY ZBANKRUTOWAŁEŚ!");
                            break;
                        }
                        System.out.println("\nDay has ended.\n");
                        try {
                            for (Integer timer = 1; timer > 0; timer--) {
                                System.out.println("New day starts in: " + timer + " seconds."); //1 sekunda przerwy do nastepnego dnia
                                TimeUnit.SECONDS.sleep(1);
                            }
                        } catch (InterruptedException ex) {
                            ex.printStackTrace();
                        }
                        moduloMondayShuffle = false;

                        if (damianGre.dayCounter == moduloMonday + 1) {
                            moduloMonday += 7;
                        }
                        if (damianGre.dayCounter == 1 && firstDay == true) {
                            firstDay = false;
                            moduloMonday += 7;
                            moduloMondayShuffle = true;
                        }

                        if (damianGre.dayCounter == 6) {
                            moduloSaturday += 6;
                        }
                        if (moduloSaturday > 0) {
                            if (damianGre.dayCounter % moduloSaturday == 0) {
                                moduloSaturday += 7;
                            }
                        }
                        if (damianGre.dayCounter == 7) {
                            moduloSunday += 7;
                            nextDayIsMonday = true;
                            employerSuffler = true;
                        }
                        if (moduloSunday > 0) {
                            if (damianGre.dayCounter % moduloSunday == 0) {
                                moduloSunday += 7;
                                nextDayIsMonday = true;
                                employerSuffler = true;
                            }
                        }

                        damianGre.dayCounter++;
                        newDay = true;
                    }
                    break;

                    case 0: {
                        menuIsActive = false;
                        System.out.println("Application has been closed succesfully.");
                    }
                    break;
                }
            }while(endDay == false);
            if(damianGre.balance <= 0){
                break;
            }
            if(damianGre.completedProjects == 5){
                break;
            }
        }while (menuIsActive == true) ;
    }
}