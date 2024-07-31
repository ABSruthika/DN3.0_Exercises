public class FinancialForecasting {

    // Recursive Method to Calculate Future Value
    public static double calculateFutureValue(double presentValue, double rate, int periods) {
        if (periods == 0) {
            return presentValue;
        }
        return calculateFutureValue(presentValue * (1 + rate), rate, periods - 1);
    }
}
/*Recursive Algorithm Time Complexity: Depends on recursion depth.
Optimize using memoization or iterative methods to avoid excessive computation.*/