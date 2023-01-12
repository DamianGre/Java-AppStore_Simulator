import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Employees {
    String name;
    Boolean frontEnd;
    Boolean backEnd;
    Boolean database;
    Boolean mobile;
    Boolean pretaShop;
    Boolean wordPress;
    Boolean canBeHired = false;
    Boolean isHired = false;
    Double dailySalary;
    Double projectSalary;
    Boolean isWorking;
    Integer dayToCanBeFired = 5; // only after 5 days employer can be fired
    Integer workingOnProjectDays;
    Integer failureChanace;
    public Employees(String name, Boolean frontEnd, Boolean backEnd, Boolean database, Boolean mobile, Boolean pretaShop, Boolean wordPress,Double dailySalary){
        this.name = name;
        this.frontEnd = frontEnd;
        this.backEnd = backEnd;
        this.database = database;
        this.mobile = mobile;
        this.pretaShop = pretaShop;
        this.wordPress = wordPress;
        this.dailySalary = dailySalary ;
    }


    public String toString(){
        return "Person's name: " + this.name + ". Known technologies(false=doesn't know the technology): " +"Front end- "+this.frontEnd +". Backend- " + this.backEnd+
                ". Database- "+ this.database +". Mobile- "+ this.mobile +". PretaShop- "+ this.pretaShop + ". Wordpress- "+ this.wordPress + ".";
    }
}
