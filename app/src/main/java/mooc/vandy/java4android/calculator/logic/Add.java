package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Add operation.
 */
public class Add implements OperationInterface
{
    @Override
    public int calculate(int argumentOne, int argumentTwo)
    {
        return argumentOne + argumentTwo;
    }
}
