public class Account {
    private AccountState accountState;
    public String accountNumber;
    public Double balance;

    public Account(String accountNumber, Double balance) {
        this.accountNumber = accountNumber;
        this.accountState = new ActivateState();
        this.balance = balance;
    }

    public AccountState getAccountState() {
        return accountState;
    }

    public void setAccountState(AccountState accountState) {
        this.accountState = accountState;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public Double getBalance(){
        return balance;
    }

    public void setBalance(Double balance){
        this.balance = balance;
    }

    public void activate(){
        this.accountState.activate(this);
    }

    public void suspend(){
        this.accountState.suspend(this);
    }

    public void close(){
        this.accountState.close(this);
    }

    public void deposit(double amount){
        this.accountState.deposit(this, amount);
    }
    
    public void withdraw(double amount){
        this.accountState.withdraw(this, amount);
    }

    public void to_String(){
        System.out.println(getAccountNumber());
        System.out.println(getBalance());
    }

}
