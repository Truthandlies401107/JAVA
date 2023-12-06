    public class NumericMultiplication {
        double num1;
        int num2;
        float num3;
        public NumericMultiplication(double num1, int num2, float num3) {
            num1 = num1;
            num2 = num2;
            num3 = num3;
        }
        public int performMultiplication() {
            double result = num1 * num2 * num3;
            return (int) result;
        }
        public static void main(String[] args) {
            NumericMultiplication numericMultiplier = new NumericMultiplication(2.5, 3, 1.5f);
            int multiplicationResult = numericMultiplier.performMultiplication();
            System.out.println("Result of multiplication: " + multiplicationResult);
        }
    }
