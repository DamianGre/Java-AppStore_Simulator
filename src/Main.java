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

        Boolean menuIsActive = true;
        Boolean newDay = false;
        Boolean firstDay = true;
        Integer weeklyProjectListSearcher, weeklyEmployeesListSearcher , weeklyFriendsListSearcher;
        Integer moduloMonday = 1;
        Integer moduloSaturday = 1;
        Integer moduloSunday = 1;
        Integer employerListIndexer = 0;
        Boolean nextDayIsMonday = true;
        Integer listsSortingNumber = 3;

        Company damianGre = new Company("DamianGre");


        List<Project> projects = new ArrayList<Project>();
        List<Employees> possibleEmployees = new ArrayList<Employees>();
        List<Employees> hiredEmployees = new ArrayList<Employees>();
        List<Employees> weeklyPossibleEmployesList = new ArrayList<Employees>();
        List<Employees> friendEmployees = new ArrayList<Employees>();
        List<Employees> hiredFriendEmployees = new ArrayList<Employees>();


        List<List> weeklyPossibleEmployes = new ArrayList<List>();




        //Projects to pickup by random generator

        //10 projects from 1 level complexity
        projects.add(new Project("Web app", Project.ProjectType.Frontend, null, null,
                "Heyos", 5, 20000.00, 7000.00, 5,
                1));
        projects.add(new Project("SPA", Project.ProjectType.Pretashop, null, null,
                "Spasan", 3, 15000.00, 5000.00, 5,
                1));
        projects.add(new Project("Web app", Project.ProjectType.Mobile,null,  null,
                "Felinta", 3, 22000.00, 7000.00, 5,
                1));
        projects.add(new Project("Mobile App", Project.ProjectType.Wordpress,null,  null,
                "Gagle", 3, 25000.00, 8000.00, 5,
                1));
        projects.add(new Project("Data Base", Project.ProjectType.Database, null, null,
                "Zawiru", 3, 17500.00, 8000.00, 5,
                1));
        projects.add(new Project("Web app", Project.ProjectType.Mobile, null, null,
                "Heyos", 5, 20000.00, 7000.00, 5,
                1));
        projects.add(new Project("SPA", Project.ProjectType.Frontend, null, null,
                "Spasan", 3, 15000.00, 5000.00, 5,
                1));
        projects.add(new Project("Web app", Project.ProjectType.Backend, null, null,
                "Felinta", 3, 22000.00, 7000.00, 5,
                1));
        projects.add(new Project("Mobile App", Project.ProjectType.Wordpress, null, null,
                "Gagle", 3, 25000.00, 8000.00, 5,
                1));
        projects.add(new Project("Data Base", Project.ProjectType.Pretashop, null, null,
                "Zawiru", 3, 17500.00, 8000.00, 5,
                1));

        //9 projects from 2 level complexity
        projects.add(new Project("Web app", Project.ProjectType.Frontend, Project.ProjectType.Backend, null,
                "Heyos", 5, 20000.00, 7000.00, 5,
                2));
        projects.add(new Project("SPA", Project.ProjectType.Frontend, Project.ProjectType.Database, null,
                "Spasan", 3, 15000.00, 5000.00, 5,
                2));
        projects.add(new Project("Web app", Project.ProjectType.Mobile, Project.ProjectType.Backend, null,
                "Felinta", 3, 22000.00, 7000.00, 5,
                2));
        projects.add(new Project("Mobile App", Project.ProjectType.Frontend, Project.ProjectType.Wordpress, null,
                "Gagle", 3, 25000.00, 8000.00, 5,
                2));
        projects.add(new Project("Data Base", Project.ProjectType.Mobile, Project.ProjectType.Database, null,
                "Zawiru", 3, 17500.00, 8000.00, 5,
                2));
        projects.add(new Project("Web app", Project.ProjectType.Frontend, Project.ProjectType.Wordpress, null,
                "Heyos", 5, 20000.00, 7000.00, 5,
                2));
        projects.add(new Project("SPA", Project.ProjectType.Mobile, Project.ProjectType.Database, null,
                "Spasan", 3, 15000.00, 5000.00, 5,
                2));
        projects.add(new Project("Web app", Project.ProjectType.Frontend, Project.ProjectType.Backend, null,
                "Felinta", 3, 22000.00, 7000.00, 5,
                2));
        projects.add(new Project("Mobile App", Project.ProjectType.Frontend, Project.ProjectType.Wordpress, null,
                "Gagle", 3, 25000.00, 8000.00, 5,
                2));


        //4 projects from 3 level complexity
        projects.add(new Project("SPA", Project.ProjectType.Frontend, Project.ProjectType.Backend, Project.ProjectType.Pretashop,
                "Spasan", 3, 15000.00, 5000.00, 5,
                3));
        projects.add(new Project("Web app", Project.ProjectType.Mobile, Project.ProjectType.Backend, Project.ProjectType.Database,
                "Felinta", 3, 22000.00, 7000.00, 5,
                3));
        projects.add(new Project("Mobile App", Project.ProjectType.Frontend, Project.ProjectType.Wordpress, Project.ProjectType.Database,
                "Gagle", 3, 25000.00, 8000.00, 5,
                3));
        projects.add(new Project("Data Base", Project.ProjectType.Database, Project.ProjectType.Backend, Project.ProjectType.Wordpress,
                "Zawiru", 3, 17500.00, 8000.00, 5,
                3));

        //List of 20 employees to hire

        possibleEmployees.add(new Employees("Damian", true, false, false, false, false,false, 5000.00));
        possibleEmployees.add(new Employees("Tomasz", false, true, false, false, false,false, 5000.00));
        possibleEmployees.add(new Employees("Karolina", false, false, true, false, false,false, 5000.00));
        possibleEmployees.add(new Employees("Borys", false, false, false, true, false,false, 5000.00));
        possibleEmployees.add(new Employees("Sława", false, false, false, false, true,false, 5000.00));
        possibleEmployees.add(new Employees("Dorota", false, false, false, false, false,true, 5000.00));
        possibleEmployees.add(new Employees("Kamil", true, false, true, false, false,false, 7500.00));
        possibleEmployees.add(new Employees("Piotr", true, true, false, false, false,false, 7500.00));
        possibleEmployees.add(new Employees("Sasza", true, false, false, true, false,false, 7500.00));
        possibleEmployees.add(new Employees("Anna", true, false, false, false, true,false, 7500.00));
        possibleEmployees.add(new Employees("Sabina", true, false, false, false, false,true, 75000.00));
        possibleEmployees.add(new Employees("Dariusz", true, true, false, true, false,false, 8000.00));
        possibleEmployees.add(new Employees("Brygida", true, true, false, false, true,false, 8000.00));
        possibleEmployees.add(new Employees("Donald", true, true, false, true, true,false, 9000.00));
        possibleEmployees.add(new Employees("Beata", true, true, true, true, true,true, 12000.00));
        possibleEmployees.add(new Employees("Karyna", true, false, false, false, false,true, 15000.00));
        possibleEmployees.add(new Employees("Julia", true, true, false, true, false,false, 16000.00));
        possibleEmployees.add(new Employees("Sebastian", true, true, true, false, true,false, 15000.00));
        possibleEmployees.add(new Employees("Patryk", true, true, true, true, true,true, 14000.00));
        possibleEmployees.add(new Employees("Stanisław", true, true, true, true, true,true, 17000.00));

        //List of 3 friends that. With random skills
        int firendSkills = random.nextInt(100) + 1;
        if (firendSkills <= 20) {
            Employees friend1 = new Employees("Krystian",true, true, true, true, true,true, null);
            friend1.projectSalary = 12500.00;
            friend1.workingOnProjectDays = 12;
            friend1.failureChanace = 0;
            friendEmployees.add(friend1);
            Employees friend2 = new Employees("Krystian",true, true, false, true, false,true, null);
            friend2.projectSalary = 9250.00;
            friend2.workingOnProjectDays = 18;
            friend2.failureChanace = 12;
            friendEmployees.add(friend2);
            Employees friend3 = new Employees("Krystian",true, true, true, true, true,true, null);
            friend3.projectSalary = 6500.00;
            friend3.workingOnProjectDays = 22;
            friend3.failureChanace = 31;
            friendEmployees.add(friend3);
        }
        else if(firendSkills > 20 && firendSkills <= 60) {
            Employees friend1 = new Employees("Krystian",true, true, true, true, true,true, null);
            friend1.projectSalary = 13000.00;
            friend1.workingOnProjectDays = 15;
            friend1.failureChanace = 0;
            friendEmployees.add(friend1);
            Employees friend2 = new Employees("Krystian",true, true, true, false, true,true, null);
            friend2.projectSalary = 9000.00;
            friend2.workingOnProjectDays = 20;
            friend2.failureChanace = 15;
            friendEmployees.add(friend2);
            Employees friend3 = new Employees("Krystian",true, false, true, true, false,false, null);
            friend3.projectSalary = 7200.00;
            friend3.workingOnProjectDays = 25;
            friend3.failureChanace = 30;
            friendEmployees.add(friend3);
        }
        else if(firendSkills > 60 && firendSkills <= 100){
            Employees friend1 = new Employees("Krystian",true, true, true, true, true,true, null);
            friend1.projectSalary = 16000.00;
            friend1.workingOnProjectDays = 17;
            friend1.failureChanace = 0;
            friendEmployees.add(friend1);
            Employees friend2 = new Employees("Krystian",false, false, true, true, true,false, null);
            friend2.projectSalary = 12000.00;
            friend2.workingOnProjectDays = 21;
            friend2.failureChanace = 17;
            friendEmployees.add(friend2);
            Employees friend3 = new Employees("Krystian",false, true, false, true, false,true, null);
            friend3.projectSalary = 9500.00;
            friend3.workingOnProjectDays = 27;
            friend3.failureChanace = 35;
            friendEmployees.add(friend3);
        }

        System.out.println(projects.get(0));
        System.out.println("Balance: " + damianGre.balance);
        damianGre.acceptProject(projects.get(0));
        System.out.println("Balance: " + damianGre.balance);


        do {
            if(newDay == true) {
                System.out.println("\nNEW DAY!");
                newDay = false;
            }

            if(damianGre.dayCounter == 1 && firstDay == true) {
                System.out.println("\nFirst Day of Your Company.");
                Integer randomListsSortingNumber = random.nextInt(9) + 1; //number from 0 to 9
                listsSortingNumber = randomListsSortingNumber;
            }


            if(damianGre.dayCounter == 6 || (damianGre.dayCounter % moduloSaturday == 0 && moduloSaturday > 1)){
                if(damianGre.dayCounter == moduloMonday) {
                    System.out.println("It's weekend(Saturday). You can't hire people and take new projects.");
                    damianGre.isWeekend = true;
                }
            }
            if(damianGre.dayCounter == 7 || (damianGre.dayCounter % moduloSunday == 0 && moduloSunday > 1)){
                    if(damianGre.dayCounter == moduloMonday) {
                        System.out.println("It's weekend(Sunday). You can't hire people and take new projects.");
                        damianGre.isWeekend = true;
                        nextDayIsMonday = true;
                    }
            }
            if(damianGre.dayCounter == moduloMonday) {
                if (moduloMonday != 1) {
                    System.out.println("It's Monday, new projects and employers are avaiable.");
                    Integer randomListsSortingNumber = random.nextInt(9) + 1; //number from 0 to 9
                    listsSortingNumber = randomListsSortingNumber;
                    moduloMonday += 7;
                }
            }   
            // Every 30 days is chance to get robbed
            if(damianGre.dayCounter % 30 == 0) {
                Integer robbery = random.nextInt(100) + 1; // 10% chance to get robbed
                if (robbery <= 10) //10% to get robbed
                {
                    System.out.println("\nROBBERY! JAROSŁAW K. HAS STEAL YOUR MONEY!\n");
                    damianGre.balance = damianGre.balance - (damianGre.balance * 0.10);
                }
            }
            System.out.println("modulo Monday: " + moduloMonday);
            System.out.println("Day: " + damianGre.dayCounter);

            System.out.println("\nChoose Your action.\n" +
            "Enter '1' to check list of available work projects.\n" +
            "Enter '2' to check potential employees.\n" +
            "Enter '3' to check friends that can do projects by itself.\n" +
            "Enter '4' to check projects in progress.\n" +
            "Enter '5' to check your employees.\n" +
            "Enter '6' Add a job advertisement in the newspaper.\n" +
            "Enter '7' End day.\n" +
            "Enter '0' To end application!");

            int menuChoose = scanner1.nextInt();

            switch (menuChoose) {
                case 1:
                    for (Project project : projects) {
                        System.out.println(project);
                    }
                     break;
                /* case 2:
                    System.out.println(moduloMonday);
                    System.out.println(damianGre.dayCounter);
                    System.out.println(damianGre.dayCounter%moduloMonday);
                    System.out.println(damianGre.isWeekend);
                    System.out.println(nextDayIsMonday);
                    if((damianGre.dayCounter % moduloMonday == 0) && (damianGre.isWeekend == false && nextDayIsMonday == true)) {
                        Integer randomListsSortingNumber = random.nextInt(5) + 1; //number from 1 to 5
                        listsSortingNumber = randomListsSortingNumber;

                        Integer moduloOneCutter = 1;

                        nextDayIsMonday = false;

                        for(Employees possibleEmployeesShuffle: possibleEmployees){
                            possibleEmployeesShuffle.canBeHired = false;
                        }

                        System.out.println("Employees to hire: "); // MUSZE DODAC ZE JAK GO NIE MA NA LISCIE TO GO NIE MOZNA HIRE
                        for(Integer x = 0; x < possibleEmployees.size(); x++){
                            if(x % listsSortingNumber == 0) 
                            {
                                if(listsSortingNumber == 1)
                                {
                                    if(moduloOneCutter < 3)
                                    {
                                        moduloOneCutter++;
                                        possibleEmployees.get(x).canBeHired = true;
                                        weeklyPossibleEmployesList.add(possibleEmployees.get(x));
                                        continue;
                                    }
                                    else if(moduloOneCutter >=3 && moduloOneCutter < 6){
                                        moduloOneCutter++;
                                        continue;
                                    }
                                    else if(moduloOneCutter == 6){
                                        moduloOneCutter = 1;
                                    }
                                }
                                else if(listsSortingNumber == 2 || listsSortingNumber == 4 || listsSortingNumber == 5)
                                {
                                    if(x == 0 || x == 2 || x == 3 ||  x == 4 ||  x == 5 || x == 6 || x == 8 || x == 10 || x == 12 ||  x == 13 || x == 14 ||  x == 15 ||  x == 17 || x == 19)
                                    {
                                        Integer randomIndexZeroDisabler = random.nextInt(2) + 1; //number from 1 to 3
                                        if(randomIndexZeroDisabler == 2)
                                        {
                                        continue;
                                        }
                                    }
                                    else
                                    {
                                        weeklyPossibleEmployesList.add(possibleEmployees.get(x));
                                        possibleEmployees.get(x).canBeHired = true;
                                        weeklyPossibleEmployes.add(weeklyPossibleEmployesList);
                                    }
                                }
                            }
                        }
                        for(Integer x1 =0; x1 < weeklyPossibleEmployes.get(employerListIndexer).size(); x1++){
                            System.out.println("Employer id number is: " + x1 + ". " + possibleEmployees.get(x1));
                        }
                    }
                    else if(nextDayIsMonday == false){
                        for(Integer x=0; x < weeklyPossibleEmployes.get(employerListIndexer).size(); x++){
                            System.out.println("Employer id number is: " + x + ". " + possibleEmployees.get(x));
                        }


                    }

                    System.out.println("\nIf u want to hire employee enter his id number. If You want to quit enter: 999.");
                    Integer employerNumber = scanner2.nextInt();
                    if(employerNumber == 999)
                    {
                        break;
                    }
                    else {
                        if(possibleEmployees.get(employerNumber).canBeHired == true){
                            System.out.println("\nYou have hired " + possibleEmployees.get(employerNumber).name + ".") ;
                            possibleEmployees.get(employerNumber).canBeHired = false;
                            hiredEmployees.add(possibleEmployees.get(employerNumber));
                        }
                        else if (possibleEmployees.get(employerNumber).canBeHired == false) {
                            System.out.println("\nPerson is already hired by You.");
                        }
                        else{
                            System.out.println("\nWrong employee's id.");
                            break;
                        }
                    }
                    break;

                 */

                case 3:
                    if((damianGre.dayCounter % 5 == 0) && (damianGre.isWeekend == false)){
                        Integer randomFriennds = random.nextInt(3) + 1;
                        for(Integer x = 0; x < friendEmployees.size(); x++){
                            System.out.println();
                        }
                    }
                    else if(damianGre.isWeekend == false){
                        System.out.println();
                    }
                    else if(damianGre.isWeekend == true){
                        System.out.println("It is weekend so there is no possible friend employees to give project to.");
                    }

                     break;
                case 4:
                    ;
                    break;
                case 5:
                    for(Employees employees: hiredEmployees){
                        System.out.println(employees);
                    }
                    break;
                case 6:
                    ;
                    break;
                case 7:{
                    System.out.println("Day has ended.\n");
                    try
                    {
                        for(Integer timer = 1; timer >= 0; timer--)
                        {
                        System.out.println("New day starts in: " + timer + " seconds."); //10 sekund przerwy do nastepnego dnia
                        TimeUnit.SECONDS.sleep(1);
                        }
                    }
                    catch(InterruptedException ex)
                    {
                        ex.printStackTrace();
                    }
                    if(damianGre.dayCounter == 1 && firstDay == true) {
                        firstDay = false;
                        moduloMonday += 7;
                    }
                    if(damianGre.dayCounter == 6 || damianGre.dayCounter % moduloSaturday == 0) {
                        moduloSaturday += 7;
                    }
                    if(damianGre.dayCounter == 7 || damianGre.dayCounter % moduloSunday == 0) {
                        moduloSunday += 7;
                        employerListIndexer++;
                        nextDayIsMonday = true;
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
        }while(menuIsActive == true);
    }
}