package pl.code.house.recruiting.java;

public class Exception_InCatch {
    public static void main(String... args) {
        try {
            doSth();
        } catch (ExceptionOne exc) {
            System.out.println(" Exception catch: " + exc.getMessage());
        } catch (RuntimeException exc) {
            System.out.println(" Exception catch: " + exc.getMessage());
            System.out.println(" Throwing Exception_one");
            throw new ExceptionOne();
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