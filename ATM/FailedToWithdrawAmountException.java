package ATM;

public class FailedToWithdrawAmountException extends RuntimeException
{
    public FailedToWithdrawAmountException(String message)
    {
        super(message);
    }
}
