package exception;

public class First {

    public static void main(String[] args) {
        try {
            divideByZero();
        } catch (ArithmeticException exception) {
            System.out.format("ArithmeticException was caught\n\tMessage: %s\n", exception.getMessage());
        }
        try {
            accessToUnexistingElement();
        } catch (ArrayIndexOutOfBoundsException exception){
            System.out.format("ArrayIndexOutOfBoundsException was caught\n\tMessage: %s\n", exception.getMessage());
        }

        playWithNullPointer(); // Не бросает исключение

        try {
            tryToCreateFunnyArray();
        } catch (NegativeArraySizeException exception){
            System.out.format("NegativeArraySizeException was caught\n\tMessage: %s\n", exception.getMessage());
        }
        try {
            searchSomethingOutString();
        } catch (StringIndexOutOfBoundsException exception){
            System.out.format("StringIndexOutOfBoundsException was caught\n\tMessage: %s\n", exception.getMessage());
        }

        System.out.println("Ура! Меня снова печатают");
    }


    public static void divideByZero() {
        int a = 777 / (666 - 666);
    }

    public static void accessToUnexistingElement(){
        int[] arr = {1,2,3,4,5,6,7};
        for (int i = 0; i < arr.length+1; i++) {
            System.out.printf("%d,", arr[i]);
        }
    }

    public static void playWithNullPointer() {
        String importantData = null;
        System.out.println("important is " + importantData);
    }

    public static void tryToCreateFunnyArray() {
        int i[] = new int[-5];
    }

    public static void searchSomethingOutString() {
        String secret = "Пин-код от карты: 123";
        secret.charAt(22);
    }

}
