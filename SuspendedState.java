public class SuspendedState implements AccountState{

    @Override
    public void deposit(Account account, double amount) {
        System.out.println( "You cannot deposit on suspended account!");
        account.to_String();
    }

    @Override
    public void withdraw(Account account, double amount) {
        System.out.println( "You cannot withdraw on a suspended account!");
        account.to_String();
    }

    @Override
    public void activate(Account account) {
        System.out.println("Account is activated");
        account.setAccountState(new ActivateState());
    }

    @Override
    public void suspend(Account account) {
       System.out.println("Account is already suspended");
    }

    @Override
    public void close(Account account) {
        System.out.println("Account is closed");
        account.setAccountState(new ClosedState());
    }

   


}
