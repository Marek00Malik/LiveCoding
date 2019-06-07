package pl.code.house.recruiting.java;

class ExceptionOne extends RuntimeException {
    ExceptionOne() {
        super("Exception_one");
    }

    ExceptionOne(String cause) {
        super(cause);
    }
}
