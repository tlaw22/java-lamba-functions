public class App {
    public static void main(String[] args) throws Exception {
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

        System.out.println("================================================");
        walker(() -> {
            System.out.println("Customer object...");
            System.out.println("The next line.");
            System.out.println("Even more lines.");

        });
        // This is an example of a lambda expression.
        // Called an anonomous class definition in other languages.
    }

    public static void walker(Walkable WalkableEntity) {
        WalkableEntity.walk();
    }
}
