package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Multiply operation.
 */
public class Multiply implements OperationInterface {
    @Override
    public int calculate(int argumentOne, int argumentTwo) {
        return argumentOne * argumentTwo;
    }
}
