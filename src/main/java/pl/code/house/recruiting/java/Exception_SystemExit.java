package pl.code.house.recruiting.java;

public class Exception_SystemExit {
    public static void main(String[] args) {
        try {
            doSth();
        } catch (RuntimeException exc) {
            System.out.println(" Exception catch: " + exc.getMessage());
            System.exit(1);
        } finally {
            System.out.println("Finally was called");
        }
    }

    private static void doSth() {
        throw new ExceptionTwo();
    }

    private static class ExceptionTwo extends ExceptionOne {
        ExceptionTwo() {
            super("ExceptionTwo");
        }
    }
}
