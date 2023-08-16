package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Subtract operation.
 */
public class Subtract implements OperationInterface
{
    @Override
    public int calculate(int argumentOne, int argumentTwo)
    {
        return argumentOne - argumentTwo;
    }
}
