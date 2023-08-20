package mooc.vandy.java4android.calculator.logic;

import mooc.vandy.java4android.calculator.ui.ActivityInterface;

/**
 * Performs an operation selected by the user.
 */
public class Logic implements LogicInterface
{
    /**
     * Reference to the Activity output.
     */
    protected ActivityInterface mOut;

    /**
     * Constructor initializes the field.
     */
    public Logic(ActivityInterface out)
    {
        mOut = out;

    }

    /**
     * Define final data members for each operation
     */
    private final int ADD = 1;
    private final int SUBTRACT = 2;
    private final int MULTIPLY = 3;
    private final int DIVIDE = 4;

    /**
     * Perform the operation on argumentOne and argumentTwo.
     */
    public void process(int argumentOne, int argumentTwo, int operation)
    {
        switch (operation)
        {
            case (ADD):
                Add addObj = new Add();
                mOut.print(String.valueOf(addObj.calculate(argumentOne, argumentTwo)));
                break;
            case (SUBTRACT):
                Subtract subObj = new Subtract();
                mOut.print(String.valueOf(subObj.calculate(argumentOne, argumentTwo)));
                break;
            case (MULTIPLY):
                Multiply mulObj = new Multiply();
                mOut.print(String.valueOf(mulObj.calculate(argumentOne, argumentTwo)));
                break;
            case (DIVIDE):
                Divide divObj = new Divide();
                // Catch exception that comes from dividing by zero
                try
                {
                    mOut.print(divObj.calculate(argumentOne, argumentTwo) + " R: " + divObj.getRemainder());
                } catch (ArithmeticException exp)
                {
                    mOut.print("Dividing by zero is not possible.");
                }
                break;
            default:
                mOut.print("Error - Bad operation code!!");
        }
    }
}
