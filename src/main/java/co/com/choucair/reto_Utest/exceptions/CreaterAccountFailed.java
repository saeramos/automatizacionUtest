package co.com.choucair.reto_Utest.exceptions;

@SuppressWarnings("Failure")
public class CreaterAccountFailed extends AssertionError {
    public CreaterAccountFailed() {
        super("The account creation process failed");
    }
}