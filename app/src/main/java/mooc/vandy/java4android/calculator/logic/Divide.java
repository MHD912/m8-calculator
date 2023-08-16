package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Divide operation.
 */
public class Divide implements OperationInterface
{
    /**
     * This variable stores the remainder of the latest division operation.
     */
    private int remainder;

    /**
     * Get the the remainder value of the latest division operation.
     * @return Integer remainder.
     */
    public int getRemainder()
    {
        return remainder;
    }

    @Override
    public int calculate(int argumentOne, int argumentTwo) throws ArithmeticException
    {
        remainder = argumentOne % argumentTwo;
        return argumentOne / argumentTwo;
    }

}
