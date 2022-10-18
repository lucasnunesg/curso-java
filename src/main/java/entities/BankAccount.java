package entities;

public class BankAccount{
    private final int number;
    private String name;
    private double amount;


    public BankAccount(int number, String name, double initial_deposit){
        this.number = number;
        this.name = name;
        makeDeposit(initial_deposit);
        }


    public BankAccount(int number, String name){
        this.number = number;
        this.name = name;
        this.amount = 0;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void makeDeposit(double depositValue){
        this.amount += depositValue;
    }

    public void makeWithdraw(double withdrawValue){
        this.amount -= (withdrawValue + 5);
    }

    public String toString(){
        return "Account: "
                + this.number
                + ", "
                + "Holder: "
                + this.name
                + ", Balance: $ "
                + String.format("%.2f", this.amount);
    }
}

