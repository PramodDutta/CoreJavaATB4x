package sept.sept30.customExp;

public class CustomEx {
    public static void main(String[] args) throws InsufficientFundsException {
        BankAccount jp = new BankAccount(100);
        jp.withdraw(120);
        jp.printBalance();

    }
}

class InsufficientFundsException extends Exception{
    public InsufficientFundsException(){
        super();
    }
    public InsufficientFundsException(String message){
        super(message);
    }

}


class BankAccount{
    private double balance;

    public BankAccount(double balance){
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if(balance < amount){
            throw new InsufficientFundsException("You don't have balance");
        }
        balance -= amount;
    }
    public void printBalance(){
        System.out.println(this.balance);
    }
}