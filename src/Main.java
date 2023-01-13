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

        damianGre.balance = 10000.0;

        System.out.println("Balance: " + damianGre.balance);


        do {
            System.out.println("\nZEW ZEW ZEW MENU\n");
            if (newDay == true) {
                System.out.println("\nNEW DAY!");
                System.out.println("\nYour balance is: " + damianGre.balance);
                newDay = false;
                for(Project projects : myProjectsInWork){
                    if(damianGre.isWeekend == false){
                        projects.amtWorkDays--;
                    }
                    if(projects.amtWorkDays == 0){
                        System.out.println("Projekt: " + projects + " Został zakończony. Wynagrodzenie zostało wypłacone w kwocie: " + projects.valueOfProject);
                        damianGre.balance += projects.valueOfProject;
                        projects.completed = true;
                        damianGre.complatedProjects++;
                        projects.employersIsWorkOnProject = null;

                        continue;
                    }
                }
                if(damianGre.complatedProjects == 5){
                    System.out.println("WYGRAŁEŚ GRE!");
                    return;
                }
                System.out.println("\nYour balance is: " + damianGre.balance);
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
                System.out.println("MENU WEWNNETRZNE");
                System.out.println("modulo Monday: " + moduloMonday);
                System.out.println("modulo Saturday: " + moduloSaturday);
                System.out.println("modulo Sunday: " + moduloSunday);
                System.out.println("Day: " + damianGre.dayCounter);
                System.out.println("FRIEND BOOL SZUFLER " + friendMondayShuffle);
                System.out.println("PROJECT RANDOMIZER: " + listsSortingNumberProject);

                System.out.println("\nChoose Your action.\n" +
                        "Enter '1' to check list of available work projects.\n" +
                        "Enter '2' to check potential employees.\n" +
                        "Enter '3' to check friends that can do projects by itself.\n" +
                        "Enter '4' to check projects in progress.\n" +
                        "Enter '5' print your employees.\n" +
                        "Enter '6' to fire employees.\n" +
                        "Enter '7' End day.\n" +
                        "Enter '0' To end application!");

                Integer menuChoose = scanner1.nextInt();

                switch (menuChoose) {
                    case 1: {
                        Integer proejctIndex;
                        if ((moduloMondayShuffle == true) && (damianGre.isWeekend == false && projectSuffler == true)) {
                            System.out.println("Projkety do wyboru");
                            projectSuffler = false;

                            Integer randomListsSortingNumberProject = random.nextInt(8) + 1; //number from 1 to 6
                            listsSortingNumberProject = randomListsSortingNumberProject;

                            switch (listsSortingNumberProject) {
                                case 1: {
                                    for (Integer i = 0; i < projectsTier1_1.size(); i++) {
                                        if (projectsTier1_1.get(i).activeInWork == true || projectsTier1_1.get(i).completed == true) {
                                            continue;
                                        }
                                        System.out.println("Projekt indeks = " + i + " " + projectsTier1_1.get(i));
                                    }
                                        System.out.println("Podaj index PROJEKTU, który chcesz wziąć lub wpisz 999 aby wyjść: ");
                                        proejctIndex = scanner4.nextInt();
                                        if(proejctIndex == 999){
                                            break;
                                        }
                                    if (proejctIndex < 0 ||  proejctIndex > projectsTier1_1.size()) {
                                        System.out.println("Zła cyfra.");
                                        break;
                                    }
                                    if (proejctIndex >= 0 && proejctIndex < projectsTier1_1.size()) {           // TO MUSISZ DO RESZTY DAĆ A NAJLEPIEJ WKOŃCU ZRÓ BETODY DO SWITCHY A NIE
                                        for(Employees employees: hiredEmployees){                               // A Nie taka popelina!!!!!
                                            if(projectsTier1_1.get(proejctIndex).projectType.equals(employees.projectCanWork)) {
                                                projectsTier1_1.get(proejctIndex).employersIsWorkOnProject = employees;
                                                projectsTier1_1.get(proejctIndex).activeInWork = true;
                                                employees.projectEmployerIsWorkingOn = projectsTier1_1.get(proejctIndex);
                                                myProjectsInWork.add(projectsTier1_1.get(proejctIndex));
                                                System.out.println("Projekt wzięty");
                                                break;
                                            }
                                        }
                                    }
                                    if (projectsTier1_1.get(proejctIndex).activeInWork == true) {
                                        System.out.println("Projekt jest już wzięty");
                                    }else if(projectsTier1_1.get(proejctIndex).completed == true){
                                        System.out.println("Projekt Zakończony.");

                                    }else {
                                        System.out.println("Wpisałeś złe dane.");
                                    }
                                }
                                break;
                                case 2: {
                                    for (Integer i = 0; i < projectsTier1_2.size(); i++) {
                                        if (projectsTier1_2.get(i).activeInWork == true || projectsTier1_2.get(i).completed == true) {
                                            continue;
                                        }
                                        System.out.println("Projekt indeks = " + i + " " + projectsTier1_2.get(i));
                                    }
                                    System.out.println("Podaj index PROJEKTU, który chcesz wziąć lub wpisz 999 aby wyjść: ");
                                    proejctIndex = scanner4.nextInt();
                                    if(proejctIndex == 999){
                                        return;
                                    }
                                    if (proejctIndex < 0 ||  proejctIndex > projectsTier1_2.size()) {
                                        System.out.println("Zła cyfra.");
                                        break;
                                    }
                                        if (proejctIndex >= 0 && proejctIndex < projectsTier1_2.size()) {
                                            projectsTier1_2.get(proejctIndex).activeInWork = true;
                                            myProjectsInWork.add(projectsTier1_2.get(proejctIndex));
                                            System.out.println("Projekt wzięty");
                                            break;
                                        }
                                        if (projectsTier1_2.get(proejctIndex).activeInWork == true) {
                                            System.out.println("Pracownik jest już zatrudniony");
                                        }else if(projectsTier1_2.get(proejctIndex).completed == true){
                                            System.out.println("Projekt Zakończony.");

                                        } else {
                                            System.out.println("Wpisałeś złe dane.");
                                        }
                                }
                                break;
                                case 3: {
                                    for (Integer i = 0; i < projectsTier1_3.size(); i++) {
                                        if (projectsTier1_3.get(i).activeInWork == true || projectsTier1_3.get(i).completed == true) {
                                            continue;
                                        }
                                        System.out.println("Projekt indeks = " + i + " " + projectsTier1_3.get(i));
                                    }

                                    System.out.println("Podaj index PROJEKTU, który chcesz wziąć lub wpisz 999 aby wyjść: ");
                                    proejctIndex = scanner4.nextInt();
                                    if(proejctIndex == 999){
                                        break;
                                    }
                                    if (proejctIndex < 0 ||  proejctIndex > projectsTier1_3.size()) {
                                        System.out.println("Zła cyfra.");
                                        break;
                                    }
                                        if (proejctIndex >= 0 && proejctIndex < projectsTier1_3.size()) {
                                            projectsTier1_3.get(proejctIndex).activeInWork = true;
                                            myProjectsInWork.add(projectsTier1_3.get(proejctIndex));
                                            System.out.println("Projekt wzięty");
                                            break;
                                        }
                                        if (projectsTier1_3.get(proejctIndex).activeInWork == true) {
                                            System.out.println("Pracownik jest już zatrudniony");
                                        }else if(projectsTier1_3.get(proejctIndex).completed == true){
                                            System.out.println("Projekt Zakończony.");

                                        } else {
                                            System.out.println("Wpisałeś złe dane.");
                                        }

                                }
                                break;
                                case 4: {
                                    for (Integer i = 0; i < projectsTier2_1.size(); i++) {
                                        if (projectsTier2_1.get(i).activeInWork == true || projectsTier2_1.get(i).completed == true) {
                                            continue;
                                        }
                                        System.out.println("Projekt indeks = " + i + " " + projectsTier2_1.get(i));
                                    }
                                    System.out.println("Podaj index PROJEKTU, który chcesz wziąć lub wpisz 999 aby wyjść: ");
                                    proejctIndex = scanner4.nextInt();
                                    if(proejctIndex == 999){
                                        break;
                                    }
                                    if (proejctIndex < 0 ||  proejctIndex > projectsTier2_1.size()) {
                                        System.out.println("Zła cyfra.");
                                        break;
                                    }
                                        if (proejctIndex >= 0 && proejctIndex < projectsTier2_1.size()) {
                                            projectsTier2_1.get(proejctIndex).activeInWork = true;
                                            myProjectsInWork.add(projectsTier2_1.get(proejctIndex));
                                            System.out.println("Projekt wzięty");
                                            break;
                                        }
                                        if (projectsTier2_1.get(proejctIndex).activeInWork == true) {
                                            System.out.println("Pracownik jest już zatrudniony");
                                        }else if(projectsTier2_1.get(proejctIndex).completed == true){
                                            System.out.println("Projekt Zakończony.");

                                        } else {
                                            System.out.println("Wpisałeś złe dane.");
                                        }
                                }
                                break;
                                case 5: {
                                    for (Integer i = 0; i < projectsTier2_2.size(); i++) {
                                        if (projectsTier2_2.get(i).activeInWork == true || projectsTier2_2.get(i).completed == true) {
                                            continue;
                                        }
                                        System.out.println("Projekt indeks = " + i + " " + projectsTier2_2.get(i));
                                    }
                                    System.out.println("Podaj index PROJEKTU, który chcesz wziąć lub wpisz 999 aby wyjść: ");
                                    proejctIndex = scanner4.nextInt();
                                    if(proejctIndex == 999){
                                        break;
                                    }
                                    if (proejctIndex < 0 ||  proejctIndex > projectsTier2_2.size()) {
                                        System.out.println("Zła cyfra.");
                                        break;
                                    }
                                        if (proejctIndex >= 0 && proejctIndex < projectsTier2_2.size()) {
                                            projectsTier2_2.get(proejctIndex).activeInWork = true;
                                            myProjectsInWork.add(projectsTier2_2.get(proejctIndex));
                                            System.out.println("Projekt wzięty");
                                            break;
                                        }
                                        if (projectsTier2_2.get(proejctIndex).activeInWork == true) {
                                            System.out.println("Pracownik jest już zatrudniony");
                                        }else if(projectsTier2_2.get(proejctIndex).completed == true){
                                            System.out.println("Projekt Zakończony.");

                                        } else {
                                            System.out.println("Wpisałeś złe dane.");
                                        }
                                }
                                break;
                                case 6: {
                                    for (Integer i = 0; i < projectsTier2_3.size(); i++) {
                                        if (projectsTier2_3.get(i).activeInWork == true || projectsTier2_3.get(i).completed == true) {
                                            continue;
                                        }
                                        System.out.println("Projekt indeks = " + i + " " + projectsTier2_3.get(i));
                                    }
                                    System.out.println("Podaj index PROJEKTU, który chcesz wziąć lub wpisz 999 aby wyjść: ");
                                    proejctIndex = scanner4.nextInt();
                                    if(proejctIndex == 999){
                                        break;
                                    }
                                    if (proejctIndex < 0 ||  proejctIndex > projectsTier2_3.size()) {
                                        System.out.println("Zła cyfra.");
                                        break;
                                    }
                                        if (proejctIndex >= 0 && proejctIndex < projectsTier2_3.size()) {
                                            projectsTier2_3.get(proejctIndex).activeInWork = true;
                                            myProjectsInWork.add(projectsTier2_3.get(proejctIndex));
                                            System.out.println("Projekt wzięty");
                                            break;
                                        }
                                        if (projectsTier2_3.get(proejctIndex).activeInWork == true) {
                                            System.out.println("Pracownik jest już zatrudniony");
                                        }else if(projectsTier2_3.get(proejctIndex).completed == true){
                                            System.out.println("Projekt Zakończony.");

                                        } else {
                                            System.out.println("Wpisałeś złe dane.");
                                        }
                                }
                                break;
                                case 7: {
                                    for (Integer i = 0; i < projectsTier3_1.size(); i++) {
                                        if (projectsTier3_1.get(i).activeInWork == true || projectsTier3_1.get(i).completed == true) {
                                            continue;
                                        }
                                        System.out.println("Projekt indeks = " + i + " " + projectsTier3_1.get(i));
                                    }
                                    System.out.println("Podaj index PROJEKTU, który chcesz wziąć lub wpisz 999 aby wyjść: ");
                                    proejctIndex = scanner4.nextInt();
                                    if(proejctIndex == 999){
                                        break;
                                    }
                                    if (proejctIndex < 0 ||  proejctIndex > projectsTier3_1.size()) {
                                        System.out.println("Zła cyfra.");
                                        break;
                                    }
                                        if (proejctIndex >= 0 && proejctIndex < projectsTier3_1.size()) {
                                            projectsTier3_1.get(proejctIndex).activeInWork = true;
                                            myProjectsInWork.add(projectsTier3_1.get(proejctIndex));
                                            System.out.println("Projekt wzięty");
                                            break;
                                        }
                                        if (projectsTier3_1.get(proejctIndex).activeInWork == true) {
                                            System.out.println("Pracownik jest już zatrudniony");
                                        }else if(projectsTier3_1.get(proejctIndex).completed == true){
                                            System.out.println("Projekt Zakończony.");

                                        } else {
                                            System.out.println("Wpisałeś złe dane.");
                                        }
                                }
                                break;
                                case 8: {
                                    for (Integer i = 0; i < projectsTier3_2.size(); i++) {
                                        if (projectsTier3_2.get(i).activeInWork == true || projectsTier3_2.get(i).completed == true) {
                                            continue;
                                        }
                                        System.out.println("Projekt indeks = " + i + " " + projectsTier3_2.get(i));
                                    }
                                    System.out.println("Podaj index PROJEKTU, który chcesz wziąć lub wpisz 999 aby wyjść: ");
                                    proejctIndex = scanner4.nextInt();
                                    if(proejctIndex == 999){
                                        break;
                                    }
                                    if (proejctIndex < 0 ||  proejctIndex > projectsTier3_2.size()) {
                                        System.out.println("Zła cyfra.");
                                        break;
                                    }
                                        if (proejctIndex >= 0 && proejctIndex < projectsTier3_2.size()) {
                                            projectsTier3_2.get(proejctIndex).activeInWork = true;
                                            myProjectsInWork.add(projectsTier3_2.get(proejctIndex));
                                            System.out.println("Projekt wzięty");
                                            break;
                                        }
                                        if (projectsTier3_2.get(proejctIndex).activeInWork == true) {
                                            System.out.println("Pracownik jest już zatrudniony");
                                        }else if(projectsTier3_2.get(proejctIndex).completed == true){
                                            System.out.println("Projekt Zakończony.");

                                        } else {
                                            System.out.println("Wpisałeś złe dane.");
                                        }
                                }
                                break;
                            }
                        }else{
                            if(damianGre.isWeekend == true){
                                System.out.println("Jest weekend nie możesz nikogo zatrudniać ani brać nowych projetków.");
                                break;
                            }
                            System.out.println("Projkety do wyboru");
                            switch (listsSortingNumberProject) {
                                case 1: {
                                    for (Integer i = 0; i < projectsTier1_1.size(); i++) {
                                        if (projectsTier1_1.get(i).activeInWork == true || projectsTier1_1.get(i).completed == true) {
                                            continue;
                                        }
                                        System.out.println("Projekt indeks = " + i + " " + projectsTier1_1.get(i));
                                    }
                                    System.out.println("Podaj index PROJEKTU, który chcesz wziąć lub wpisz 999 aby wyjść: ");
                                    proejctIndex = scanner4.nextInt();
                                    if(proejctIndex == 999){
                                        break;
                                    }
                                    if (proejctIndex < 0 ||  proejctIndex > projectsTier1_1.size()) {
                                        System.out.println("Zła cyfra.");
                                        break;
                                    }
                                        if (proejctIndex >= 0 && proejctIndex < projectsTier1_1.size()) {
                                            projectsTier1_1.get(proejctIndex).activeInWork = true;
                                            myProjectsInWork.add(projectsTier1_1.get(proejctIndex));
                                            System.out.println("Projekt wzięty");
                                            break;
                                        }
                                        if (projectsTier1_1.get(proejctIndex).activeInWork == true) {
                                            System.out.println("Pracownik jest już zatrudniony");
                                        }else if(projectsTier1_1.get(proejctIndex).completed == true){
                                            System.out.println("Projekt Zakończony.");

                                        }else {
                                            System.out.println("Wpisałeś złe dane.");
                                        }
                                }
                                break;
                                case 2: {
                                    for (Integer i = 0; i < projectsTier1_2.size(); i++) {
                                        if (projectsTier1_2.get(i).activeInWork == true || projectsTier1_2.get(i).completed == true) {
                                            continue;
                                        }
                                        System.out.println("Projekt indeks = " + i + " " + projectsTier1_2.get(i));
                                    }
                                    System.out.println("Podaj index PROJEKTU, który chcesz wziąć lub wpisz 999 aby wyjść: ");
                                    proejctIndex = scanner4.nextInt();
                                    if(proejctIndex == 999){
                                        break;
                                    }
                                    if (proejctIndex < 0 ||  proejctIndex > projectsTier1_2.size()) {
                                        System.out.println("Zła cyfra.");
                                        break;
                                    }
                                        if (proejctIndex >= 0 && proejctIndex < projectsTier1_2.size()) {
                                            projectsTier1_2.get(proejctIndex).activeInWork = true;
                                            myProjectsInWork.add(projectsTier1_2.get(proejctIndex));
                                            System.out.println("Projekt wzięty");
                                            break;
                                        }
                                        if (projectsTier1_2.get(proejctIndex).activeInWork == true) {
                                            System.out.println("Pracownik jest już zatrudniony");
                                        }else if(projectsTier1_2.get(proejctIndex).completed == true){
                                            System.out.println("Projekt Zakończony.");

                                        } else {
                                            System.out.println("Wpisałeś złe dane.");
                                        }
                                }
                                break;
                                case 3: {
                                    for (Integer i = 0; i < projectsTier1_3.size(); i++) {
                                        if (projectsTier1_3.get(i).activeInWork == true || projectsTier1_3.get(i).completed == true) {
                                            continue;
                                        }
                                        System.out.println("Projekt indeks = " + i + " " + projectsTier1_3.get(i));
                                    }
                                    System.out.println("Podaj index PROJEKTU, który chcesz wziąć lub wpisz 999 aby wyjść: ");
                                    proejctIndex = scanner4.nextInt();
                                    if(proejctIndex == 999){
                                        break;
                                    }
                                    if (proejctIndex < 0 ||  proejctIndex > projectsTier1_3.size()) {
                                        System.out.println("Zła cyfra.");
                                        break;
                                    }
                                        if (proejctIndex >= 0 && proejctIndex < projectsTier1_3.size()) {
                                            projectsTier1_3.get(proejctIndex).activeInWork = true;
                                            myProjectsInWork.add(projectsTier1_3.get(proejctIndex));
                                            System.out.println("Projekt wzięty");
                                            break;
                                        }
                                        if (projectsTier1_3.get(proejctIndex).activeInWork == true) {
                                            System.out.println("Pracownik jest już zatrudniony");
                                        }else if(projectsTier1_3.get(proejctIndex).completed == true){
                                            System.out.println("Projekt Zakończony.");

                                        } else {
                                            System.out.println("Wpisałeś złe dane.");
                                        }
                                }
                                break;
                                case 4: {
                                    for (Integer i = 0; i < projectsTier2_1.size(); i++) {
                                        if (projectsTier2_1.get(i).activeInWork == true || projectsTier2_1.get(i).completed == true) {
                                            continue;
                                        }
                                        System.out.println("Projekt indeks = " + i + " " + projectsTier2_1.get(i));
                                    }
                                    System.out.println("Podaj index PROJEKTU, który chcesz wziąć lub wpisz 999 aby wyjść: ");
                                    proejctIndex = scanner4.nextInt();
                                    if(proejctIndex == 999){
                                        break;
                                    }
                                    if (proejctIndex < 0 ||  proejctIndex > projectsTier2_1.size()) {
                                        System.out.println("Zła cyfra.");
                                        break;
                                    }
                                        if (proejctIndex >= 0 && proejctIndex < projectsTier2_1.size()) {
                                            projectsTier2_1.get(proejctIndex).activeInWork = true;
                                            myProjectsInWork.add(projectsTier2_1.get(proejctIndex));
                                            System.out.println("Projekt wzięty");
                                            break;
                                        }
                                        if (projectsTier2_1.get(proejctIndex).activeInWork == true) {
                                            System.out.println("Pracownik jest już zatrudniony");
                                        }else if(projectsTier2_1.get(proejctIndex).completed == true){
                                            System.out.println("Projekt Zakończony.");

                                        } else {
                                            System.out.println("Wpisałeś złe dane.");
                                        }
                                }
                                break;
                                case 5: {
                                    for (Integer i = 0; i < projectsTier2_2.size(); i++) {
                                        if (projectsTier2_2.get(i).activeInWork == true || projectsTier2_2.get(i).completed == true) {
                                            continue;
                                        }
                                        System.out.println("Projekt indeks = " + i + " " + projectsTier2_2.get(i));
                                    }
                                    System.out.println("Podaj index PROJEKTU, który chcesz wziąć lub wpisz 999 aby wyjść: ");
                                    proejctIndex = scanner4.nextInt();
                                    if(proejctIndex == 999){
                                        break;
                                    }
                                    if (proejctIndex < 0 ||  proejctIndex > projectsTier2_2.size()) {
                                        System.out.println("Zła cyfra.");
                                        break;
                                    }
                                        if (proejctIndex >= 0 && proejctIndex < projectsTier2_2.size()) {
                                            projectsTier2_2.get(proejctIndex).activeInWork = true;
                                            myProjectsInWork.add(projectsTier2_2.get(proejctIndex));
                                            System.out.println("Projekt wzięty");
                                            break;
                                        }
                                        if (projectsTier2_2.get(proejctIndex).activeInWork == true) {
                                            System.out.println("Pracownik jest już zatrudniony");
                                        }else if(projectsTier2_2.get(proejctIndex).completed == true){
                                            System.out.println("Projekt Zakończony.");

                                        } else {
                                            System.out.println("Wpisałeś złe dane.");
                                        }
                                }
                                break;
                                case 6: {
                                    for (Integer i = 0; i < projectsTier2_3.size(); i++) {
                                        if (projectsTier2_3.get(i).activeInWork == true || projectsTier2_3.get(i).completed == true) {
                                            continue;
                                        }
                                        System.out.println("Projekt indeks = " + i + " " + projectsTier2_3.get(i));
                                    }
                                    System.out.println("Podaj index PROJEKTU, który chcesz wziąć lub wpisz 999 aby wyjść: ");
                                    proejctIndex = scanner4.nextInt();
                                    if(proejctIndex == 999){
                                        break;
                                    }
                                    if (proejctIndex < 0 ||  proejctIndex > projectsTier2_3.size()) {
                                        System.out.println("Zła cyfra.");
                                        break;
                                    }
                                        if (proejctIndex >= 0 && proejctIndex < projectsTier2_3.size()) {
                                            projectsTier2_3.get(proejctIndex).activeInWork = true;
                                            myProjectsInWork.add(projectsTier2_3.get(proejctIndex));
                                            System.out.println("Projekt wzięty");
                                            break;
                                        }
                                        if (projectsTier2_3.get(proejctIndex).activeInWork == true) {
                                            System.out.println("Pracownik jest już zatrudniony");
                                        }else if(projectsTier2_3.get(proejctIndex).completed == true){
                                            System.out.println("Projekt Zakończony.");

                                        } else {
                                            System.out.println("Wpisałeś złe dane.");
                                        }
                                }
                                break;
                                case 7: {
                                    for (Integer i = 0; i < projectsTier3_1.size(); i++) {
                                        if (projectsTier3_1.get(i).activeInWork == true || projectsTier3_1.get(i).completed == true) {
                                            continue;
                                        }
                                        System.out.println("Projekt indeks = " + i + " " + projectsTier3_1.get(i));
                                    }
                                    System.out.println("Podaj index PROJEKTU, który chcesz wziąć lub wpisz 999 aby wyjść: ");
                                    proejctIndex = scanner4.nextInt();
                                    if(proejctIndex == 999){
                                        break;
                                    }
                                    if (proejctIndex < 0 ||  proejctIndex > projectsTier3_1.size()) {
                                        System.out.println("Zła cyfra.");
                                        break;
                                    }
                                        if (proejctIndex >= 0 && proejctIndex < projectsTier3_1.size()) {
                                            projectsTier3_1.get(proejctIndex).activeInWork = true;
                                            myProjectsInWork.add(projectsTier3_1.get(proejctIndex));
                                            System.out.println("Projekt wzięty");
                                            break;
                                        }
                                        if (projectsTier3_1.get(proejctIndex).activeInWork == true) {
                                            System.out.println("Pracownik jest już zatrudniony");
                                        }else if(projectsTier3_1.get(proejctIndex).completed == true){
                                            System.out.println("Projekt Zakończony.");

                                        } else {
                                            System.out.println("Wpisałeś złe dane.");
                                        }
                                }
                                break;
                                case 8: {
                                    for (Integer i = 0; i < projectsTier3_2.size(); i++) {
                                        if (projectsTier3_2.get(i).activeInWork == true || projectsTier3_2.get(i).completed == true) {
                                            continue;
                                        }
                                        System.out.println("Projekt indeks = " + i + " " + projectsTier3_2.get(i));
                                    }
                                    System.out.println("Podaj index PROJEKTU, który chcesz wziąć lub wpisz 999 aby wyjść: ");
                                    proejctIndex = scanner4.nextInt();
                                    if(proejctIndex == 999){
                                        break;
                                    }
                                    if (proejctIndex < 0 ||  proejctIndex > projectsTier3_2.size()) {
                                        System.out.println("Zła cyfra.");
                                        break;
                                    }
                                        if (proejctIndex >= 0 && proejctIndex < projectsTier3_2.size()) {
                                            projectsTier3_2.get(proejctIndex).activeInWork = true;
                                            myProjectsInWork.add(projectsTier3_2.get(proejctIndex));
                                            System.out.println("Projekt wzięty");
                                            break;
                                        }
                                        if (projectsTier3_2.get(proejctIndex).activeInWork == true) {
                                            System.out.println("Pracownik jest już zatrudniony");
                                        }else if(projectsTier3_2.get(proejctIndex).completed == true){
                                            System.out.println("Projekt Zakończony.");

                                        } else {
                                            System.out.println("Wpisałeś złe dane.");
                                        }
                                }
                                break;
                            }
                        }
                    }
                        break;
                    case 2: {
                        Integer employeeIndex;

                        if ((moduloMondayShuffle == true) && (damianGre.isWeekend == false && employerSuffler == true)) {
                            System.out.println("Oto lista osób do zatrudnienia w tym tygodniu");
                            employerSuffler = false;

                            Integer randomListsSortingNumber = random.nextInt(6) + 1; //number from 1 to 6
                            listsSortingNumber = randomListsSortingNumber;

                            switch (listsSortingNumber) {
                                case 1: {
                                    for (Integer i = 0; i < possibleEmployees1_1.size(); i++) {
                                        if (possibleEmployees1_1.get(i).isHired == true) {
                                            continue;
                                        }
                                        System.out.println("Pracownik indeks = " + i + " " + possibleEmployees1_1.get(i));
                                    }
                                        System.out.println("Podaj index pracownika, któego chcesz zatudnić lub wpisz 999 aby wyjść: ");
                                        employeeIndex = scanner4.nextInt();
                                    if(employeeIndex == 999){
                                        break;
                                    }
                                    if (employeeIndex < 0 ||  employeeIndex > possibleEmployees1_1.size()) {
                                        System.out.println("Zła cyfra.");
                                        break;
                                    }
                                        if (employeeIndex >= 0 && employeeIndex < possibleEmployees1_1.size()) {
                                            possibleEmployees1_1.get(employeeIndex).isHired = true;
                                            hiredEmployees.add(possibleEmployees1_1.get(employeeIndex));
                                            break;
                                        }
                                        if (possibleEmployees1_1.get(employeeIndex).isHired == true) {
                                            System.out.println("Pracownik jest już zatrudniony");
                                        } else {
                                            System.out.println("Wpisałeś złe dane.");
                                        }
                                }
                                break;
                                case 2: {
                                    for (Integer i = 0; i < possibleEmployees1_2.size(); i++) {
                                        if (possibleEmployees1_2.get(i).isHired == true) {
                                            continue;
                                        }
                                        System.out.println("Pracownik indeks = " + i + " " + possibleEmployees1_2.get(i));
                                    }
                                        System.out.println("Podaj index pracownika, któego chcesz zatudnić lub wpisz 999 aby wyjść: ");
                                        employeeIndex = scanner4.nextInt();
                                    if(employeeIndex == 999){
                                        break;
                                    }
                                    if (employeeIndex < 0 ||  employeeIndex > possibleEmployees1_2.size()) {
                                        System.out.println("Zła cyfra.");
                                        break;
                                    }
                                        if (employeeIndex >= 0 && employeeIndex < possibleEmployees1_2.size()) {
                                            possibleEmployees1_2.get(employeeIndex).isHired = true;
                                            hiredEmployees.add(possibleEmployees1_2.get(employeeIndex));
                                            break;
                                        }
                                        if (possibleEmployees1_2.get(employeeIndex).isHired == true) {
                                            System.out.println("Pracownik jest już zatrudniony");
                                        } else {
                                            System.out.println("Wpisałeś złe dane.");
                                        }
                                }
                                break;
                                case 3: {
                                    for (Integer i = 0; i < possibleEmployees1_3.size(); i++) {
                                        if (possibleEmployees1_3.get(i).isHired == true) {
                                            continue;
                                        }
                                        System.out.println("Pracownik indeks = " + i + " " + possibleEmployees1_3.get(i));
                                    }
                                        System.out.println("Podaj index pracownika, któego chcesz zatudnić lub wpisz 999 aby wyjść: ");
                                        employeeIndex = scanner4.nextInt();
                                    if(employeeIndex == 999){
                                        break;
                                    }
                                    if (employeeIndex < 0 ||  employeeIndex > possibleEmployees1_3.size()) {
                                        System.out.println("Zła cyfra.");
                                        break;
                                    }
                                        if (employeeIndex >= 0 && employeeIndex < possibleEmployees1_3.size()) {
                                            possibleEmployees1_3.get(employeeIndex).isHired = true;
                                            hiredEmployees.add(possibleEmployees1_3.get(employeeIndex));
                                            break;
                                        }
                                        if (possibleEmployees1_3.get(employeeIndex).isHired == true) {
                                            System.out.println("Pracownik jest już zatrudniony");
                                        } else {
                                            System.out.println("Wpisałeś złe dane.");
                                        }
                                }

                                break;
                                case 4: {
                                    for (Integer i = 0; i < possibleEmployees1_4.size(); i++) {
                                        if (possibleEmployees1_1.get(i).isHired == true) {
                                            continue;
                                        }
                                        System.out.println("Pracownik indeks = " + i + " " + possibleEmployees1_4.get(i));
                                    }
                                        System.out.println("Podaj index pracownika, któego chcesz zatudnić lub wpisz 999 aby wyjść: ");
                                        employeeIndex = scanner4.nextInt();
                                    if(employeeIndex == 999){
                                        break;
                                    }
                                    if (employeeIndex < 0 ||  employeeIndex > possibleEmployees1_4.size()) {
                                        System.out.println("Zła cyfra.");
                                        break;
                                    }
                                        if (employeeIndex >= 0 && employeeIndex < possibleEmployees1_4.size()) {
                                            possibleEmployees1_4.get(employeeIndex).isHired = true;
                                            hiredEmployees.add(possibleEmployees1_4.get(employeeIndex));
                                            break;
                                        }
                                        if (possibleEmployees1_4.get(employeeIndex).isHired == true) {
                                            System.out.println("Pracownik jest już zatrudniony");
                                        } else {
                                            System.out.println("Wpisałeś złe dane.");
                                        }
                                }
                                break;
                                case 5: {
                                    for (Integer i = 0; i < possibleEmployees1_5.size(); i++) {
                                        if (possibleEmployees1_5.get(i).isHired == true) {
                                            continue;
                                        }
                                        System.out.println("Pracownik indeks = " + i + " " + possibleEmployees1_5.get(i));
                                    }
                                        System.out.println("Podaj index pracownika, któego chcesz zatudnić lub wpisz 999 aby wyjść: ");
                                        employeeIndex = scanner4.nextInt();
                                    if(employeeIndex == 999){
                                        break;
                                    }
                                    if (employeeIndex < 0 ||  employeeIndex > possibleEmployees1_5.size()) {
                                        System.out.println("Zła cyfra.");
                                        break;
                                    }
                                        if (employeeIndex >= 0 && employeeIndex < possibleEmployees1_5.size()) {
                                            possibleEmployees1_5.get(employeeIndex).isHired = true;
                                            hiredEmployees.add(possibleEmployees1_5.get(employeeIndex));
                                            break;
                                        }
                                        if (possibleEmployees1_5.get(employeeIndex).isHired == true) {
                                            System.out.println("Pracownik jest już zatrudniony");
                                        } else {
                                            System.out.println("Wpisałeś złe dane.");
                                        }
                                }
                                break;
                                case 6: {
                                    for (Integer i = 0; i < possibleEmployees1_6.size(); i++) {
                                        if (possibleEmployees1_6.get(i).isHired == true) {
                                            continue;
                                        }
                                        System.out.println("Pracownik indeks = " + i + " " + possibleEmployees1_6.get(i));
                                    }
                                        System.out.println("Podaj index pracownika, któego chcesz zatudnić lub wpisz 999 aby wyjść: ");
                                        employeeIndex = scanner4.nextInt();
                                    if(employeeIndex == 999){
                                        break;
                                    }
                                    if (employeeIndex < 0 ||  employeeIndex > possibleEmployees1_6.size()) {
                                        System.out.println("Zła cyfra.");
                                        break;
                                    }
                                        if (employeeIndex >= 0 && employeeIndex < possibleEmployees1_6.size()) {
                                            possibleEmployees1_6.get(employeeIndex).isHired = true;
                                            hiredEmployees.add(possibleEmployees1_6.get(employeeIndex));
                                            break;
                                        }
                                        if (possibleEmployees1_6.get(employeeIndex).isHired == true) {
                                            System.out.println("Pracownik jest już zatrudniony");
                                        } else {
                                            System.out.println("Wpisałeś złe dane.");
                                        }
                                }
                                break;
                                default: {
                                    System.out.println("Błąd.");
                                }
                                break;
                            }
                        }
                        else{
                            if(damianGre.isWeekend == true){
                                System.out.println("Jest weekend nie możesz nikogo zatrudniać ani brać nowych projetków.");
                                break;
                            }
                            System.out.println("Oto lista osób do zatrudnienia w tym tygodniu");

                            switch(listsSortingNumber){
                                case 1: {
                                    for (Integer i = 0; i < possibleEmployees1_1.size(); i++) {
                                        if (possibleEmployees1_1.get(i).isHired == true) {
                                            continue;
                                        }
                                        System.out.println("Pracownik indeks = " + i + " " + possibleEmployees1_1.get(i));
                                    }
                                        System.out.println("Podaj index pracownika, któego chcesz zatudnić lub wpisz 999 aby wyjść: ");
                                        employeeIndex = scanner4.nextInt();
                                    if(employeeIndex == 999){
                                        break;
                                    }
                                    if (employeeIndex < 0 ||  employeeIndex > possibleEmployees1_1.size()) {
                                        System.out.println("Zła cyfra.");
                                        break;
                                    }
                                        if(employeeIndex >=0 && employeeIndex < possibleEmployees1_1.size()) {
                                            possibleEmployees1_1.get(employeeIndex).isHired = true;
                                            hiredEmployees.add(possibleEmployees1_1.get(employeeIndex));
                                            break;
                                        }
                                        if(possibleEmployees1_1.get(employeeIndex).isHired == true){
                                            System.out.println("Pracownik jest już zatrudniony");
                                        }else{
                                            System.out.println("Wpisałeś złe dane.");
                                        }
                                }
                                break;
                                case 2:{
                                    for (Integer i = 0; i < possibleEmployees1_2.size(); i++) {
                                        if (possibleEmployees1_2.get(i).isHired == true) {
                                            continue;
                                        }
                                        System.out.println("Pracownik indeks = " + i + " " + possibleEmployees1_2.get(i));
                                    }
                                        System.out.println("Podaj index pracownika, któego chcesz zatudnić lub wpisz 999 aby wyjść: ");
                                        employeeIndex = scanner4.nextInt();
                                    if(employeeIndex == 999){
                                        break;
                                    }
                                    if (employeeIndex < 0 ||  employeeIndex > possibleEmployees1_2.size()) {
                                        System.out.println("Zła cyfra.");
                                        break;
                                    }
                                        if(employeeIndex >=0 && employeeIndex < possibleEmployees1_2.size()) {
                                            possibleEmployees1_2.get(employeeIndex).isHired = true;
                                            hiredEmployees.add(possibleEmployees1_2.get(employeeIndex));
                                            break;
                                        }
                                        if(possibleEmployees1_2.get(employeeIndex).isHired == true){
                                            System.out.println("Pracownik jest już zatrudniony");
                                        }else{
                                            System.out.println("Wpisałeś złe dane.");
                                        }
                                }
                                break;
                                case 3:{
                                    for (Integer i = 0; i < possibleEmployees1_3.size(); i++) {
                                        if (possibleEmployees1_3.get(i).isHired == true) {
                                            continue;
                                        }
                                        System.out.println("Pracownik indeks = " + i + " " + possibleEmployees1_3.get(i));
                                    }
                                        System.out.println("Podaj index pracownika, któego chcesz zatudnić lub wpisz 999 aby wyjść: ");
                                        employeeIndex = scanner4.nextInt();
                                    if(employeeIndex == 999){
                                        break;
                                    }
                                    if (employeeIndex < 0 ||  employeeIndex > possibleEmployees1_3.size()) {
                                        System.out.println("Zła cyfra.");
                                        break;
                                    }
                                        if(employeeIndex >=0 && employeeIndex < possibleEmployees1_3.size()) {
                                            possibleEmployees1_3.get(employeeIndex).isHired = true;
                                            hiredEmployees.add(possibleEmployees1_3.get(employeeIndex));
                                            break;
                                        }
                                        if(possibleEmployees1_3.get(employeeIndex).isHired == true){
                                            System.out.println("Pracownik jest już zatrudniony");
                                        }else{
                                            System.out.println("Wpisałeś złe dane.");
                                        }
                                }
                                break;
                                case 4:{
                                    for (Integer i = 0; i < possibleEmployees1_4.size(); i++) {
                                        if (possibleEmployees1_1.get(i).isHired == true) {
                                            continue;
                                        }
                                        System.out.println("Pracownik indeks = " + i + " " + possibleEmployees1_4.get(i));
                                    }
                                        System.out.println("Podaj index pracownika, któego chcesz zatudnić lub wpisz 999 aby wyjść: ");
                                        employeeIndex = scanner4.nextInt();
                                    if(employeeIndex == 999){
                                        break;
                                    }
                                    if (employeeIndex < 0 ||  employeeIndex > possibleEmployees1_4.size()) {
                                        System.out.println("Zła cyfra.");
                                        break;
                                    }
                                        if(employeeIndex >=0 && employeeIndex < possibleEmployees1_4.size()) {
                                            possibleEmployees1_4.get(employeeIndex).isHired = true;
                                            hiredEmployees.add(possibleEmployees1_4.get(employeeIndex));
                                            break;
                                        }
                                        if(possibleEmployees1_4.get(employeeIndex).isHired == true){
                                            System.out.println("Pracownik jest już zatrudniony");
                                        }else{
                                            System.out.println("Wpisałeś złe dane.");
                                        }
                                }
                                break;
                                case 5:{
                                    for (Integer i = 0; i < possibleEmployees1_5.size(); i++) {
                                        if (possibleEmployees1_5.get(i).isHired == true) {
                                            continue;
                                        }
                                        System.out.println("Pracownik indeks = " + i + " " + possibleEmployees1_5.get(i));
                                    }
                                        System.out.println("Podaj index pracownika, któego chcesz zatudnić lub wpisz 999 aby wyjść: ");
                                        employeeIndex = scanner4.nextInt();
                                    if(employeeIndex == 999){
                                        break;
                                    }
                                    if (employeeIndex < 0 ||  employeeIndex > possibleEmployees1_5.size()) {
                                        System.out.println("Zła cyfra.");
                                        break;
                                    }
                                        if(employeeIndex >=0 && employeeIndex < possibleEmployees1_1.size()) {
                                            possibleEmployees1_5.get(employeeIndex).isHired = true;
                                            hiredEmployees.add(possibleEmployees1_5.get(employeeIndex));
                                            break;
                                        }
                                        if(possibleEmployees1_5.get(employeeIndex).isHired == true){
                                            System.out.println("Pracownik jest już zatrudniony");
                                        }else{
                                            System.out.println("Wpisałeś złe dane.");
                                        }
                                }
                                break;
                                case 6:{
                                    for (Integer i = 0; i < possibleEmployees1_6.size(); i++) {
                                        if (possibleEmployees1_6.get(i).isHired == true) {
                                            continue;
                                        }
                                        System.out.println("Pracownik indeks = " + i + " " + possibleEmployees1_6.get(i));
                                    }
                                        System.out.println("Podaj index pracownika, któego chcesz zatudnić lub wpisz 999 aby wyjść: ");
                                        employeeIndex = scanner4.nextInt();
                                    if(employeeIndex == 999){
                                        break;
                                    }
                                    if (employeeIndex < 0 ||  employeeIndex > possibleEmployees1_6.size()) {
                                        System.out.println("Zła cyfra.");
                                        break;
                                    }
                                        if(employeeIndex >=0 && employeeIndex < possibleEmployees1_6.size()) {
                                            possibleEmployees1_6.get(employeeIndex).isHired = true;
                                            hiredEmployees.add(possibleEmployees1_6.get(employeeIndex));
                                            break;
                                        }
                                        if(possibleEmployees1_6.get(employeeIndex).isHired == true){
                                            System.out.println("Pracownik jest już zatrudniony");
                                        }else{
                                            System.out.println("Wpisałeś złe dane.");
                                        }
                                }
                                break;
                                default:{
                                    System.out.println("Błąd.");
                                }
                                break;
                            }
                        }
                    }
                    break;

                    case 3: {
                        Integer friendEmployeeIndex;

                        if ((moduloMondayShuffle == true) && (damianGre.isWeekend == false && friendMondayShuffle == true)) {
                            System.out.println("Oto lista osób do zatrudnienia w tym tygodniu");
                            friendMondayShuffle = false;

                            Integer randomListsSortingNumber = random.nextInt(3) + 1; //number from 1 to 3
                            friendListsSortingNumber = randomListsSortingNumber;

                            switch (friendListsSortingNumber) {
                                case 1: {
                                    for (Integer i = 0; i < friendEmployees1.size(); i++) {
                                        if (friendEmployees1.get(i).isHired == true) {
                                            continue;
                                        }
                                        System.out.println("Pracownik indeks = " + i + " " + friendEmployees1.get(i));
                                    }
                                    System.out.println("Podaj index pracownika, któego chcesz zatudnić lub wpisz 999 aby wyjść: ");
                                    friendEmployeeIndex = scanner4.nextInt();
                                    if (friendEmployeeIndex == 999) {
                                        break;
                                    }
                                    if (friendEmployeeIndex < 0 ||  friendEmployeeIndex > friendEmployees1.size()) {
                                        System.out.println("Zła cyfra.");
                                        break;
                                    }
                                    if (friendEmployeeIndex >= 0 && friendEmployeeIndex < friendEmployees1.size()) {
                                        friendEmployees1.get(friendEmployeeIndex).isHired = true;
                                        hiredEmployees.add(friendEmployees1.get(friendEmployeeIndex));
                                        break;
                                    }
                                    if (possibleEmployees1_1.get(friendEmployeeIndex).isHired == true) {
                                        System.out.println("Pracownik jest już zatrudniony");
                                    } else {
                                        System.out.println("Wpisałeś złe dane.");
                                    }
                                }
                                break;
                                case 2: {
                                    for (Integer i = 0; i < friendEmployees2.size(); i++) {
                                        if (friendEmployees2.get(i).isHired == true) {
                                            continue;
                                        }
                                        System.out.println("Pracownik indeks = " + i + " " + friendEmployees2.get(i));
                                    }
                                    System.out.println("Podaj index pracownika, któego chcesz zatudnić lub wpisz 999 aby wyjść: ");
                                    friendEmployeeIndex = scanner4.nextInt();
                                    if (friendEmployeeIndex == 999) {
                                        break;
                                    }
                                    if (friendEmployeeIndex < 0 ||  friendEmployeeIndex > friendEmployees2.size()) {
                                        System.out.println("Zła cyfra.");
                                        break;
                                    }
                                    if (friendEmployeeIndex >= 0 && friendEmployeeIndex < friendEmployees2.size()) {
                                        friendEmployees2.get(friendEmployeeIndex).isHired = true;
                                        hiredEmployees.add(friendEmployees2.get(friendEmployeeIndex));
                                        break;
                                    }
                                    if (friendEmployees2.get(friendEmployeeIndex).isHired == true) {
                                        System.out.println("Pracownik jest już zatrudniony");
                                    } else {
                                        System.out.println("Wpisałeś złe dane.");
                                    }
                                }
                                break;
                                case 3: {
                                    for (Integer i = 0; i < friendEmployees3.size(); i++) {
                                        if (friendEmployees3.get(i).isHired == true) {
                                            continue;
                                        }
                                        System.out.println("Pracownik indeks = " + i + " " + friendEmployees3.get(i));
                                    }
                                    System.out.println("Podaj index pracownika, któego chcesz zatudnić lub wpisz 999 aby wyjść: ");
                                    friendEmployeeIndex = scanner4.nextInt();
                                    if (friendEmployeeIndex == 999) {
                                        break;
                                    }
                                    if (friendEmployeeIndex < 0 ||  friendEmployeeIndex > friendEmployees3.size()) {
                                        System.out.println("Zła cyfra.");
                                        break;
                                    }
                                    if (friendEmployeeIndex >= 0 && friendEmployeeIndex < friendEmployees3.size()) {
                                        friendEmployees3.get(friendEmployeeIndex).isHired = true;
                                        hiredEmployees.add(friendEmployees3.get(friendEmployeeIndex));
                                        break;
                                    }
                                    if (friendEmployees3.get(friendEmployeeIndex).isHired == true) {
                                        System.out.println("Pracownik jest już zatrudniony");
                                    } else {
                                        System.out.println("Wpisałeś złe dane.");
                                    }
                                }
                                break;
                            }
                            break;
                        }else{
                            if(damianGre.isWeekend == true){
                                System.out.println("Jest weekend nie możesz nikogo zatrudniać ani brać nowych projetków.");
                                break;
                            }
                            System.out.println("Oto lista osób do zatrudnienia w tym tygodniu");
                            switch (friendListsSortingNumber) {
                                case 1: {
                                    for (Integer i = 0; i < friendEmployees1.size(); i++) {
                                        if (friendEmployees1.get(i).isHired == true) {
                                            continue;
                                        }
                                        System.out.println("Pracownik indeks = " + i + " " + friendEmployees1.get(i));
                                    }
                                    System.out.println("Podaj index pracownika, któego chcesz zatudnić lub wpisz 999 aby wyjść: ");
                                    friendEmployeeIndex = scanner4.nextInt();
                                    if (friendEmployeeIndex == 999) {
                                        break;
                                    }
                                    if (friendEmployeeIndex < 0 ||  friendEmployeeIndex > friendEmployees1.size()) {
                                        System.out.println("Zła cyfra.");
                                        break;
                                    }
                                    if (friendEmployeeIndex >= 0 && friendEmployeeIndex < friendEmployees1.size()) {
                                        friendEmployees1.get(friendEmployeeIndex).isHired = true;
                                        hiredEmployees.add(friendEmployees1.get(friendEmployeeIndex));
                                        break;
                                    }
                                    if (possibleEmployees1_1.get(friendEmployeeIndex).isHired == true) {
                                        System.out.println("Pracownik jest już zatrudniony");
                                    } else {
                                        System.out.println("Wpisałeś złe dane.");
                                    }
                                }
                                break;
                                case 2: {
                                    for (Integer i = 0; i < friendEmployees2.size(); i++) {
                                        if (friendEmployees2.get(i).isHired == true) {
                                            continue;
                                        }
                                        System.out.println("Pracownik indeks = " + i + " " + friendEmployees2.get(i));
                                    }
                                    System.out.println("Podaj index pracownika, któego chcesz zatudnić lub wpisz 999 aby wyjść: ");
                                    friendEmployeeIndex = scanner4.nextInt();
                                    if (friendEmployeeIndex == 999) {
                                        break;
                                    }
                                    if (friendEmployeeIndex < 0 ||  friendEmployeeIndex > friendEmployees2.size()) {
                                        System.out.println("Zła cyfra.");
                                        break;
                                    }
                                    if (friendEmployeeIndex >= 0 && friendEmployeeIndex < friendEmployees2.size()) {
                                        friendEmployees2.get(friendEmployeeIndex).isHired = true;
                                        hiredEmployees.add(friendEmployees2.get(friendEmployeeIndex));
                                        break;
                                    }
                                    if (friendEmployees2.get(friendEmployeeIndex).isHired == true) {
                                        System.out.println("Pracownik jest już zatrudniony");
                                    } else {
                                        System.out.println("Wpisałeś złe dane.");
                                    }
                                }
                                break;
                                case 3: {
                                    for (Integer i = 0; i < friendEmployees3.size(); i++) {
                                        if (friendEmployees3.get(i).isHired == true) {
                                            continue;
                                        }
                                        System.out.println("Pracownik indeks = " + i + " " + friendEmployees3.get(i));
                                    }
                                    System.out.println("Podaj index pracownika, któego chcesz zatudnić lub wpisz 999 aby wyjść: ");
                                    friendEmployeeIndex = scanner4.nextInt();
                                    if (friendEmployeeIndex == 999) {
                                        break;
                                    }
                                    if (friendEmployeeIndex < 0 ||  friendEmployeeIndex > friendEmployees3.size()) {
                                        System.out.println("Zła cyfra.");
                                        break;
                                    }
                                    if (friendEmployeeIndex >= 0 && friendEmployeeIndex < friendEmployees3.size()) {
                                        friendEmployees3.get(friendEmployeeIndex).isHired = true;
                                        hiredEmployees.add(friendEmployees3.get(friendEmployeeIndex));
                                        break;
                                    }
                                    if (friendEmployees3.get(friendEmployeeIndex).isHired == true) {
                                        System.out.println("Pracownik jest już zatrudniony");
                                    } else {
                                        System.out.println("Wpisałeś złe dane.");
                                    }
                                }
                                break;
                            }
                            break;
                        }
                    }
                    case 4: {
                        System.out.println("Pracujesz nad tymi projektami: ");
                        for (Project projects : myProjectsInWork) {
                            System.out.println(projects);
                        }
                    }
                    break;

                    case 5: {

                        for (Integer x = 0; x < hiredEmployees.size(); x++) {
                            if (hiredEmployees.get(x).isHired == false) {
                                continue;
                            }
                            System.out.println("Employer id number is: " + x + ". " + hiredEmployees.get(x));
                        }
                    }
                        break;
                    case 6: {
                        Integer fireEmployerIndex = 0;
                        System.out.println("Oto twoi pracownicy.");
                        for (Integer x = 0; x < hiredEmployees.size(); x++) {
                            if (hiredEmployees.get(x).isHired == false) {
                                continue;
                            }
                            System.out.println("Employer id number is: " + x + ". " + hiredEmployees.get(x));
                        }
                            System.out.println("Wpisz index pracownika do zwolnenia lub 999 aby wyjść.");
                            fireEmployerIndex = scanner5.nextInt();
                             if (fireEmployerIndex == 999) {
                                 break;
                             }
                            if (fireEmployerIndex < 0 ||  fireEmployerIndex > hiredEmployees.size()) {
                                System.out.println("Zła cyfra.");
                                break;
                            }
                            if(fireEmployerIndex >=0 && fireEmployerIndex < hiredEmployees.size()) {
                                hiredEmployees.get(fireEmployerIndex).isHired = false;
                                System.out.println("Pracownik: " +  hiredEmployees.get(fireEmployerIndex) + " Został zwolniony");
                                break;
                            }
                            if(possibleEmployees1_6.get(fireEmployerIndex).isHired == false){
                                System.out.println("Pracownik jest już zwolniony");
                            }else{
                                System.out.println("Wpisałeś złe dane.");
                            }
                    }
                    break;
                    case 7: {
                        endDay = true;
                        for (Employees employees : hiredEmployees) {
                            if (employees.dayToCanBeFired == 0) {
                                continue;
                            }
                            employees.dayToCanBeFired--;
                        }
                        for (Employees employees : hiredEmployees) {
                            damianGre.balance -= employees.dailySalary;
                            System.out.println("Your salary system has paid: " + employees.dailySalary + " To: " + employees);
                        }
                        System.out.println("\nDay has ended.\n");
                        try {
                            for (Integer timer = 1; timer > 0; timer--) {
                                System.out.println("New day starts in: " + timer + " seconds."); //10 sekund przerwy do nastepnego dnia
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
        }while (menuIsActive == true) ;
    }
}