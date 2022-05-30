package be.intecbrussel.anonymous;

public class App {
    public static void main(String[] args) {
        Employee anonymousEmployee = new Employee() {
            @Override
            public void doWork() {
                System.out.println("Axel turns the lights on.");
            }
        };

        anonymousEmployee.doWork();
    }
}
