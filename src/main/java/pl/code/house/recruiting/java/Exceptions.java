package pl.code.house.recruiting.java;

public class Exceptions {
    public static void main(String... args) {
//        try {
//            doSth();
//        } catch (Exception_one exc) {
//            System.out.println(" Exception catch: " + exc.getMessage());
//        } catch (RuntimeException exc) {
//            System.out.println(" Exception catch: " + exc.getMessage());
//            System.out.println(" Throwing Exception_one");
//            throw new Exception_one();
//        } finally {
//            System.out.println("Finally was called");
//        }

//        try {
//            doSth();
//        } catch (RuntimeException exc) {
//            System.out.println(" Exception catch: " + exc.getMessage());
//            System.exit(1);
//        } finally {
//            System.out.println("Finally was called");
//        }
    }

    private static void doSth() {
        throw new Exception_two();
    }
}

class Exception_one extends RuntimeException {
    Exception_one() {
        super("Exception_one");
    }

    Exception_one(String cause) {
        super(cause);

    }
}

class Exception_two extends Exception_one {
    Exception_two() {
        super("Exception_two");
    }
}
