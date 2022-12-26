import java.util.*;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();

        Boolean menuIsActive = true;
        Boolean newDay = false;

        Company damianGre = new Company("DamianGre");

        List<Project> projects = new ArrayList<Project>();

        //Projects to pickup by random generator
        //5 projects from 1 level complexity
        projects.add(new Project("Web app", Project.ProjectType.Frontend, null, null,
                "Heyos", 5, 20000.00, 7000.00, 5,
                1));
        projects.add(new Project("SPA", Project.ProjectType.Frontend, null, null,
                "Spasan", 3, 15000.00, 5000.00, 5,
                1));
        projects.add(new Project("Web app", Project.ProjectType.Frontend, Project.ProjectType.Backend, null,
                "Felinta", 3, 22000.00, 7000.00, 5,
                1));
        projects.add(new Project("Mobile App", Project.ProjectType.Frontend, Project.ProjectType.Wordpress, null,
                "Gagle", 3, 25000.00, 8000.00, 5,
                1));
        projects.add(new Project("Data Base", Project.ProjectType.Database, null, null,
                "Zawiru", 3, 17500.00, 8000.00, 5,
                1));


        List<Employees> possibleEmployees = new ArrayList<Employees>();

        possibleEmployees.add(new Employees("Damian"));
        possibleEmployees.add(new Employees("Tomasz"));
        possibleEmployees.add(new Employees("Karolina"));


        System.out.println(projects.get(0));
        System.out.println("Balance: " + damianGre.balance);
        damianGre.acceptProject(projects.get(0));
        System.out.println("Balance: " + damianGre.balance);




        Scanner scanner1 = new Scanner(System.in);

        do {

            if(newDay == true) {
                System.out.println("\nNEW DAY!");
                int robbery = random.nextInt(100) + 1; // szansa na kradzież przez JAROSŁAWA K. 10%
                if (robbery <= 10) //10% to get robbed
                {
                    System.out.println("\nROBBERY! JAROSŁAW K. HAS STEAL YOUR MONEY!\n");
                }
                newDay = false;
            }

            System.out.println("\nChoose Your action.\n" +
            "Enter '1' to check list of available work projects.\n" +
            "Enter '2' to check potential employees.\n" +
            "Enter '3' to check projects in progress.\n" +
            "Enter '4' to check your employees.\n" +
            "Enter '5' End day.\n" +
            "Enter '0' To end application!");

            int menuChoose = scanner1.nextInt();

            switch (menuChoose) {
                case 1:
                    for (Project project : projects) {
                        System.out.println(project);
                    }
                     break;
                case 2:
                    for(Employees employees: possibleEmployees){
                        System.out.println(employees);
                    }
                    break;
                case 3:
                    ;
                     break;
                case 4:
                    ;
                    break;
                case 5:{
                    System.out.println("Day has ended.\n");
                    try
                    {
                        for(int timer = 10; timer >= 0; timer--)
                        {
                        System.out.println("New day starts in: " + timer + " seconds."); //10 sekund przerwy do nastepnego dnia
                        TimeUnit.SECONDS.sleep(1);
                        }
                    }
                    catch(InterruptedException ex)
                    {
                        ex.printStackTrace();
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