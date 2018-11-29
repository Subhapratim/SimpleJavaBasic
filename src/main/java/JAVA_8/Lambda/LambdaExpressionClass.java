package JAVA_8.Lambda;

public class LambdaExpressionClass {
    public void lambdaMethod() {
        //void method interface
        GreetingService greetingService = (message) ->
                System.out.println("Hello " + message);

        greetingService.sayHello("World.");




        //int method interface
        Calculation add = (a, b) -> (a + b);
        Calculation sub = (a, b) -> (a - b);

        System.out.println("The addition ( 2 + 3 ) is "+add.operation(2,3));
        System.out.println("The addition ( 3 - 2 ) is "+sub.operation(3,2));




        LambdaExpressionClass lambda = new LambdaExpressionClass();

        //with type declaration
        Calculation addition = (int a, int b) -> a + b;
        //with out type declaration
        Calculation subtraction = (a, b) -> a - b;
        //with return statement along with curly braces
        Calculation multiplication = (int a, int b) -> { return a * b; };
        //without return statement and without curly braces
        Calculation division = (int a, int b) -> a / b;

        System.out.println("10 + 5 = " + lambda.operate(10, 5, addition));
        System.out.println("10 - 5 = " + lambda.operate(10, 5, subtraction));
        System.out.println("10 x 5 = " + lambda.operate(10, 5, multiplication));
        System.out.println("10 / 5 = " + lambda.operate(10, 5, division));
    }

    private int operate(int a, int b, Calculation calculation) {
        return calculation.operation(a, b);
    }
}
