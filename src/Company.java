public class Company {

    String companyName;
    String companyOffice;
    String clientName;
    Double balance = 10000.00; //10k $ at start

    Integer workersNumber = 0;
    Integer clients = 0;

    public Company(String companyName){
        this.companyName = companyName;
    }

    public String toString(){
        return "Company's name: " + companyName + " Company's balance: " + balance +
                " Numbers of company workers" + workersNumber + " Company clients numbers: " + clients;
    }
}
