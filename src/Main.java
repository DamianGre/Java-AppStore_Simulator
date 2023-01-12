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

        ListAdder listAdder = new ListAdder();

        Boolean menuIsActive = true;
        Boolean newDay = false;
        Boolean firstDay = true;
        Boolean nextDayIsMonday = true;
        Boolean employerSuffler = true;
        Boolean friendMondayShuffle =true;
        Boolean endDay = false;
        Integer weeklyProjectListSearcher, weeklyEmployeesListSearcher, weeklyFriendsListSearcher;
        Integer moduloMonday = 1;
        Integer firendSkills = 0;
        Boolean moduloMondayShuffle = true;
        Integer moduloSaturday = 0;
        Integer moduloSunday = 0;
        Integer employerListIndexer = 0;
        Integer empolyer1 = 0, empolyer2 = 0, empolyer3 = 0, empolyer4 = 0, empolyer5 = 0;
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
        listAdder.possibleProjectAdderTier1(projects);
        listAdder.possibleProjectAdderTier2(projects);
        listAdder.possibleProjectAdderTier3(projects);
        //List of 20 employees to hire
        listAdder.possibleEmployesAdder(possibleEmployees);
        //List of 3 friends that. With random skills
        listAdder.friendEmployes(friendEmployees);

        System.out.println(projects.get(0));
        System.out.println("Balance: " + damianGre.balance);
        damianGre.acceptProject(projects.get(0));
        System.out.println("Balance: " + damianGre.balance);


        do {
            System.out.println("\nZEW ZEW ZEW MENU\n");
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

                System.out.println("\nChoose Your action.\n" +
                        "Enter '1' to check list of available work projects.\n" +
                        "Enter '2' to check potential employees.\n" +
                        "Enter '3' to check friends that can do projects by itself.\n" +
                        "Enter '4' to check projects in progress.\n" +
                        "Enter '5' print your employees.\n" +
                        "Enter '6' to fire employees.\n" +
                        "Enter '7' End day.\n" +
                        "Enter '0' To end application!");

                int menuChoose = scanner1.nextInt();

                switch (menuChoose) {
                    case 1:
                        for (Project project : projects) {
                            System.out.println(project);
                        }
                        break;
                    case 2: {
                        if ((moduloMondayShuffle == true) && (damianGre.isWeekend == false && employerSuffler == true)) {
                            System.out.println("SZUFLUJEMY");

                            Integer randomListsSortingNumber = random.nextInt(5) + 1; //number from 1 to 5
                            listsSortingNumber = randomListsSortingNumber;

                            empolyer1 = random.nextInt(25); //number from 0 to 20
                            empolyer2 = random.nextInt(25); //number from 0 to 20
                            empolyer3 = random.nextInt(25); //number from 0 to 20
                            empolyer4 = random.nextInt(25); //number from 0 to 20
                            empolyer5 = random.nextInt(25); //number from 0 to 20

                            Integer moduloOneCutter = 1;

                            employerSuffler = false;
                            for (Employees possibleEmployeesShuffle : possibleEmployees) {
                                possibleEmployeesShuffle.canBeHired = false;
                            }
                            System.out.println("Employees to hire: "); // MUSZE DODAC ZE JAK GO NIE MA NA LISCIE TO GO NIE MOZNA HIRE
                            for (Integer x = 0; x < possibleEmployees.size(); x++) {
                                if (x == empolyer1) {
                                    if (possibleEmployees.get(x).isHired == true) {
                                        continue;
                                    }
                                    possibleEmployees.get(x).canBeHired = true;
                                    System.out.println("Employer id number is: " + x + ". " + possibleEmployees.get(x));
                                } else if (x == empolyer2) {
                                    if (possibleEmployees.get(x).isHired == true) {
                                        continue;
                                    }
                                    possibleEmployees.get(x).canBeHired = true;
                                    System.out.println("Employer id number is: " + x + ". " + possibleEmployees.get(x));
                                } else if (x == empolyer3) {
                                    if (possibleEmployees.get(x).isHired == true) {
                                        continue;
                                    }
                                    possibleEmployees.get(x).canBeHired = true;
                                    System.out.println("Employer id number is: " + x + ". " + possibleEmployees.get(x));
                                } else if (x == empolyer4) {
                                    if (possibleEmployees.get(x).isHired == true) {
                                        continue;
                                    }
                                    possibleEmployees.get(x).canBeHired = true;
                                    System.out.println("Employer id number is: " + x + ". " + possibleEmployees.get(x));
                                } else if (x == empolyer5) {
                                    if (possibleEmployees.get(x).isHired == true) {
                                        continue;
                                    }
                                    possibleEmployees.get(x).canBeHired = true;
                                    System.out.println("Employer id number is: " + x + ". " + possibleEmployees.get(x));
                                } else if (empolyer1 > 20 || empolyer2 > 20 || empolyer3 > 20 || empolyer4 > 20 || empolyer5 > 20) {
                                    continue;
                                } else if (empolyer1 >= 20 && empolyer2 >= 20 && empolyer3 >= 20 && empolyer4 >= 20 && empolyer5 >= 20) {
                                    System.out.println("There is ZERO empolyers to hire in this weekend");
                                }
                            }

                            System.out.println("\nIf u want to hire employee enter his id number. If You want to quit enter: 999.");
                            Integer employerNumber = scanner2.nextInt();
                            if (employerNumber == 999) {
                                break;
                            } else {
                                if (possibleEmployees.get(employerNumber).canBeHired == true) {
                                    System.out.println("\nYou have hired " + possibleEmployees.get(employerNumber).name + ".");
                                    possibleEmployees.get(employerNumber).isHired = true;
                                    hiredEmployees.add(possibleEmployees.get(employerNumber));
                                } else if (possibleEmployees.get(employerNumber).isHired == true) {
                                    System.out.println("\nPerson is already hired by You.");
                                } else {
                                    System.out.println("\nWrong employee's id.");
                                    break;
                                }
                            }
                        } else {
                            System.out.println("\nELSE SZUFFLE");
                            System.out.println(empolyer1);
                            System.out.println(empolyer2);
                            System.out.println(empolyer3);
                            System.out.println(empolyer4);
                            System.out.println(empolyer5);
                            Integer possibleEmployerCouinter = 0;
                            for (Integer x = 0; x < possibleEmployees.size(); x++) {
                                if (x == empolyer1) {
                                    if (possibleEmployees.get(x).isHired == true) {
                                        continue;
                                    }
                                    System.out.println("Employer id number is: " + x + ". " + possibleEmployees.get(x));
                                    possibleEmployerCouinter++;
                                } else if (x == empolyer2) {
                                    if (possibleEmployees.get(x).isHired == true) {
                                        continue;
                                    }
                                    System.out.println("Employer id number is: " + x + ". " + possibleEmployees.get(x));
                                    possibleEmployerCouinter++;
                                } else if (x == empolyer3) {
                                    if (possibleEmployees.get(x).isHired == true) {
                                        continue;
                                    }
                                    System.out.println("Employer id number is: " + x + ". " + possibleEmployees.get(x));
                                    possibleEmployerCouinter++;
                                } else if (x == empolyer4) {
                                    if (possibleEmployees.get(x).isHired == true) {
                                        continue;
                                    }
                                    System.out.println("Employer id number is: " + x + ". " + possibleEmployees.get(x));
                                    possibleEmployerCouinter++;
                                } else if (x == empolyer5) {
                                    if (possibleEmployees.get(x).isHired == true) {
                                        continue;
                                    }
                                    System.out.println("Employer id number is: " + x + ". " + possibleEmployees.get(x));
                                    possibleEmployerCouinter++;
                                }
                            }
                            if (possibleEmployerCouinter == 0) {
                                System.out.println("No more employers to hire in this weekend.");
                                break;
                            }
                            System.out.println("\nIf u want to hire employee enter his id number. If You want to quit enter: 999.");
                            Integer employerNumber = scanner2.nextInt();
                            if (employerNumber == 999) {
                                break;
                            } else {
                                if (possibleEmployees.get(employerNumber).canBeHired == true && possibleEmployees.get(employerNumber).isHired == false) {
                                    System.out.println("\nYou have hired " + possibleEmployees.get(employerNumber).name + ".");
                                    possibleEmployees.get(employerNumber).isHired = true;
                                    hiredEmployees.add(possibleEmployees.get(employerNumber));
                                } else if (possibleEmployees.get(employerNumber).isHired == true) {
                                    System.out.println("\nPerson is already hired by You.");
                                    break;
                                } else {
                                    System.out.println("\nWrong employee's id.");
                                    break;
                                }
                            }
                        }
                    }
                    break;

                    case 3: {
                        if ((damianGre.dayCounter == moduloMonday || (damianGre.dayCounter == 1 && firstDay == true)) && friendMondayShuffle == true) {
                            friendMondayShuffle = false;
                            firendSkills = random.nextInt(100) + 1;
                            System.out.println("Numer randomizera " + firendSkills);
                            if (firendSkills <= 30) {
                                for (Integer i = 0; i < friendEmployees.size()-3; i++) {
                                    if (i % 2 == 0) {
                                        System.out.println(friendEmployees.get(i));
                                    }else if(i % 3== 0){
                                        System.out.println(friendEmployees.get(i));
                                    }
                                }
                            } else if (firendSkills > 30 && firendSkills <= 60) {
                                for (Integer i = 3; i < friendEmployees.size()-3; i++) {
                                    if (i % 4 == 0) {
                                        System.out.println(friendEmployees.get(i));
                                    } else if (i % 3 == 0) {
                                        System.out.println(friendEmployees.get(i));
                                    }
                                }
                            } else if (firendSkills > 60 && firendSkills <= 100) {
                                for (Integer i = 6; i < friendEmployees.size(); i++) {
                                    if (i % 2 == 0) {
                                        System.out.println(friendEmployees.get(i));
                                    }else if(i % 3== 0){
                                        System.out.println(friendEmployees.get(i));
                                    }
                                }
                            }
                        } else {
                            System.out.println("JESTESMY W ELSE");
                            System.out.println("Numer randomizera" + firendSkills);
                            if (firendSkills <= 30) {
                                for (Integer i = 0; i < friendEmployees.size()-3; i++) {
                                    if (i % 2 == 0) {
                                        System.out.println(friendEmployees.get(i));
                                    }else if(i % 3== 0){
                                        System.out.println(friendEmployees.get(i));
                                    }
                                }
                            } else if (firendSkills > 30 && firendSkills <= 60) {
                                for (Integer i = 3; i < friendEmployees.size()-3; i++) {
                                    if (i % 4 == 0) {
                                        System.out.println(friendEmployees.get(i));
                                    } else if (i % 3 == 0) {
                                        System.out.println(friendEmployees.get(i));
                                    }
                                }
                            } else if (firendSkills > 60 && firendSkills <= 100) {
                                for (Integer i = 6; i < friendEmployees.size(); i++) {
                                    if (i % 2 == 0) {
                                        System.out.println(friendEmployees.get(i));
                                    }else if(i % 3== 0){
                                        System.out.println(friendEmployees.get(i));
                                    }
                                }
                            }
                        }
                    }
                    break;
                    case 4:
                        ;
                        break;
                    case 5:
                        // DODAC ZE JAK SA SAME NULL TO NIE MA EMPLOYES
                        // MOZE DODAC ZE ZMIENNA NOWA W EPOLOYE ZE BYL PRACOWNIK I JAK ROBIMY
                        // 5 case to wyswietla ze jest pracownikiem a jak nie to ze byl a nie null?
                        for (Integer x = 0; x < hiredEmployees.size(); x++) {
                            System.out.println("Employer id number is: " + x + ". " + hiredEmployees.get(x));
                        }
                        break;
                    case 6: {
                        Integer employersToFireCounter = 0;
                        Integer nullEmployersCounter = 0;
                        for (Integer x = 0; x < hiredEmployees.size(); x++) {
                            if (hiredEmployees.get(x) == null) {
                                nullEmployersCounter++;
                                continue;
                            } else if (hiredEmployees.get(x).dayToCanBeFired == 0) {
                                System.out.println("Employer id number is: " + x + ". " + hiredEmployees.get(x));
                                employersToFireCounter++;
                            }
                        }
                        if (employersToFireCounter == 0) {
                            System.out.println("No Employers to FIRE.");
                            break;
                        }
                        System.out.println("\nTo fire employer enter his id number. If You want to quit enter: 999.");
                        Integer employerNumberToFire = scanner3.nextInt();
                        if (employerNumberToFire == 999) {
                            break;
                        } else {
                            if (hiredEmployees.get(employerNumberToFire).isHired == true) {
                                System.out.println("\nYou have FIRED: " + hiredEmployees.get(employerNumberToFire).name + ".");
                                possibleEmployees.get(employerNumberToFire).isHired = false;
                                hiredEmployees.set(employerNumberToFire, null);
                            } else if (hiredEmployees.get(employerNumberToFire).isHired == false) {
                                System.out.println("\nPerson is not Your employer.");
                            } else {
                                System.out.println("\nWrong employee's id.");
                                break;
                            }
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
                        // WAZNE 3 TYDZIEN W PONIEDZIALEK SA 3 DNI NA RAZ sobota niedziala i poiniedzialek ogarnij te modulo
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
                            employerListIndexer++;
                            nextDayIsMonday = true;
                            employerSuffler = true;
                        }
                        if (moduloSunday > 0) {
                            if (damianGre.dayCounter % moduloSunday == 0) {
                                moduloSunday += 7;
                                employerListIndexer++;
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