package mooc.vandy.java4android.calculator.logic;

public interface OperationInterface {
    /**
     * Perform calculations for mathematical operation classes.
     * @param argumentOne First argument in the mathematical expression.
     * @param argumentTwo Second argument in the mathematical expression.
     * @return the result of the mathematical expression.
     */
    int calculate(int argumentOne, int argumentTwo);
}
