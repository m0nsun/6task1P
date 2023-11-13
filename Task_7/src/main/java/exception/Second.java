package exception;

public class Second {

    public static void main(String[] args) {
        // Correct
        System.out.println("Correct function calls:");
        ValidateTenSymbolMax("Hello1");
        ValidateNotContainA("Hello2");
        ValidateOnlyPositiveNumbers(123);

        //Incorrect
        System.out.println("Incorrect function calls:");
        try {
            ValidateTenSymbolMax("Hello1___________");
        } catch (IllegalArgumentException exception){
            System.out.format("IllegalArgumentException was caught\n\tMessage: %s\n", exception.getMessage());
        }
        try {
            ValidateNotContainA("Hello1_A");
        } catch (IllegalArgumentException exception){
            System.out.format("IllegalArgumentException was caught\n\tMessage: %s\n", exception.getMessage());
        }
        try {
            ValidateOnlyPositiveNumbers(-1);
        } catch (IllegalArgumentException exception){
            System.out.format("IllegalArgumentException was caught\n\tMessage: %s\n", exception.getMessage());
        }
    }

    public static void ValidateTenSymbolMax(String string){
        if (string.length() > 10){
            throw new IllegalArgumentException("String must be less or even 10 symbols");
        };
        System.out.format("String is fine: %s\n", string);
    }

    public static void ValidateNotContainA(String string){
        if(string.contains("A")){
            throw new IllegalArgumentException("String must not keep symbol \"A\"");
        }
        System.out.format("String is fine: %s\n", string);
    }

    public static void ValidateOnlyPositiveNumbers(int integer){
        if(integer < 0){
            throw new IllegalArgumentException("Number must be positive");
        }
        System.out.format("Integer is fine: %d\n", integer);
    }
}
