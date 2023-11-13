package exception;

public class TestMyException {
    public static void main(String[] args) {
        System.out.println("Throw");
        try {
            TestException(true);
        } catch (MyException myException){
            System.out.format("MyException was caught: %s\n", myException.getMessage());
        }
        System.out.println("Not throw");
        try {
            TestException(false);
        } catch (MyException myException){
            System.out.format("MyException was caught: %s\n", myException.getMessage());
        }
    }

    public static void TestException(boolean shouldThrow) throws MyException{
        if(shouldThrow){
            throw new MyException("MyException message");
        } else {
            System.out.println("Exception wasn't thrown");
        }
    }
}
