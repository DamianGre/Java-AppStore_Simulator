public class Employees {
    String name;
    Boolean frontEnd;
    Boolean backEnd;
    Boolean database;
    Boolean mobile;
    Boolean pretaShop;
    Boolean wordPress;
    Double monthlySalary;
    Double projectSalary;
    Boolean isWorking;
    Integer workingOnProjectDays;
    Integer failureChanace;
    public Employees(String name, Boolean frontEnd, Boolean backEnd, Boolean database, Boolean mobile, Boolean pretaShop, Boolean wordPress,Double monthlySalary){
        this.name = name;
        this.frontEnd = frontEnd;
        this.backEnd = backEnd;
        this.database = database;
        this.mobile = mobile;
        this.pretaShop = pretaShop;
        this.wordPress = wordPress;
        this.monthlySalary = monthlySalary ;
    }

    public String toString(){
        return "Person's name: " + this.name + ". Known technologies(false=doesn't know the technology): " +"Front end- "+this.frontEnd +". Backend- " + this.backEnd+
                ". Database- "+ this.database +". Mobile- "+ this.mobile +". PretaShop- "+ this.pretaShop + ". Wordpress- "+ this.wordPress + ".";
    }
}
