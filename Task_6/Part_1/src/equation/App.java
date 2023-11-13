package equation;

public class App {
    public static void main(String[] args) {
        demoQuadraticEquation();
    }

    public static void demoQuadraticEquation() {
        QuadraticEquation equation1 = new QuadraticEquation(1, 2, 1);
        QuadraticEquation equation2 = new QuadraticEquation(0, 3, 5);
        QuadraticEquation equation3 = new QuadraticEquation(2, 0, 0);
        QuadraticEquation equation4 = new QuadraticEquation(0, 0, 0);
        QuadraticEquation equation5 = new QuadraticEquation(0, 0, 7);

        QuadraticEquation[] equations = {equation1, equation2, equation3, equation4, equation5};

        for (QuadraticEquation equation : equations) {
            System.out.println("Equation: " + equation);
            System.out.println("Is Quadratic? " + equation.isQuadratic());
            System.out.println();
        }
    }
}
