public class App {
    public static void main(String[] args) throws Exception {
        String divider = ("=================================");
        Robot wale = new Robot();
        Human tom = new Human();

        walker(tom);
        walker(wale);
        walker(() -> System.out.println("Hello World!"));

        // walker(new Walkable() {

        // @Override
        // public void walk() {
        // System.out.println("Customer object walking");
        // throw new UnsupportedOperationException("Unimplemented method 'walk'");
        // }

        // });
        // }
        LambdaClass walker2 = () -> {
            System.out.println("Customer object...");
            System.out.println("The next line.");
            System.out.println("Even more lines.");
        };
        walker2.someMethod();

        System.out.println(divider);
        walker(() -> {
            System.out.println("Customer object...");
            System.out.println("The next line.");
            System.out.println("Even more lines.");

        });
        // This is an example of a lambda expression.
        // Called an anonomous class definition in other languages.

        Calculator calc = (int a, int b) -> a + b;
        System.out.println(calc.calculate(10, 15));
        System.out.println(divider);
        Calculator nonZeroDivider = (a, b) -> {
            if (a == 0) {
                return 0;
            }
            return a / b;
        };
        System.out.println(nonZeroDivider.calculate(15, 10));
        System.out.println(divider);

        StringWorker<String> reverser = (s) -> {
            String result = "";
            for (int i = s.length() - 1; i >= 0; i--) {
                result += s.charAt(i);
            }
            return result;
        };

        System.out.println(reverser.work("TimothyLawless"));
        System.out.println(divider);

        CNum MyNumber = (n) -> {

            int result = 1;
            for (int i = 1; i <= n; i++) {
                result = i * result;
            }
            return result;
        };
        System.out.println(MyNumber.numworker(10));

    }

    public static void walker(Walkable WalkableEntity) {
        WalkableEntity.walk();
    }
}

interface Calculator {
    public int calculate(int a, int b);
}

interface CNum {
    public int numworker(int a);
}
// Inserting the <T> argument allows us to insert data type when calling a lambda expression.
interface StringWorker<T> {
    public T work(T str);
};
