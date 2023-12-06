class IntegerAdder {
    int num1;
    int num2;
    int sum;
    public IntegerAdder(int number1, int number2) {
        num1 = number1;
        num2 = number2;
        sum = num1 + num2;
    }
    public int getSum() {
        return sum;
    }
}
public class AddTwoIntegers {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        IntegerAdder adder = new IntegerAdder(a, b);
        System.out.println("Sum of " + a + " and " + b + " is: " + adder.getSum());
    }
}
